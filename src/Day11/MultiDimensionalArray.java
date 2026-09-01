package Day11;

import java.util.Scanner;

public class MultiDimensionalArray {
    static void main(String[] args) {
        int[][] number = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };


//        for (int[] rows : number){
//            for (int column : rows){
//                System.out.println(column);
//            }
//            System.out.println();
//        }

        Scanner sc = new Scanner(System.in);
        String[][] planets = new String[2][4];
        planets[0][0] = "Mercury";
        planets[0][1] = "Venus";
        planets[0][2] = "Earth";
        planets[0][3] = "Mars";

        planets[1][0] = "Jupiter";
        planets[1][1] = "Saturn";
        planets[1][2] = "Uranus";
        planets[1][3] = "Neptune";

        for(int i = 0; i < planets.length; i++){
            for(int j = 0; j < planets[i].length ; j++){
                System.out.print("Enter planet[" + i + "][" + j + "]: ");
                planets[i][j] = sc.nextLine();
            }
        }

        for (String[] rows : planets){
            for (String column : rows){
                System.out.println(column);
            }
            System.out.println();
        }
    }
}
