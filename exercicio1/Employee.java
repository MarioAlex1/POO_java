public class Employee
{
// Os três atributos pedidos
	private String firstName;
	private String lastName;
	private double salary;

	public Employee(String firstName, String lastName, double salary)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		// validação do salário
		if(salary > 0){
			this.salary = salary;
		} else {
			throw new IllegalArgumentException("O salário deve ser positivo");
		}
	}

	// getters
	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public double getSalary()
	{
		return salary;
	}

	// setters
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public void setSalary(double salary)
	{
		if(salary > 0){
			this.salary = salary;
		} else {
			throw new IllegalArgumentException("O salário deve ser positivo");
		}
	}
}
