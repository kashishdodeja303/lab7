class BankAccount {
  double getInterestRate() {
   return 0.05; 
    }
}

class SavingsAccount extends BankAccount {
   double getInterestRate() {
     return 0.1; 
    }
}

public class BankAccountMain {
  public static void main(String[] args) {
   BankAccount acc1 = new BankAccount();
   BankAccount acc2 = new SavingsAccount();

   System.out.println("Bank Account Interest Rate: " + acc1.getInterestRate());
   System.out.println("Savings Account Interest Rate: " + acc2.getInterestRate());
    }
}
