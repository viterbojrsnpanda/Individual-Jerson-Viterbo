package Day6;

import java.util.Scanner;

public class Activity4_Switch_Viterbo {
    static void main(String[] args) {
        String menu = "=== Student Portal Menu ===\n1. ViewGrades\n2. Enroll Subjects\n3. Pay Tuition\n4. Exit\nEnter your choice (1-4): ";
        boolean isFinished = true;
        Scanner scanner = new Scanner(System.in);
        int choice;
        int terminateCounter = 1;

        System.out.println(menu);

        do{
            choice = scanner.nextInt();
            switch(choice){
                case 1 :
                    System.out.println("You selected Option 1: View Grades");
                    isFinished = false;
                    break;
                case 2 :
                    System.out.println("You selected Option 2: Enroll Subjects");
                    isFinished = false;
                    break;
                case 3:
                    System.out.println("You selected Option 3: Pay Tuition");
                    isFinished = false;
                    break;
                case 4:
                    System.out.println("You selected Option 4: Exit");
                    isFinished = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    if(terminateCounter >= 3){
                        System.out.println("Too much incorrect choice. Program will now end");
                        isFinished = false;
                        break;
                    }
                    terminateCounter++;
            }
        }while(isFinished);
    }
}
