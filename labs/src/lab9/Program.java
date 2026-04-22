package lab9;

import java.io.Console;

public class Program {

	public static void main(String[] args) {

		int id = 123;
		String owner = "Jess";
	    double balance = 100;
  
	}
    public String GetDetails()
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
    		throw new ArgumentException("Not enough money in account" + amount);
    		    	}
    }
    public void Close()
    {
    	Console.writeLine("Account 123 is closed!");
    
    }

	
}