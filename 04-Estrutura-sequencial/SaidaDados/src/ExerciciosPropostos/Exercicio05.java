package ExerciciosPropostos;

import java.util.Scanner;

public class Exercicio05 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int codigoPeca1, quantidadePeca1, codigoPeca2, quantidadePeca2;
        double valorPeca1, valorPeca2, valorAPagar;

        codigoPeca1 = sc.nextInt();
        quantidadePeca1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();
        codigoPeca2 = sc.nextInt();
        quantidadePeca2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();

        valorAPagar = (quantidadePeca1 * valorPeca1) + (quantidadePeca2 * valorPeca2);
        System.out.printf("Valor a pagar é de : R$ %.2f", valorAPagar);
        sc.close();
    }
}
