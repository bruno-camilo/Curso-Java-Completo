package ExerciciosPropostos;

import java.util.Scanner;

public class Exercicio01 {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int resultado = numero1 + numero2;

        System.out.printf("Soma: %d", resultado);

        sc.close();

    }
}
