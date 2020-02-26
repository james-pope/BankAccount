public class SpecialCheckingAccount extends CheckingAccount {
    private double interest;
    private double minBal;
    public SpecialCheckingAccount(int id, double startBal, double cc, double inter, double minB){
        super(id, startBal, cc);
        interest = inter;
        minBal = minB;
    }
    public void clearCheck(double amount){
        if (currentBalance() > minBal) decreaseBalance(amount);
        else super.clearCheck(amount);
    }
    public double monthlyInterest(){
        if (currentBalance() > minBal) return currentBalance() * (interest/12);
        else return 1.0;
    }
}
