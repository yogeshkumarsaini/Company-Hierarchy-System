public class Developer extends Employee {

    private String language;

    public Developer(String name, double salary, String department, String language) {

        super(name, salary, department);
        this.language = language;
    }

    @Override
    public void display() {

        super.display();
        System.out.println("Role: Developer");
        System.out.println("Language: " + language);
    }
}