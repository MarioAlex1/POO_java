public class BasePlusCommissionEmployee extends CommissionEmployee
{
	private double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, String cpf, double grossSales, double commissionRate, double baseSalary)
	{
		super(firstName, lastName, cpf, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}

	public void setBaseSalary(double baseSalary)
	{
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary()
	{
		return baseSalary;
	}

	@Override
	public double earnings()
	{
		return baseSalary + super.earnings();
	}

	@Override
	public String toString()
	{
		return super.toString() +
		       "\nSalário Base: " + baseSalary;
	}
}
