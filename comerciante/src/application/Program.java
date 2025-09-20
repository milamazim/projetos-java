package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    int n;
    int lucro_abaixo_10 = 0;
    int lucro_entre_10_20 = 0;
    int lucro_acima_20 = 0;
    
    double margem;
    double soma_custos = 0.00;
    double soma_precos = 0.00;
    
    do {
      System.out.print("Serão digitados quantos produtos? ");  
      n = sc.nextInt();
      sc.nextLine();
    } 
    while (n > 10 || n <= 0);    
    
    String[] produtos = new String[n];
    double[] custos = new double[n]; 
    double[] precos = new double[n];

    for (int i=0; i < n; i++) {
      System.out.printf("Produto %d: %n", i+1);
      System.out.print("Nome: ");
      produtos[i] = sc.nextLine();
      System.out.print("Preço de compra: ");
      custos[i] = sc.nextDouble();
      System.out.print("Preço de venda: ");
      precos[i] = sc.nextDouble();
      sc.nextLine();
    }

    for (int i=0; i < n; i++) {
      margem = (precos[i] - custos[i]) / custos[i] * 100;
      System.out.printf("Margem do item %d: %.2f", i, margem);

      if (margem < 10) {
        lucro_abaixo_10 += 1;
      }
      else if (margem < 20) {
        lucro_entre_10_20 += 1;
      }
      else {
        lucro_acima_20 += 1;
      }
    }

    for (int i=0; i < custos.length; i++) {
      soma_custos += custos[i];
    }

    for (int i=0; i < precos.length; i++) {
      soma_precos += precos[i];
    }

    System.out.println();
    System.out.println("RELATÓRIO:");
    System.out.printf("Lucro abaixo de 10%% : %d%n", lucro_abaixo_10);
    System.out.printf("Lucro entre 10%% e 20%% : %d%n", lucro_entre_10_20);
    System.out.printf("Lucro acima de 20%% : %d%n", lucro_acima_20);
    System.out.printf("Valor total de compra : %.2f%n", soma_custos);
    System.out.printf("Valor total de venda : %.2f%n", soma_precos);
    System.out.printf("Lucro total : %.2f%n", soma_precos - soma_custos);    

    sc.close();

  }

}
