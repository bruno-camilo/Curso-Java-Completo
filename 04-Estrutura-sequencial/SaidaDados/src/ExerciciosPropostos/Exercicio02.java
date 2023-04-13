package ExerciciosPropostos;

import java.util.Scanner;

public class Exercicio02 {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double R = sc.nextDouble();
        double resultado;

        resultado =  R * pi * R;

        System.out.printf("A= %.4f", resultado);

        sc.close();
    }
}
