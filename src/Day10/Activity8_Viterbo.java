package Day10;

import java.util.Scanner;

public class Activity8_Viterbo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int index = 0;
        int sum = 0;
        int avg;
        int lowest = 0;
        int highest = 0;

        for(int num : arr){
            System.out.println("Enter a number: ");
            arr[index] = sc.nextInt();
            sum += arr[index];
            index++;
        }
        System.out.println("You entered numbers: ");
        index = 0;
        avg = sum / 5;
        for(int num : arr){
            System.out.println(arr[index]);
            index++;
        }
        index = 0;
        for(int num : arr){
            if(index >= 1) {
                if (arr[index] > lowest){
                    lowest = arr[index];
                }
                if (arr[index] < highest){
                    highest = arr[index];
                }
            }else{
                lowest = arr[index];
            }
            index++;
        }
        System.out.println("Average is of the numbers are: " + avg );
        System.out.println("Highest number is: " + highest);
        System.out.println("Lowest number is: " + lowest);

    }
}
