package Day9;

import java.util.Scanner;

public class Activity7_Viterbo {
    static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to multiply: ");
        number = sc.nextInt();

        for(int i = number; i <= number; i++){
            System.out.println("Multiplication of " + i);
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }
    }
}
