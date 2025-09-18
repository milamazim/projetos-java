package application;

import java.util.Scanner;
import entities.Champion;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Champion campeaoA = new Champion();
    Champion campeaoB = new Champion();

    System.out.println("Digite os dados do primeiro campeão: ");
    System.out.print("Nome: ");
    campeaoA.setName(sc.nextLine());    
    System.out.print("Vida inicial: ");
    campeaoA.setLife(sc.nextInt());    
    System.out.print("Ataque: ");
    campeaoA.setAttack(sc.nextInt());        
    System.out.print("Armadura: ");
    campeaoA.setArmor(sc.nextInt());
    sc.nextLine();
    System.out.println();

    System.out.println("Digite os dados do segundo campeão: ");
    System.out.print("Nome: ");
    campeaoB.setName(sc.nextLine());    
    System.out.print("Vida inicial: ");
    campeaoB.setLife(sc.nextInt());    
    System.out.print("Ataque: ");
    campeaoB.setAttack(sc.nextInt());        
    System.out.print("Armadura: ");
    campeaoB.setArmor(sc.nextInt());
    sc.nextLine();
    System.out.println();    

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
