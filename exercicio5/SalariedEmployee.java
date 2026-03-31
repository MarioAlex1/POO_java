public class SalariedEmployee extends Employee
{
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String cpf, double weeklySalary)
	{
		super(firstName, lastName, cpf);
		this.weeklySalary = weeklySalary;
	}

	// setter e getter
	public void setWeeklySalary(double weeklySalary)
	{
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary()
	{
		return weeklySalary;
	}

	// implementação do earnings()
	@Override
	public double earnings()
	{
		return weeklySalary;
	}

	@Override
	public String toString()
	{
		return super.toString() + "\nSalário semanal: " + weeklySalary;
	}
}
