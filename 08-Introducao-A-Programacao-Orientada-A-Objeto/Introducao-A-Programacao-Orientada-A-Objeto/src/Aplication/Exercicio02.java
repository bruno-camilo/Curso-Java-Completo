package Aplication;

import entities.Employee;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee);
        System.out.print("Wich percentage to increase salary? ");

        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Update data: " + employee);
        System.out.println();

        sc.close();
    }
}
