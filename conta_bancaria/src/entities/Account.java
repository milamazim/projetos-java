package entities;

public class Account {

  private int accountNumber;
  private String accountHolder;
  private double balance;
  
  // construtores
  public Account(int accountNumber, String accountHolder, double initialDepositValue) {
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    deposit(initialDepositValue);
  }

  public Account(int accountNumber, String accountHolder) {
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;    
  }

  // getters
  public int getAccountNumber() {
    return accountNumber;
  }

  public String getAccountHolder() {
    return accountHolder;
  }

  // metodos
  public double getBalance() {
    return balance;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public void withdraw(double amount) {
    balance -= amount + 5.0;
  }

  public String toString() {
      return String.format("Account %d, Holder: %s, Balance: $ %.2f", getAccountNumber(), getAccountHolder(), getBalance());  
  }
  

}
