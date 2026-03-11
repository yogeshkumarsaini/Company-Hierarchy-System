import java.util.*;
import java.io.*;

public class Company {

    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void displayAll() {

        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        for (Employee e : employees) {

            System.out.println("---------------------");
            e.display();
        }
    }

    public Employee findById(int id) {

        for (Employee e : employees) {

            if (e.getId() == id)
                return e;
        }

        return null;
    }

    public void removeEmployee(int id) {

        Iterator<Employee> it = employees.iterator();

        while (it.hasNext()) {

            Employee e = it.next();

            if (e.getId() == id) {

                it.remove();
                System.out.println("Employee removed.");
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    public void updateEmployee(int id, String name, String dept) {

        Employee e = findById(id);

        if (e != null) {

            e.name = name;
            e.department = dept;

            System.out.println("Employee updated.");
        } else
            System.out.println("Employee not found.");
    }

    public void sortBySalary() {

        employees.sort((a, b) -> Double.compare(b.getSalary(), a.getSalary()));

        System.out.println("Employees sorted by salary.");
    }

    public void showDepartmentEmployees(String dept) {

        for (Employee e : employees) {

            if (e.department.equalsIgnoreCase(dept)) {

                System.out.println("-------------------");
                e.display();
            }
        }
    }

    public void rateEmployee(int id, int rating) {

        Employee e = findById(id);

        if (e != null) {

            e.setRating(rating);
            System.out.println("Rating updated.");
        }
    }

    public void processSalaryIncrement() {

        Thread t = new Thread(() -> {

            for (Employee e : employees) {

                if (e.getRating() >= 4)
                    e.increaseSalary(10);
                else
                    e.increaseSalary(5);
            }

            System.out.println("Salary processed using thread.");
        });

        t.start();
    }

    public void save() {

        try {

            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream("employees.dat"));

            out.writeObject(employees);

            out.close();

            System.out.println("Data saved.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void load() {

        try {

            ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream("employees.dat"));

            employees = (ArrayList<Employee>) in.readObject();

            in.close();

        } catch (Exception e) {

            System.out.println("No saved data.");
        }
    }
}