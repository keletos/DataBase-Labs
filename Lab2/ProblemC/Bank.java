package Lab2.ProblemC;

import java.util.Vector;

public class Bank
{
    private Vector<Account> accounts;

    public Bank() 
    {
        accounts = new Vector<>();
    }

    public void addAccount(Account account) 
    {
        accounts.add(account);
    }

    public void update()
    {
        for (Account account : accounts)
        {
            if (account instanceof CheckingAccount) 
            {
                ((CheckingAccount)account).deductFee();
            }

            else if (account instanceof SavingsAccount) 
            {
                ((SavingsAccount)account).addInterest();
            }
        }
    }

    @Override
    public String toString() 
    {
        return "Number of accounts in bank: " + accounts.size();
    }
}
