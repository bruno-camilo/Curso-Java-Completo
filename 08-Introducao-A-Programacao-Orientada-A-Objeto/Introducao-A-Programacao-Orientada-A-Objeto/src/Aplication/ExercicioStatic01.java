package Aplication;

import java.util.Scanner;
import util.CurrencyConverter;

public class ExercicioStatic01 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the dollar price? ");
        double price = sc.nextDouble();
        System.out.print("How many dollars will be bought?");
        double quantity = sc.nextDouble();
        double amount = CurrencyConverter.convert(quantity, price);
        System.out.printf("Amount to be paid in reais = %.2f", amount);

        sc.close();
    }
}
