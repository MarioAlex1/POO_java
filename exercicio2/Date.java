public class Date
{
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year)
	{//usei o setter pra não ficar redundante
		setDay(day);
		setMonth(month);
		setYear(year);
	}

	// getters
	public int getDay()
	{
		return day;
	}

	public int getMonth()
	{
		return month;
	}

	public int getYear()
	{
		return year;
	}

	// setters com validação
	public void setDay(int day)
	{
    		if(day >= 1 && day <= 31)
    		{
        		this.day = day;
    		} else {
		        throw new IllegalArgumentException("Dia inválido");
		}
	}

	public void setMonth(int month)
	{
    		if(month >= 1 && month <= 12)
    		{
        		this.month = month;
	    	} else {
       			throw new IllegalArgumentException("Mês inválido");
    		}
	}

	public void setYear(int year)
	{
    		if(year > 0)
    		{
        		this.year = year;
    		} else {
        		throw new IllegalArgumentException("Ano inválido");
    		}
	}

	// método displayDate()
	public void displayDate()
	{
		System.out.println(day + "/" + month + "/" + year);
	}
}
