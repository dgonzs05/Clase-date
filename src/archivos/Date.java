package archivos;

public class Date{
	private int day;
	private int month;
	private int year;
	
	public int getDay(){ return day;}
	public int getMonth(){ return month;}
	public int getYear() {return year; }
	
	public void Date(int day, int month, int year) throws DateException{
		this.year= year;
		if(month < 1 || month>12){
			throw new DateException("Mes" + month + "no valido" + "Valores posibles entre 1 y 12");
		}else{
			this.month=month;
		}
		
		if(day<1 || day>31){
			throw new DateException("Dia" + day + "no valido" + "Vakires posibles entre 1 y 12");
		}else{
			this.day=day;
		}	
		
	}
	
	public String toString(){
		StringBuffer salida = new StringBuffer();
		
		salida.append(day);
		salida.append(month);
		salida.append(year);
		
		return salida.toString();
	}

}