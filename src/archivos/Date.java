package archivos;

public class Date //Declarar la clase
{
	private int day;
	private int month;
	private int year;
	//Permite acceder a las variables declaradas como variables privadas
	public int getDay(){ return this.day;}
	public int getMonth(){ return this.month;}
	public int getYear() {return this.year; }
	
	public void Date(int day, int month, int year) throws DateException
	{ //Declarar las condiciones y excepciones de la clase
		this.year= year;
		if(month < 1 || month>12){
			throw new DateException("Mes" + month + "no valido" + "Valores posibles entre 1 y 12");
		}else
		{
			this.month=month;
		}
		
		if(day<1 || day>31)
		{
			throw new DateException("Dia" + day + "no valido" + "Vakires posibles entre 1 y 12");
		}else
		{
			this.day=day;
		}	
		
	}
	public boolean isSameYear( int year)
	{
		boolean equals=false;
		if(this.getYear()==year)
		{
			equals = true;
		}
		return equals;
	}
	public boolean isSameMonth(int month)
	{
		boolean equals=false;
		if(this.getMonth()==month)
		{
			equals = true;
		}
		return equals;
	}
	public boolean isSameDay(int day)
	{
		boolean equals=false;
		if(this.getDay()==day)
		{
			equals = true;
		}
		return equals;
	}
	public boolean isSame(Date date)
	{
		boolean equals=false;
		if(this.getYear()==date.getYear() && this.getMonth()==date.getMonth() && this.getYear()==date.getYear())
		{
			equals=true;
		}
		return equals;
	}
	
	public String MonthName(Date date)
	{
		String nombre = new String();
		
		switch(this.month){
			
			case 1:
						nombre="Enero";
			break;
			
			case 2:
						nombre="Febrero";
			break;
			
			case 3:
						nombre="Marzo";
			break;
						
			case 4:
						nombre="Abril";
			break;
			
			case 5:
						nombre="Mayo";
			break;
			
			case 6:
						nombre="Junio";
			break
			;
			case 7: 
						nombre="Julio";
			break;
			
			case 8: 
						nombre="Agosto";
			break;
			
			case 9: 
						nombre="Septiembre";
			break;
			
			case 10:
						nombre="Octubre";
			break;
			
			case 11:
						nombre="Noviembre";
			break;
			
			case 12:
						nombre="Diciembre";
			break;
			
			default: nombre= "Error";
		}
		return nombre;
	}
	//Se configura una salida para las variables de la clase
	public String toString()
	{
		StringBuffer salida = new StringBuffer();
		
		salida.append("day="+this.day+",");
		salida.append("month="+this.month+",");
		salida.append("year="+this.year+",");
		
		return salida.toString();
	}

}