package Day7;

import java.util.Scanner;

public class Activity5_Viterbo {
    static void main(String[] args) {
        double balance = 5000.00;
        int choice;
        double depositAmount;
        double withdrawAmount;
        Scanner sc = new Scanner(System.in);
        String menu = " === ATM MENU === \n1 - Check Balance\n2 - Deposit\n3 - Withdraw\n4 - Exit\nEnter Transaction: ";
        boolean isDone = false;


        while(!isDone){
            System.out.println(menu);
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Your balance is: " + balance);
                    break;

                case 2:
                    System.out.println("Enter amount: ");
                    depositAmount = sc.nextDouble();
                    if(depositAmount > 0){
                        balance += depositAmount;
                        System.out.println("Deposit Successful! Your new balance is :" + balance);
                        break;
                    }else{
                        System.out.println("Invalid input!");
                        break;
                    }

                case 3:
                    System.out.println("Enter amount: ");
                    withdrawAmount = sc.nextDouble();
                    if(withdrawAmount > 0){
                        if(balance >= withdrawAmount){
                            balance -= withdrawAmount;
                            System.out.println("Withdraw Successful! Your balance is: " + balance);
                            break;
                        }else{
                            System.out.println("Insufficient balance. Your current balance is: " + balance);
                            break;
                        }
                    }else{
                        System.out.println("Invalid input!");
                        break;
                    }

                case 4:
                    System.out.println("Thank you for using ATM. Goodbye.");
                    isDone = true;
                    break;

                default:
                    System.out.println("Please enter a valid choice.");
            }
        }

    }
}
