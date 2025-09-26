package application;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x, y;

    do {
      System.out.print("Quantas linhas vai ter cada matriz? ");
      x = sc.nextInt();
      System.out.print("Quantas colunas vai ter cada matriz? ");
      y = sc.nextInt();
    } while (x > 10 || x <= 0 || y > 10 || y <= 0);

    int[][] matrizA = new int[x][y];
    int[][] matrizB = new int[x][y];
    int[][] matriz_soma = new int[x][y];

    System.out.println("Digite os valores da matriz A: ");

    for (int i = 0; i < x; i++) {
      for (int j = 0; j < y; j++) {
        System.out.printf("Elemento [%d,%d]: ", i, j);
        matrizA[i][j] = sc.nextInt();
      }      
    }

    System.out.println("Digite os valores da matriz B: ");

    for (int i = 0; i < x; i++) {
      for (int j = 0; j < y; j++) {
        System.out.printf("Elemento [%d,%d]: ", i, j);
        matrizB[i][j] = sc.nextInt();
      }      
    }

    System.out.println("MATRIZ SOMA: ");

    for (int i = 0; i < x; i++) {
      for (int j = 0; j < y; j++) {
        matriz_soma[i][j] = matrizA[i][j] + matrizB[i][j];
        System.out.printf("%d  ", matriz_soma[i][j]);
      }
      System.out.println();      
    }

    sc.close();
  }

}
