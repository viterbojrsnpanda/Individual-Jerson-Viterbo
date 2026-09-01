package Day11;

import java.util.Scanner;

public class Activity9B_Viterbo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        String character;
        int charOccurrence = 0;
        int numOfVowels = 0;

        System.out.println("Enter a word: ");
        word = sc.nextLine().toLowerCase();
        System.out.println("Enter a letter you want to count: ");
        character = sc.nextLine().toLowerCase();

        System.out.println("First Letter of the word is " + word.charAt(0));
        System.out.println("Last letter of the word is " + word.charAt(word.length()-1));

        char[] wordArray = word.toCharArray();
        for(int i = 0; i < wordArray.length; i++){
            if(wordArray[i] == character.toCharArray()[0]){
                charOccurrence ++;
            }
            switch(wordArray[i]){
                case 'a', 'e', 'i', 'o', 'u' -> numOfVowels++;
            }

        }

        System.out.println("Character " + character + " appeared " + charOccurrence + " times");
        System.out.println("Number of vowels in the word is " + numOfVowels);


    }
}
