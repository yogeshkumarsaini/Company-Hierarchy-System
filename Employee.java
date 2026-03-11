import java.io.Serializable;

public class Employee implements Serializable {

    private static int counter = 1000;

    protected int id;
    protected String name;
    protected double salary;
    protected String department;
    protected int rating;

    public Employee(String name, double salary, String department) {

        this.id = counter++;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.rating = 3;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void increaseSalary(double percent) {
        salary += salary * percent / 100;
    }

    public void display() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Rating: " + rating);
    }
}