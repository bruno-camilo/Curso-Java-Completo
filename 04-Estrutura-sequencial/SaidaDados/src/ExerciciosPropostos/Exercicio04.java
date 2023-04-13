package ExerciciosPropostos;

import java.util.Scanner;

public class Exercicio04 {

    public static  void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int numeroTrabalhador, horasTrabalhada;
        double valorHora, salarioRecebido;

        numeroTrabalhador = sc.nextInt();
        horasTrabalhada = sc.nextInt();
        valorHora = sc.nextDouble();

        salarioRecebido = horasTrabalhada * valorHora;
        System.out.printf("Number: %d%n", numeroTrabalhador);
        System.out.printf("Salary: $ %.2f", salarioRecebido);
        sc.close();
    }
}
