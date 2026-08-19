public class MethodDemo {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void displayMessage(String msg) {
        System.out.println("Message: " + msg);
    }

    public static void main(String[] args) {
        int sum = add(10, 20);
        int product = multiply(5, 6);
        
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        
        displayMessage("Java methods are powerful!");
    }
}