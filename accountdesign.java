class Account {
  private int accountNumber = 1000;
  private String holderName;
  private double balance = 1000.0;
  private double initialDeposit;
  private static String bankName;
  private static double interestRate;
  private static int accountCounter;

  static {
    bankName = "State Bank of India";
    interestRate = 4.5;
    System.out.println("Bank system initialized with base configuration");
  }

  public Account(String holderName, double initialDeposit) {
    this.holderName = holderName;
    this.initialDeposit = initialDeposit;
    accountCounter++;
    this.accountNumber = accountCounter;

    if (this.initialDeposit < 500) {
      System.out.println("Minimum balance not met! initialized with 500");
      this.balance = 500;
    } else {
      this.balance = this.initialDeposit;
    }
  }

  public static void updateInterestRate(double newRate) {
    if (newRate > 0) {
      interestRate = newRate;
    } else {
      System.out.println("invalid");
    }
  }

  public static String getbankName() {
    return bankName;
  }

  public static String getBankName() {
    return bankName;
  }

  public static double getInterestRate() {
    return interestRate;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public String getholderName() {
    return holderName;
  }

  public void setHolderName(String holderName) {
    this.holderName = holderName;
  }

  public void deposit(double amount) {
    if (amount <= 0) {
      System.out.println("error deposity amount 0 se jyada hona chahiye");
      return;
    }

    balance += amount;
    System.out.println("Successfully deposited " + amount);
    System.out.println("Current balance: " + balance);
  }

  public void withdraw(double amount) {
    if (amount <= 0) {
      System.out.println("Error: withdrawal amount should be greater than 0");
      return;
    }

    if (balance - amount < 500) {
      System.out.println("with draw karne ke baad minimum balance 500 se jyada hona chahiye");
      System.out.println("app maximum " + (balance - 500) + " rs hi nikal sakte ho");
      return;
    }

    balance -= amount;
    System.out.println("succesfully withdrawn: " + amount);
    System.out.println("remaining balance : " + balance);
  }

  public void display() {
    System.out.println(accountNumber + " " + holderName + " " + balance + " " + bankName + " " + interestRate);
  }
}

public class accountdesign {
  public static void main(String[] args) {
    Account account = new Account("Rahul", 1500);
    System.out.println("Bank Name: " + Account.getBankName());
    System.out.println("Interest Rate: " + Account.getInterestRate());
    account.display();
  }
}

