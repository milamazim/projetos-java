package application;

import java.util.Scanner;
import entities.Champion;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    

    System.out.println("Digite os dados do primeiro campeão: ");
    System.out.print("Nome: ");
    String nameA = sc.nextLine();
    System.out.print("Vida inicial: ");
    int lifeA = sc.nextInt();
    System.out.print("Ataque: ");
    int attackA = sc.nextInt();
    System.out.print("Armadura: ");
    int armorA = sc.nextInt();
    sc.nextLine();
    System.out.println();

    Champion campeaoA = new Champion(nameA, lifeA, attackA, armorA);

    System.out.println("Digite os dados do segundo campeão: ");
    System.out.print("Nome: ");
    String nameB = sc.nextLine();
    System.out.print("Vida inicial: ");
    int lifeB = sc.nextInt();
    System.out.print("Ataque: ");
    int attackB = sc.nextInt();
    System.out.print("Armadura: ");
    int armorB = sc.nextInt();
    System.out.println();

    Champion campeaoB = new Champion(nameB, lifeB, attackB, armorB);

    System.out.print("Quantos turnos você deseja executar? ");
    int turns = sc.nextInt();
    System.out.println();
    
    for(int i=1; i <= turns; i++) {
      System.out.printf("Resultado do turno %d: %n", i);
      campeaoA.takeDamage(campeaoB);
      System.out.println(campeaoA.status());      
      campeaoB.takeDamage(campeaoA);
      System.out.println(campeaoB.status());
      System.out.println();
    
      if ( (campeaoA.getLife() <= 0) || (campeaoB.getLife() <= 0) ) {
        i = turns;        
      }

      if (i == turns) {
        System.out.println("FIM DO COMBATE");
      }
      
    }

    sc.close();

  }
}
