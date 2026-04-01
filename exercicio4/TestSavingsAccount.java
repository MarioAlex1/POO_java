public class TestSavingsAccount
{
	public static void main(String[] args)
	{
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);

		// teste com 4%
		SavingsAccount.modifyInterestRate(0.04);
		System.out.println("Simulando 12 meses com 4%");

		for(int i = 1; i <= 12; i++)
		{
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
		}
		System.out.printf("Saldo final Saver1: %.2f\n", saver1.getSavingsBalance());
		System.out.printf("Saldo final Saver2: %.2f\n", saver2.getSavingsBalance());
		System.out.println();

		// teste com 5%
		SavingsAccount.modifyInterestRate(0.05);
		System.out.println("Simulando mais 1 mes a 5%");

		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		System.out.printf("Saldo final Saver1: %.2f\n", saver1.getSavingsBalance());
		System.out.printf("Saldo final Saver2: %.2f\n", saver2.getSavingsBalance());
	}
}
