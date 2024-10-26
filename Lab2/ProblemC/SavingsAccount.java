package Lab2.ProblemC;

public class SavingsAccount extends Account 
{
    private double interestPercent;

    public SavingsAccount(int id, double interest)
    {
        super(id);
        this.interestPercent = interest;
    }

    public void addInterest()
    {
        setBalance(getBalance() * (1 + interestPercent * 0.01));
    }

    @Override
    public String toString() 
    {
        return "On account №" + getAccountNumber() + ": " + getBalance() + " amount of currency" + "\r\n" + "Interest percent is: " + interestPercent + "%";
    }
}
