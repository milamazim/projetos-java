package application;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Dados da primeira pessoa: ");
    System.out.print("Nome: ");
    String nome1 = sc.nextLine();
    System.out.print("Idade: ");
    int idade1 = sc.nextInt();
    sc.nextLine();
    System.out.println("Dados da segunda pessoa: ");
    System.out.print("Nome: ");    
    String nome2 = sc.nextLine();
    System.out.print("Idade: ");
    int idade2 = sc.nextInt();
    
    double media_idade = (double) (idade1 + idade2) / 2;

    System.out.printf("A idade média de %s e %s é de %.1f", nome1, nome2, media_idade);

    sc.close();

  }
}
