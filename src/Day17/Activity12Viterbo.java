package Day17;

import javax.naming.Name;
import java.lang.classfile.attribute.SourceDebugExtensionAttribute;
import java.util.Random;
import java.util.Scanner;

public class Activity12Viterbo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select a method: ");
        System.out.println("[ 1 ] - Odd or Even");
        System.out.println("[ 2 ] - Print 50 times");
        System.out.println("[ 3 ] - Square root");
        System.out.println("[ 4 ] - Find the Power");
        System.out.println("[ 5 ] - Print random number between 1 - 100");
        System.out.println("[ 6 ] - Find area of circle");
        System.out.println("[ 7 ] - Are you a voter?");
        System.out.println("[ 8 ] - Length of the word");
        System.out.println("[ 9 ] - Reverse the word");
        System.out.println("[ 0 ] - Print Name and age");
        System.out.println("Enter choice: ");
        switch(sc.nextInt()){
            case 1 -> {
                sc.nextLine();
                System.out.println("Odd or Even?");
                System.out.println("Enter a number: ");
                if(IsOdd(sc.nextInt())) {
                    System.out.println("Odd");
                }else{
                    System.out.println("Even");
                }
            }
            case 2 -> {
                sc.nextLine();
                System.out.println("Print name 50 times");
                System.out.println("Enter your name: ");
                Print50(sc.nextLine());
            }
            case 3 -> {
                sc.nextLine();
                System.out.println("Find the square root");
                System.out.println("Enter a number");
                System.out.println("Square root is " + SqrRoot(sc.nextDouble()));
            }
            case 4 -> {
                sc.nextLine();
                System.out.println("Find the power");
                System.out.println("Enter base number: ");
                double base = sc.nextDouble();
                System.out.println("Enter exponent: ");
                double expo = sc.nextDouble();
                System.out.println("Power is " + Power(base,expo));
            }
            case 5 -> {
                sc.nextLine();
                System.out.println("Print random number from 1 - 100");
                System.out.println("Number is " + PrintRadom());
            }
            case 6 -> {
                sc.nextLine();
                System.out.println("Find the area of the circle");
                System.out.println("Enter radius: ");
                System.out.println("Area is " + CircleArea(sc.nextDouble()));
            }
            case 7 -> {
                sc.nextLine();
                System.out.println("Are you a Voter?");
                System.out.println("Enter your age: ");
                if(IsVoter(sc.nextInt())){
                    System.out.println("You can vote");
                }else{
                    System.out.println("You are not a voter yet");
                }
            }
            case 8 -> {
                sc.nextLine();
                System.out.println("Word length");
                System.out.println("Enter a word: ");
                System.out.println("Length of the word is " + WordLength(sc.nextLine()));
            }
            case 9 -> {
                sc.nextLine();
                System.out.println("Reverse a word");
                System.out.println("Enter aa word: ");
                System.out.println("Reversed word is " + Reverse(sc.nextLine()));
            }
            case 0 -> {
                sc.nextLine();
                System.out.println("Print your nme and age");
                System.out.println("Enter your name: ");
                String n = sc.nextLine();
                System.out.println("Enter your age: ");
                int age = sc.nextInt();
                NameAndAge(n, age);
            }
            default -> {
                System.exit(0);
            }
        }

    }
    static boolean IsOdd(int num){
        if(num%2 != 0){
            return true;
        }else{
            return false;
        }
    }
    static void Print50(String name){
        for(int i = 0; i < 50; i++){
            System.out.println(name);
        }
    }
    static double SqrRoot(double num){
        return Math.sqrt(num);
    }
    static double Power(double base, double expo){
        return Math.pow(base, expo);

    }
    static int PrintRadom(){
        return (int)(Math.random() * 100) + 1;
    }
    static double CircleArea(double radius){
        return Math.PI * Math.pow(radius,2);
    }
    static boolean IsVoter(int age){
        return age >= 18;
    }
    static int WordLength(String word){
        return word.length();
    }
    static String Reverse(String word){
        String rev = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            rev += word.charAt(i);
        }
        return rev;
    }
    static void NameAndAge(String name, int age){
        System.out.println("Your name is " + name + " and your age is " + age + ".");
    }

}
