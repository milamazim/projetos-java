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

    double [][] mat = new double[x][y];
    double [] mat_soma = new double[x];
    
    for (int i=0; i < x; i++) {
      System.out.printf("Digite os elementos da %da. linha: %n", i+1);
      for (int j=0; j < y; j++) {
        mat[i][j] = sc.nextDouble();
        mat_soma[i] += mat[i][j];
      }
    }

    System.out.println("VETOR GERADO: ");

    for (int i=0; i < mat_soma.length; i++) {
      System.out.println(mat_soma[i]);
    }

    sc.close();
    
  }

}
