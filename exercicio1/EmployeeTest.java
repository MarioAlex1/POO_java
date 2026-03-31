public class EmployeeTest
{
	public static void main(String[] args)
	{
		Employee pessoa1 = new Employee("Mário", "Barbosa", 5500);
		Employee pessoa2 = new Employee("Deborah", "Sousa", 5000);

		System.out.println("Salário anual de " + (pessoa1.getFirstName()) + " é " + (pessoa1.getSalary()*12));
		System.out.println("Salário anual de " + (pessoa2.getFirstName()) + " é " + (pessoa2.getSalary()*12));

		pessoa1.setSalary(pessoa1.getSalary() * 1.10);
		pessoa2.setSalary(pessoa2.getSalary() * 1.10);

		System.out.println("Salário anual de " + (pessoa1.getFirstName()) + " é " + (pessoa1.getSalary()*12));
		System.out.println("Salário anual de " + (pessoa2.getFirstName()) + " é " + (pessoa2.getSalary()*12));
	}
}
