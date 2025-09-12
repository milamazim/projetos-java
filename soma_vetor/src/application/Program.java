package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int x;
    double soma = 0, media;

    System.out.print("Quantos números você vai digitar? ");
    x = sc.nextInt();    

    double[] vet = new double[x]; // Corrigido: criação do array com "new"

    for (int i = 0; i < x; i++) {
      System.out.print("Digite um número: ");
      vet[i] = sc.nextDouble();
    }

    System.out.print("VALORES = ");
    for (int i = 0; i < x; i++) {
      System.out.printf("%.1f ", vet[i]);
      soma += vet[i];
    }

    media = soma / x;
    
    System.out.println();
    System.out.printf("SOMA = %.2f\n", soma);
    System.out.printf("MEDIA - %.2f\n", media);

    sc.close();
  }
}
