class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
      balance = initialBalance;
    }

    public void deposit(double amount) {
      balance += amount;
    }
  }

  class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
      super(initialBalance); // Call superclass constructor with initialBalance
      this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
      double interest = amount * interestRate;
      balance += interest; // Add interest before base class deposit
      super.deposit(amount); // Call base class deposit method
    }
  }

   class Main3 {
    public static void main(String[] args) {
      SavingsAccount savingsAccount = new SavingsAccount(1200, 0.05); // 5% interest rate
      savingsAccount.deposit(700);

      System.out.println("Balance after deposit with interest Rupees: " + savingsAccount.balance);
    }
  }
