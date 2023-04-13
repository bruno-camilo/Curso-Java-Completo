package ExerciciosPropostos;

import java.util.Scanner;

public class Exercicio03 {

    public static void main (String [] Args){
        Scanner sc = new Scanner(System.in);
        int A, B, C, D, resultado;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        resultado =  (A * B) - (C * D);
        System.out.printf("Resultado: %d", resultado);
        sc.close();
    }
}
