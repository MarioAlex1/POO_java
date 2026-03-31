public class HourlyEmployee extends Employee
{
	private double wage;
	private double hours;

	public HourlyEmployee(String firstName, String lastName, String cpf, double wage, double hours)
	{
		super(firstName, lastName, cpf);
		this.wage = wage;
		this.hours = hours;
	}

	// getters e setters
	public void setWage(double wage)
	{
		this.wage = wage;
	}

	public double getWage()
	{
		return wage;
	}

	public void setHours(double hours)
	{
		this.hours = hours;
	}

	public double getHours()
	{
		return hours;
	}

	// sobrescrevendo o método abstrato earnings da classe Employee
	@Override
	public double earnings()
	{
		if (hours <= 40){
			return wage * hours;
		} else {
			return (40 * wage) + ((hours - 40) * wage * 1.5);
		}
	}

	@Override
	public String toString()
	{
		return super.toString() + "\nSalário por hora: " + wage + "\nHoras trabalhadas: " + hours;
	}
}
