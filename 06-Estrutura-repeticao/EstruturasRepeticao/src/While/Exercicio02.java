package While;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while(x != 0 && y != 0){
            if(x > 0 && y > 0){
                System.out.println("Primeiro");
                x = sc.nextInt();
                y = sc.nextInt();
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
                x = sc.nextInt();
                y = sc.nextInt();
            }else if(x < 0 && y < 0){
                System.out.println("Terceiro ");
                x = sc.nextInt();
                y = sc.nextInt();

            } else if (x > 0 && y < 0) {
                System.out.println("Quarto");
                x = sc.nextInt();
                y = sc.nextInt();
            }
        }
        sc.close();
    }
}
