package application;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int menor;

    System.out.print("Primeiro valor: ");
    int valor1 = sc.nextInt();

    System.out.print("Segundo valor: ");
    int valor2 = sc.nextInt();

    System.out.print("Terceiro valor: ");
    int valor3 = sc.nextInt();
    
    if ((valor1 < valor2) && (valor1 < valor3)) {
      menor = valor1;
    }
    else if ((valor2 < valor1) && (valor2 < valor3)) {
      menor = valor2;
    }
    else {
      menor = valor3;
    }

    System.out.printf("MENOR = %d", menor);

    sc.close();

  }
}
