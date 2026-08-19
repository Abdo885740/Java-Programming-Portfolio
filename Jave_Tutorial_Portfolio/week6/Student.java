public class Student {
    private String name;
    private int id;
    private double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public double getGpa() { return gpa; }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("GPA: " + gpa);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Ahmed Ali", 2024001, 3.8);
        student1.displayInfo();
    }
}