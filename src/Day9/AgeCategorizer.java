package Day9;

import java.util.Scanner;

public class AgeCategorizer {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Code Minization for getting the range
        // Validation

        // Age: 0 - 120
        String again = "";
        do {
            System.out.println("--- Age Categorizer ---");
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age >= 0 && age <= 120) { // Validation
                if (age <= 2) { // 0 - 2
                    System.out.println("Category: Baby");
                } else if (age <= 12) { // 3 - 12
                    System.out.println("Category: Child");
                } else if ( age <= 19) {
                    System.out.println("Category: Teenager");
                } else if (age <= 39) {
                    System.out.println("Category: Young Adult");
                } else if (age <= 59){
                    System.out.println("Category: Middle-Aged Adult");
                } else {
                    System.out.println("Category: Senior");
                }
            } else {
                System.out.println("Invalid Age! Age must be between 0 and 120");
            }

            System.out.print("\n Check another age? (y/n): ");
            again = sc.nextLine();
        } while (again.equalsIgnoreCase("y"));

        System.out.println("Program ended.");
    }
}
