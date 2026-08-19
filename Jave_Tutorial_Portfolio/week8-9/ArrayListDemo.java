import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<String>();
        
        courses.add("Java Programming");
        courses.add("Data Structures");
        courses.add("Database Systems");
        courses.add("Web Development");
        
        System.out.println("--- Course List ---");
        for (String course : courses) {
            System.out.println("- " + course);
        }
        
        System.out.println("\nNumber of courses: " + courses.size());
        
        courses.remove("Database Systems");
        System.out.println("\nAfter removing one course:");
        for (String course : courses) {
            System.out.println("- " + course);
        }
        
        boolean hasJava = courses.contains("Java Programming");
        System.out.println("\nContains Java Programming? " + hasJava);
    }
}