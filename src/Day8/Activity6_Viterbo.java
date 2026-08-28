package Day8;

import java.util.Scanner;

public class Activity6_Viterbo {
    static void main(String[] args) {
        int maxAttempts = 3;
        Scanner scanner = new Scanner(System.in);
        String email = "winter@gmail.com";
        String password = "winter123";
        boolean isLoggedIn = false;

        for(int i = 1; i <= maxAttempts; i++){
            System.out.println("Enter email :");
            String loginEmail = scanner.nextLine();

            System.out.println("Enter password: ");
            String loginPassword = scanner.nextLine();

            if(loginEmail.equals(email)){
                if(loginPassword.equals(password)){
                    System.out.println("Login Successful!");
                    isLoggedIn = true;
                }else{
                    System.out.println("Invalid password.");
                }
            }else{
                System.out.println("Invalid email.");
            }
            if(isLoggedIn){
                break;
            }
            if (i == maxAttempts){
                System.out.println("Max attempts reached. Program will now close.");
            }
        }
    }
}
