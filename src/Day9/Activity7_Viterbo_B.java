package Day9;


public class Activity7_Viterbo_B {
    static void main(String[] args) {

        for(int i = 1; i <= 10; i++){
            System.out.println("Multiplication table of " + i);
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            System.out.println();
        }
    }
}
