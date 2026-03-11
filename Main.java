import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Company company = new Company();

        company.load();

        while (true) {

            System.out.println("\n===== COMPANY SYSTEM =====");

            System.out.println("1 Add Developer");
            System.out.println("2 Add Manager");
            System.out.println("3 Add HR");
            System.out.println("4 Display Employees");
            System.out.println("5 Remove Employee");
            System.out.println("6 Update Employee");
            System.out.println("7 Sort by Salary");
            System.out.println("8 Department Employees");
            System.out.println("9 Rate Employee");
            System.out.println("10 Process Salary (Thread)");
            System.out.println("11 Save & Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Department: ");
                    String dept = sc.nextLine();

                    System.out.print("Language: ");
                    String lang = sc.nextLine();

                    company.addEmployee(
                            new Developer(name, salary, dept, lang));

                    break;

                case 2:

                    System.out.print("Name: ");
                    name = sc.nextLine();

                    System.out.print("Salary: ");
                    salary = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Department: ");
                    dept = sc.nextLine();

                    System.out.print("Team Size: ");
                    int team = sc.nextInt();

                    company.addEmployee(
                            new Manager(name, salary, dept, team));

                    break;

                case 3:

                    System.out.print("Name: ");
                    name = sc.nextLine();

                    System.out.print("Salary: ");
                    salary = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Department: ");
                    dept = sc.nextLine();

                    company.addEmployee(
                            new HR(name, salary, dept));

                    break;

                case 4:
                    company.displayAll();
                    break;

                case 5:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    company.removeEmployee(id);

                    break;

                case 6:

                    System.out.print("Enter ID: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("New Department: ");
                    String newDept = sc.nextLine();

                    company.updateEmployee(id, newName, newDept);

                    break;

                case 7:
                    company.sortBySalary();
                    break;

                case 8:

                    System.out.print("Department: ");
                    String d = sc.nextLine();

                    company.showDepartmentEmployees(d);

                    break;

                case 9:

                    System.out.print("Employee ID: ");
                    id = sc.nextInt();

                    System.out.print("Rating (1-5): ");
                    int rating = sc.nextInt();

                    company.rateEmployee(id, rating);

                    break;

                case 10:
                    company.processSalaryIncrement();
                    break;

                case 11:

                    company.save();

                    System.exit(0);
            }
        }
    }
}