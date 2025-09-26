package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int x, y;
    
    do {
      System.out.print("Qual a quantidade de linhas da matriz? ");
      x = sc.nextInt();
      System.out.print("Qual a quantidade de colunas da matriz? ");
      y = sc.nextInt();      
    } while (x > 10 || x <= 0 || y > 10 || y <= 0);

    int[][] mat = new int[x][y];

    for (int i = 0; i < x; i++) {
      for (int j = 0; j < y; j++) {
        System.out.printf("Elemento [%d,%d]: ", i, j);
        mat[i][j] = sc.nextInt();
      }      
    }

    System.out.println("VALORES NEGATIVOS: ");

    for (int i = 0; i < x; i++) {
      for (int j = 0; j < y; j++) {
        if (mat[i][j] < 0) {
          System.out.println(mat[i][j]);
        }
      }      
    }

    sc.close();

  }

}
