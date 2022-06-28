package calcoloPoligono;

public class test 
{

	public static void main(String[] args) 
	{
		
		//rettango test
		try 
		{
			Rettangolo ret = new Rettangolo(1, 10);
			ret.calcoloArea();
			ret.calcoloPerimetro();
		} catch (NullPointerException  e) 
		{
		  System.out.println("Dati non validi");
		  System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		//triangolo test
		try {
			Triangolo tri = new Triangolo(10, 20, 13);
			
			tri.calcoloArea();
			tri.calcoloPerimetro();
		}catch (NullPointerException  e) 
		{
			  System.out.println("Dati non validi");
			  System.out.println(e.getMessage());
			}
		
	}

}
