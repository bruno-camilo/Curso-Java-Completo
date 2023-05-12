package ExerciciosPropostos;

import java.util.Scanner;

public class Exercicio05 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int codigoProduto, quantidadeProduto;
        double valor, total;
        codigoProduto = sc.nextInt();
        quantidadeProduto = sc.nextInt();

        if (codigoProduto == 1){
            valor = 4.00;
            total = valor * quantidadeProduto;
        } else if (codigoProduto == 2) {
            valor = 4.50;
            total = valor * quantidadeProduto;
        } else if (codigoProduto == 3) {
            valor = 5.00;
            total = valor * quantidadeProduto;
        } else if (codigoProduto == 4) {
            valor = 2.00;
            total = valor * quantidadeProduto;
        }else {
            valor = 1.50;
            total = valor * quantidadeProduto;
        }
        System.out.printf("Total: R$ %.2f", total);
        sc.close();

    }
}
