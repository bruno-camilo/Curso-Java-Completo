import java.util.Scanner;
import java.util.Vector;

public class Exercicio01Problema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] vect = new double[n];
        double sum = 0.0;

        for(int i = 0; i < n; i++){
            vect[i] = sc.nextDouble();
        }

        for(int i = 0; i < n; i++){
            sum += vect[i];
        }
        double avg = sum / n ;
        System.out.printf("AVERAGE HEIGHT: %.2f ", avg);

        sc.close();
    }
}
