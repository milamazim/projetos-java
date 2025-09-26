package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int n, soma = 0;

    do {
      System.out.print("Qual a ordem da matriz? ");
      n = sc.nextInt();      
    } while (n > 10 || n <= 0);

    double[][] mat = new double[n][n];
    double[][] mat_alterada = new double[n][n];
    
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.printf("Elemento [%d,%d]: ", i, j);
        mat[i][j] = sc.nextDouble();        
      }      
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (mat[i][j] > 0) {
          soma += mat[i][j];
        }
      }      
    }

    System.out.println();
    System.out.printf("SOMA DOS POSITIVOS: %d%n", soma);

    System.out.println();
    System.out.print("Escolha uma linha: ");
    int linha = sc.nextInt();

    System.out.print("LINHA ESCOLHIDA: ");

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == linha) {
          System.out.printf("%.1f ", mat[i][j]);
        }        
      }      
    }
    
    System.out.println();
    System.out.println();
    System.out.print("Escolha uma coluna: ");
    int coluna = sc.nextInt();

    System.out.print("COLUNA ESCOLHIDA: ");

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (j == coluna) {
          System.out.printf("%.1f ", mat[i][j]);
        }        
      }      
    }
    
    System.out.println();
    System.out.println();
    System.out.print("DIAGONAL PRINCIPAL: ");

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == j) {
          System.out.printf("%.1f ", mat[i][j]);
        }        
      }      
    }

    System.out.println();
    System.out.println();
    System.out.println("MATRIZ ALTERADA: ");

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (mat[i][j] < 0) {
          mat_alterada[i][j] = Math.pow(mat[i][j], 2);
        }
        else {
          mat_alterada[i][j] = mat[i][j];
        }
      }      
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.printf("%.1f ", mat_alterada[i][j]);
      }
      System.out.println();     
    }  

    sc.close();

  }

}
