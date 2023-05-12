import java.util.Scanner;

public class Funcoes02 {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int higher =  max(A, B, C);
        showResult(higher);
        sc.close();
    }

    public static int max(int A, int B, int C){
        int aux;
        if(A > B && A > C){
            aux = A;
        } else if (B > C) {
            aux = B;
        }else {
            aux = C;
        }
        return aux;
    }

    public static void showResult(int higher){
        System.out.println("Higher: "+ higher);
    }
}
