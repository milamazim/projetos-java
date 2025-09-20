package application;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;

    do {
      System.out.print("Quantos números você vai digitar? ");
      n = sc.nextInt();      
    } 
    while (n > 10);

    int[] vect = new int[n];
    
    for (int i=0; i < vect.length; i++) {
      System.out.print("Digite um número: ");  
      vect[i] = sc.nextInt();
    }

    System.out.println("NÚMEROS NEGATIVOS: ");

    for (int i=0; i < vect.length; i++) {
      if (vect[i] < 0) {
        System.out.println(vect[i]);
      }

    }

    sc.close();

  }

}
