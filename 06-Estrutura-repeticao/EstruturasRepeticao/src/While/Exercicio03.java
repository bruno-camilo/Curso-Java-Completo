package While;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int contadorGasolina = 0;
        int contadorAlcool = 0;
        int contadorDiesel = 0;
        int tipoCombustivel = sc.nextInt();

        while(tipoCombustivel != 4) {
            tipoCombustivel = sc.nextInt();
            if (tipoCombustivel == 1) {
                contadorAlcool += 1;

            } else if (tipoCombustivel == 2) {
                contadorGasolina += 1;

            } else if (tipoCombustivel == 3) {
                contadorDiesel += 1;
            }
        }
        System.out.println("Muito Obrigado!");
        System.out.printf("Alcool : %d%n",contadorAlcool);
        System.out.printf("Gasolina : %d%n",contadorGasolina);
        System.out.printf("Diesel : %d%n",contadorDiesel);
        sc.close();
    }
}
