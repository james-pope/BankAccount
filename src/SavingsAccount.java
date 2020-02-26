public class SavingsAccount extends Account {
    public double interest;
    public SavingsAccount(int id, double startBal, double AnnInterest){
        super(id, startBal);
        interest = AnnInterest;
    }
    public void withdraw(double amt){
        if (amt > currentBalance()) System.out.println("Error: Withdraw exceeds available balance");
        else decreaseBalance(amt);
    }
    public double monthlyInterest(){
        return currentBalance() * (interest/12);
    }
}