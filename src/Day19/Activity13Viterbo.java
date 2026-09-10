package Day19;

import java.util.Scanner;

public class Activity13Viterbo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName;
        String middleName;
        String lastName;
        String address;
        String email;
        String password;

        System.out.println(" ** User Registration ** ");
        System.out.println("Enter first name: ");
        firstName = sc.nextLine();
        System.out.println("Enter middle name: ");
        middleName = sc.nextLine();
        System.out.println("Enter last name: ");
        lastName = sc.nextLine();
        System.out.println("Enter address: ");
        address = sc.nextLine();
        System.out.println("Enter email: ");
        email = sc.nextLine();
        System.out.println("Enter first password: ");
        password = sc.nextLine();

        UserAccount ua = new UserAccount(firstName,middleName,lastName,address,email,password);


    }
}
