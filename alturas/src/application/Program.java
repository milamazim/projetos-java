package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int n;

    do {
      System.out.print("Quantas pessoas serao digitadas? ");
      n = sc.nextInt();  
      sc.nextLine();
    } 
    while (n > 10);
    
    String[] nomes = new String[n];
    int[] idades = new int[n];
    double[] alturas = new double[n];
    
    for (int i=0; i < n; i++) {
      System.out.printf("Dados da %da pessoa: %n", i + 1);
      System.out.print("Nome: ");
      nomes[i] = sc.nextLine();
      System.out.print("Idade: ");
      idades[i] = sc.nextInt();
      System.out.print("Altura: ");
      alturas[i] = sc.nextDouble();
      sc.nextLine();      
    }

    double soma_alturas = 0;

    for (int i=0; i < alturas.length; i++) {
      soma_alturas += alturas[i];
    }

    double soma_menores = 0;

    for (int i=0; i < idades.length; i++) {
      if (idades[i] < 16) {
        soma_menores += 1;
      }
    }

    double media_alturas = soma_alturas / n;
    double percentual_menores = (soma_menores / n) * 100;
    
    System.out.printf("Altura média: %.2f%n", media_alturas);
    System.out.printf("Pessoas com menos de 16 anos: %.2f%n", percentual_menores);
    
    for (int i=0; i < nomes.length; i++) {
      if (idades[i] < 16) {
        System.out.println(nomes[i]);       
      }
    }
    
    sc.close();

  }

}
