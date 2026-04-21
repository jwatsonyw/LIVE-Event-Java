package lab5;

public class Program {

	public static void main(String[] args) {
		
  public class Account
{
     int id;
     string owner;
     double balance;
   
    
    public string GetDetails()
    {
       return $"ID: {id}, Owner: {owner}, Balance: {balance}";
        }
        
    public void Deposit(double amount)
    {
    	if (amount > 0)
    	{
    		balance += amount;
    		    	}
    }
    public void Withdraw(double amount)
    {
    	if (amount > 0 && amount <=balance)
    	{
    		balance -= amount;
    	}
    	else
    	{
    		throw new ArgumentException("Not enough monwey in account" + amount);
    		    	}
    	}
    public void Close()
    {
    	Console.writeLine("Account closed!")
    }
    }

	public void Deposit(double amount) {
		balance += amount;
	}

	public void Withdraw(double amount) {
		balance -= amount;
	}
}