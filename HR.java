public class HR extends Employee {

    public HR(String name, double salary, String department) {

        super(name, salary, department);
    }

    @Override
    public void display() {

        super.display();
        System.out.println("Role: HR");
    }
}