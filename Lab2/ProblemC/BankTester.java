package Lab2.ProblemC;

public class BankTester 
{
    public static void main(String[] args) 
    {
        Bank Halyk = new Bank();
        Account account1 = new Account(0);

        Halyk.addAccount(account1);
        account1.deposit(50000);
        account1.withdraw(50001);
        account1.print();

        SavingsAccount account2 = new SavingsAccount(1, 12);
        Halyk.addAccount(account2);
        account2.deposit(100);
        
        CheckingAccount account3 = new CheckingAccount(2);
        Halyk.addAccount(account3);
        account3.deposit(1000);
        account3.withdraw(1000);
        account3.deposit(1000);
        account3.withdraw(1000);
        account3.deposit(500);
        account3.deposit(300);
        account3.deposit(200);
        account3.print();

        Halyk.update();
        account2.print();
        account3.print();
    }    
}
