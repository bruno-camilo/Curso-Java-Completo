package For;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 6; i <=N; i--){
            if(N % i == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
