public abstract class Employee
{
    private String firstName;
    private String lastName;
    private String cpf;

    public Employee(String firstName, String lastName, String cpf)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpf = cpf;
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

    public String getCpf()
    {
        return cpf;
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

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    // metodo abstrato
    public abstract double earnings();

    @Override
    public String toString()
    {
        return firstName + " " + lastName + "\nCPF: " + cpf;
    }
}
