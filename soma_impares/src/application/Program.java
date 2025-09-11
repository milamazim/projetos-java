package application;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x, y, inicio, fim, soma_impares = 0;

    System.out.println("Digite dois números: ");
    x = sc.nextInt();
    y = sc.nextInt();

    if (x < y) {
      inicio = x;
      fim = y;
    }
    else {
      inicio = y;
      fim = x;
    }

    for(int i=inicio; i < fim; i++) {
      if (i % 2 != 0) {
        soma_impares += i;
      }
    }

    System.out.printf("SOMA DOS IMPARES = %d", soma_impares);

    sc.close();
    
  }
}
