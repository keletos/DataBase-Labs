package Lab2.ProblemC;

public class Account 
{
    private double  balance;
    private int accNumber;

    public Account(int id)
    {
        balance = 0.0;
        this.accNumber = id;
    }

    public void deposit(double sum)
    {
        balance += sum;
    }

    public void withdraw(double sum) 
    {
        if (balance - sum > 0) 
        {
            balance -= sum;
        }
        else 
        {
            System.out.println("Insufficient funds");
        }        
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double newBalance)
    {
        this.balance = newBalance;
    }

    public int getAccountNumber() 
    {
        return accNumber;
    }

    public void transfer(double amount, Account other) 
    {
        this.balance -= amount;
        other.balance += amount;
    }
    
    @Override
    public String toString() 
    {
        return "On account №" + getAccountNumber() + ": " + getBalance() + " amount of currency";
    }

    public final void print() 
    {
        System.out.println(toString());
    }
}
