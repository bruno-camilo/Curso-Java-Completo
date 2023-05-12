package Matrizes;

import java.util.Scanner;

public class ExercicioProposto {

    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][] mat = new int[m][n];

        // adicionar na matriz
        for(int i = 0; i<m; i++){
            for (int j = 0; j<n; i++){
                mat[i][j] =sc.nextInt();
            }
        }

        sc.close();
    }
}
