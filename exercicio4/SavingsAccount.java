public class SavingsAccount
{
	// todas as instancias compartilham a mesma taxa
	private static double annualInterestRate;
	private double savingsBalance;

	public SavingsAccount(double savingsBalance)
	{
		this.savingsBalance = savingsBalance;
	}

	public void calculateMonthlyInterest()
	{
		// juros = (saldo * taxaanual) / 12
		double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
		this.savingsBalance += monthlyInterest;
	}

	// Método static so mexe em variáveis static
	public static void modifyInterestRate(double newRate)
	{
		annualInterestRate = newRate;
	}

	// getter do saldo
	public double getSavingsBalance()
	{
		return savingsBalance;
	}
}
