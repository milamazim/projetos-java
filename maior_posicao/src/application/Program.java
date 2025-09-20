package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int n;

    do {
      System.out.print("Quantos números você vai digitar? ");
      n = sc.nextInt();
    } 
    while (n > 10);

    double[] vect = new double[n];
    
    for (int i=0; i < n; i++) {
      System.out.print("Digite um número: ");
      vect[i] = sc.nextDouble();
    }

    double maior_valor = 0.00;
    int posicao_maior_valor = 0;

    for (int i=0; i < vect.length; i++) {
      if (vect[i] > maior_valor) {
        maior_valor = vect[i];
        posicao_maior_valor = i;
      }
    }

    System.out.println();
    System.out.printf("MAIOR VALOR = %.1f%n", maior_valor);
    System.out.printf("POSIÇÃO DO MAIOR VALOR = %d", posicao_maior_valor);

    sc.close();

  }

}
