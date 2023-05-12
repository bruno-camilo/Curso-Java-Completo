import entitiies.Rent;

import java.util.Scanner;

public class ExercicioDeFixaca {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will rented? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i ++ ){
            System.out.println();
            System.out.printf("Rent # %d%n", i);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect[room] = new Rent(name, email);
        }
        System.out.printf("Busy rooms: %n");
        for(int i = 0; i< vect.length; i++){
            if(vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }
        sc.close();
    }
}
