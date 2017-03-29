package archivos;

public class MainDate {
	
	public static void main(String[] args){
		
		Date today;
		
		try{
			today = new Date(29,03,2017);
		} catch (DateException e) {
			System.out.println(e.getMesage());
		}
	}
}