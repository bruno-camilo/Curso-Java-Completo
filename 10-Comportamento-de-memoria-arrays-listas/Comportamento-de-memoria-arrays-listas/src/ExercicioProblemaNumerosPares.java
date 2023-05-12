import java.util.Scanner;

public class ExercicioProblemaNumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int quantidadeNumerosPares = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();
        int[] vect = new int[n];

        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        for(int i = 0; i < vect.length; i++){
            if(vect[i] % 2 == 0){
                System.out.print(vect[i] + " ");
                quantidadeNumerosPares ++;
            }else{

            }
        }
        System.out.println();
        System.out.println("Quantidade de numeros pares: " + quantidadeNumerosPares);
        sc.close();
    }
}
