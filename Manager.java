public class Manager extends Employee {

    private int teamSize;

    public Manager(String name, double salary, String department, int teamSize) {

        super(name, salary, department);
        this.teamSize = teamSize;
    }

    @Override
       public void display() {

        super.display();
        System.out.println("Role: Manager");
        System.out.println("Team Size: " + teamSize);
    }
}