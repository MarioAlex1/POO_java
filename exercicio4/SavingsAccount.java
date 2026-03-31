public class SavingsAccount
{
	private static double annualInterestRate;
	private double savingsBalance;

	public SavingsAccount(double savingsBalance)
	{
		this.savingsBalance = savingsBalance;
	}

	// O método para calcular o juros mensal pedido na questão
	public void calculateMonthlyInterest()
	{
		savingsBalance += (savingsBalance * annualInterestRate) / 12;
	}

	// Método que ajusta o valor da taxa
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
