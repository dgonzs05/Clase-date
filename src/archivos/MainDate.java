package archivos;

public class MainDate {
	
	public static void main(String[] args){
		
		Date today;
		
		try{ //Intenta llevar a cabo una accion
			today = new Date(29,03,2017);
			
		} catch (DateException e) {//Cuando el try falla hace una captura del error
			System.out.println(e.getMessage());
		}
	}
}