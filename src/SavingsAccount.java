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
/* Output from AccountTester
Checking account 567.5
365.5 365.5
Savings account 300.0
Error: Withdraw exceeds available balance
250.0 250.0
Special Account 350.0
247.5 247.5
Special Account 850.0
895.0 895.0
Account 1233
Balance 365.5
Interest 1.0
Account 1234
Balance 250.0
Interest 0.8333333333333334
Account 1235
Balance 247.5
Interest 1.0
Account 1236
Balance 895.0
Interest 3.7291666666666665
Interest: 1.0, .833, 1.0, 3.73
 */