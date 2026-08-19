public class ControlStatements {
    public static void main(String[] args) {
        System.out.println("--- If-Else Statement ---");
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }

        System.out.println("\n--- For Loop ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        System.out.println("\n--- While Loop ---");
        int count = 0;
        while (count < 3) {
            System.out.println("Count is: " + count);
            count++;
        }
        
        System.out.println("\n--- Switch Statement ---");
        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Other day");
        }
    }
}