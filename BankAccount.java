public class BankAccount
{
	double balance;

	public BankAccount()
	{
		balance = 100;
	}

	public BankAccount(double bal)
	{
		balance = bal;
	}

	public void setBalance(double newBalance)
	{
		balance = newBalance;
	}

	public Double getBalance()
	{
		return balance;
	}

	public void withdraw(double withdrawal)
	{
		balance = balance - withdrawal;
	}

	public String toString()
	{
		return ("" + balance);
	}
}