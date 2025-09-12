package application;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x, negativos = 0;

    do {
      System.out.print("Qual a ordem da matriz? ");
      x = sc.nextInt();
    }
    while (x > 10);    

    int vet[][] = new int[x][x];

    for (int i=0; i < x; i++) {
      for (int j=0; j < x; j++) {
        System.out.printf("Elemento [%d][%d]: ", i, j);
        vet[i][j] = sc.nextInt();
      }    
    }

    System.out.println("DIAGONAL PRINCIPAL: ");
    for (int i=0; i < x; i++) {
      for (int j=0; j < x; j++) {
        if (i == j) {
          System.out.printf("%d ", vet[i][j]);
        }
        if (vet[i][j] < 0) {
          negativos ++;
        }
      }    
    }

    System.out.printf("\nQUANTIDADE DE NEGATIVOS = %d", negativos);

    sc.close();

  }
}
