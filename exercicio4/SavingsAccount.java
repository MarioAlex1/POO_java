public class SavingsAccount
{
	private static double annualInterestRate;
	private double savingsBalance; // saldo

	public SavingsAccount(double savingsBalance)
	{
		this.savingsBalance = savingsBalance;
	}

	public void calculateMonthlyInterest()
	{
		savingsBalance += (savingsBalance * annualInterestRate) / 12;
	}

	public static void modifyInterestRate(double newRate)
	{
		annualInterestRate = newRate;
	}

	public double getSavingsBalance()
	{
		return savingsBalance;
	}
}
