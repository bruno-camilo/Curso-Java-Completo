import java.util.Scanner;

public class ExercicioProblemaSoma {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double avg = 0.0;
        double sum = 0.0;

        for(int i = 0; i < vect.length; i ++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("Valores: ");
        for(int i = 0; i < vect.length; i ++){
            System.out.print(vect[i] + "  ");
            sum += vect[i];

        }
        avg = sum / n;
        System.out.println("");
        System.out.printf("Soma: %.2f%n", sum);
        System.out.printf("Media %.2f%n", avg);

        sc.close();
    }
}
