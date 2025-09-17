package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);  
    Account account;
        
    System.out.print("Enter account number: ");
    int accountNumber = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter account holder: ");
    String accountHolder = sc.nextLine();
            
    System.out.print("Is there an initial deposit (y/n)? ");
    char isInitialDeposit = sc.next().charAt(0);    

    if ((isInitialDeposit == 'y') || (isInitialDeposit == 'Y')) {
      System.out.print("Enter initial deposit value: ");
      double initialDepositValue = sc.nextDouble();
      account = new Account(accountNumber,accountHolder,initialDepositValue);
    } else {
      account = new Account(accountNumber,accountHolder);
    }
    System.out.println();
    System.out.println("Account data:");
    System.out.println(account);
    System.out.println();
    System.out.print("Enter a deposit value: ");
    account.deposit(sc.nextDouble());
    System.out.println("Updated account data: ");
    System.out.println(account);
    System.out.println();
    System.out.print("Enter a withdraw value: ");
    account.withdraw(sc.nextDouble());
    System.out.println("Updated account data: ");
    System.out.println(account);

    sc.close();
  }
 
}
