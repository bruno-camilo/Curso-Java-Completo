package Application;

import entities.Account;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double amount;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        Account account;

        if(response == 'y'){
            System.out.println();
            System.out.print("Enter initial deposit value: ");
            amount =  sc.nextDouble();
            account = new Account(number, holder, amount);
            System.out.println();
            System.out.println(account);
        }else {
            account = new Account(number,holder);
            System.out.println(account);
        }
        System.out.println();

        System.out.print("Enter a deposit value: ");
        amount =  sc.nextDouble();
        account.deposit(amount);
        System.out.println();
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        amount =  sc.nextDouble();
        account.withdraw(amount);
        System.out.println(account);
        sc.close();
    }
}
