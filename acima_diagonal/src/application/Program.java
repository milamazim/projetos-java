package application;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, soma = 0;

    do {
      System.out.print("Qual a ordem da matriz? ");
      n = sc.nextInt();      
    } while (n > 10 || n <= 0);

    int[][] mat = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.printf("Elemento [%d,%d]: ", i, j);
        mat[i][j] = sc.nextInt();
        
        if (j > i) {
          soma += mat[i][j];
        }

      }      
    }

    System.out.printf("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL: %d", soma);

    sc.close();
  }

}
