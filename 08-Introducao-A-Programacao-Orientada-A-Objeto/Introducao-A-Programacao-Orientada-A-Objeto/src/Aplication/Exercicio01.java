package Aplication;

import entities.Rectangle;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println("Area: " + String.format("%.2f",rectangle.area()));
        System.out.println("Perimeter: " + String.format("%.2f",rectangle.perimeter()));
        System.out.println("Diagonal: " + String.format("%.2f",rectangle.diagonal()));

        sc.close();

    }
}
