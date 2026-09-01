package Day11;

import java.util.Scanner;

public class Activity9_Viterbo {
    static void main(String[] args) {

        int numOfStudents = 0;
        int numOfSubjects = 0;
        double sumOfGrades = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        numOfStudents = sc.nextInt();
        System.out.println("Enter number of subjects: ");
        numOfSubjects = sc.nextInt();
        sc.nextLine();

        String[] subjects = new String[numOfSubjects];      //getting the number of subjects before array declaration for array length specification
        String[][] gradesReport = new String[numOfStudents + 1][numOfSubjects + 2];

        System.out.println("Enter Subject names: ");        //getting the subjects and putting it into subjects array
        for(int i = 0; i < subjects.length; i++ ){
            System.out.print("Subject " + (i + 1) + ": ");
            subjects[i] = sc.nextLine();
        }


        gradesReport[0][0] = "Student";                     //setting up the column header of the table
        for(int i = 1; i <= subjects.length; i++ ){
            gradesReport[0][i] = subjects[i - 1];
        }
        gradesReport[0][subjects.length + 1] = "Average";


        for(int i = 1; i < numOfStudents + 1; i++){
            for(int j = 0; j < gradesReport[i].length; j++){
                if(j == 0){
                    System.out.println("Name of student " + i + ": ");      //getting the name of the student
                    gradesReport[i][j] = sc.nextLine();
                    System.out.println("Enter grades for each subject: ");
                }else if(j > 0 && j < gradesReport[i].length - 1){
                    System.out.println(subjects[j - 1] + ": ");             //getting the grades on each subject
                    gradesReport[i][j] = sc.nextLine();
                    sumOfGrades += Double.parseDouble(gradesReport[i][j]);
                }else{
                    gradesReport[i][j] = String.format("%.2f", sumOfGrades / numOfSubjects);      //getting the average and converting them to string
                    sumOfGrades = 0;            //resetting the average for the next student
                }
            }
        }

        System.out.println("==================================================================");       //printing the top
        System.out.println();
        System.out.println("\t\t\t\t\t\tGrades Report");
        System.out.println();
        System.out.println("==================================================================");


        for(int i = 0; i < gradesReport.length; i++){
            for(int j = 0; j < gradesReport[i].length; j++){
                System.out.printf("%-12s", gradesReport[i][j]);         //using printf %-12s meaning it will be left aligned with 12 spaces width apart
            }
            if(i == 0){
                System.out.println();                                   //printing the separator of the header
                System.out.print("-------------------------------------------------------------------------------------------");
            }
            System.out.println();
        }

    }
}
