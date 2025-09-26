package application;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;

    do {
      System.out.print("Qual a ordem da matriz? ");
      n = sc.nextInt();
    } while (n > 10 || n <= 0);

    int[][] mat = new int[n][n];
    int[] maior = new int[n];

    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat.length; j++) {
        System.out.printf("Elemento [%d,%d]: ", i, j);
        mat[i][j] = sc.nextInt();

        if(mat[i][j] > maior[i]) {
          maior[i] = mat[i][j]; 
        }
        
      }
      
    }

    System.out.println("MAIOR ELEMENTO DE CADA LINHA: ");
    
    for (int i = 0; i < maior.length; i++) {
      System.out.println(maior[i]);  
    }

    sc.close();
  }

}
