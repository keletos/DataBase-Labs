package Lab2.ProblemC;

public class CheckingAccount extends Account 
{
    private static final int FREE_TRANSACTIONS = 5;
    private static final double TRANSACTION_FEE = 0.2; 

    private int transactionsCounter;

    public CheckingAccount(int id)
    {
        super(id);
        this.transactionsCounter = 0;
    }
    
    @Override
    public void deposit(double sum)
    {
        setBalance(getBalance() + sum);

        deductFee();
        transactionsCounter++;
    }

    @Override
    public void withdraw(double sum) 
    {
        setBalance(getBalance() - sum);

        deductFee();
        transactionsCounter++;
    }

    public void deductFee() {
        if (transactionsCounter > FREE_TRANSACTIONS) 
        {
            setBalance(getBalance() - TRANSACTION_FEE);
        }
    }
    

    @Override
    public String toString() 
    {
        return "On account №" + getAccountNumber() + ": " + getBalance() + " amount of currency" + "\r\n" + "Ammount of transactions: " + transactionsCounter;
    }
}
