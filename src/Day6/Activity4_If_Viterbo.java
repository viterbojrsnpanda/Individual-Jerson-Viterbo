package Day6;

import java.util.Scanner;

public class Activity4_If_Viterbo {
    static void main(String[] args) {
        String menu = "=== Main Menu ===\n1. Start Game\n2. Load Game\n3. Settings\n4. Exit\nEnter your choice (1-4): ";
        boolean isFinished = true;
        Scanner scanner = new Scanner(System.in);
        int choice;
        int terminateCounter = 1;

        System.out.println(menu);

        do{
            choice = scanner.nextInt();
            if(choice == 1){
                System.out.println("You selected Option 1: Start Game");
                isFinished = false;
            } else if (choice == 2) {
                System.out.println("You selected Option 2: Load Game");
                isFinished = false;
            }else if (choice == 3) {
                System.out.println("You selected Option 3: Settings");
                isFinished = false;
            }else if (choice == 4) {
                System.out.println("You selected Option 4: Exit");
                isFinished = false;
            }else{
                System.out.println("Invalid choice. Please try again.");
                if(terminateCounter >= 3){
                    System.out.println("Too much incorrect choice. Program will now end");
                    isFinished = false;
                }
                terminateCounter++;
            }
        }while(isFinished);
    }
}
