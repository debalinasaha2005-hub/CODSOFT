import java.util.Scanner;
class BankAccount {
    private double balance; // balance for account
    public BankAccount(double initialBalance) {    // declaring parameterized constructor 
    this.balance = initialBalance; 
    }
    public boolean withdraw (double amount){    // i. Method withdraw
        if(amount>0 && amount<= balance){
            balance = balance - amount ;
            System.out.println("Successfully debited " +amount+" .Remaining balance " +balance);
            return true;
        }
        else if(amount > balance){
            System.out.println("Insufficient balance");
            return  false;
        }
        else{
            System.out.println("Invalid amount");
            return false;
        }
    }
    
    
    public void deposit(double amount){    // ii. Method deposit
        if(amount > 0){
            balance = balance+amount;
            System.out.println("Successfully credited with Rs. "+amount+" .Balance: "+balance);
        }
        else{
            System.out.println("Invalid amount");
        }
    }

    public double checkBalance(){     //iii. Method check balance
        return balance;
    }
}


      public class ATM{   //Desinging the ATM interface
      public static void main(String args[]){
      BankAccount userAccount = new BankAccount(10000);
      Scanner sc = new Scanner(System.in);
      int choice;
      do{
        System.out.println("== ATM menu =="); //Designing the ATM menu
        System.out.println("1. Withdraw money");
        System.out.println("2.Deposit money");
        System.out.println("3.Check balance");
        System.out.println("4.Exit");
        System.out.print("Enter your choice(1-4): ");
        choice = sc.nextInt();
        switch(choice) {
            case 1:
            System.out.print("Enter amount: "); //amount for withdrawing money
            double withdrawAmount =sc.nextDouble();
            userAccount.withdraw(withdrawAmount);
            break;
            case 2:
            System.out.print("Enter amount: "); //amount for depositing money
            double depositAmount =sc.nextDouble();
            userAccount.deposit(depositAmount);
            break;
            case 3:
            System.out.println("Balance: "+userAccount.checkBalance()); //checking balance
            break;
            case 4:
            System.out.println("Thank you");
            break;
            default:
            System.out.println("Invalid choice.Try again");
        }
    }
    while(choice != 4);
    sc.close();
}
      }








































    
