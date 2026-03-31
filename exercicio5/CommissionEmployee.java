public class CommissionEmployee extends Employee
{
	private double grossSales;
	private double commissionRate;

	public CommissionEmployee(String firstName, String lastName, String cpf, double grossSales, double commissionRate)
	{
		super(firstName, lastName, cpf);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public void setGrossSales(double grossSales)
	{
		this.grossSales = grossSales;
	}

	public double getGrossSales()
	{
		return grossSales;
	}

	public void setCommissionRate(double commissionRate)
	{
		this.commissionRate = commissionRate;
	}

	public double getCommissionRate()
	{
		return commissionRate;
	}

	@Override
	public double earnings()
	{
		return grossSales * commissionRate;
	}

	@Override
	public String toString()
	{
		return super.toString() +
		       "\nVendas: " + grossSales +
		       "\nComissão: " + commissionRate;
	}
}
