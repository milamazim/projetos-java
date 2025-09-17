package entities;

public class Account {

  private int accountNumber;
  private String accountHolder;
  private double initialDepositValue;
  private double deposit;
  private double withdraw;
  private double withdrawTax = 5.00;

  // construtores
  public Account(){    
  }

  public Account(int accountNumber, String accountHolder, double initialDepositValue) {
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.initialDepositValue = initialDepositValue;    
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

  public double getInitialDepositValue() {
    return initialDepositValue;
  }

  public double getDeposit() {
    return deposit;
  }

  public double getWithdraw() {
    return withdraw;
  }

  // setters
  public void setDeposit(double deposit) {
    this.deposit = deposit;
  }

  public void setWithdraw(double withdraw) {
    this.withdraw = withdraw + withdrawTax;
  }

  // metodos
  public double balance(){
    return getInitialDepositValue() + getDeposit() - getWithdraw();
  }

  public String toString() {
      return String.format("Account %d, Holder: %s, Balance: $ %.2f", getAccountNumber(), getAccountHolder(), balance());  
  }
  

}
