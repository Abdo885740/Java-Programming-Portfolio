import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter numerator: ");
            int num = scanner.nextInt();
            
            System.out.print("Enter denominator: ");
            int den = scanner.nextInt();
            
            int result = num / den;
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (Exception e) {
            System.out.println("Error: Invalid input! Please enter numbers.");
        } finally {
            System.out.println("Thank you for using the calculator.");
            scanner.close();
        }
    }
}