package calcoloPoligono;

public class test 
{

	public static void main(String[] args) 
	{
		
		//rettango test
		try 
		{
			Rettangolo ret = new Rettangolo(10, 10);
			System.out.println(ret.calcoloArea());
			System.out.println(ret.calcoloPerimetro());
		} catch (NullPointerException  e) 
		{
		  System.out.println("Dati non validi");
		  System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		//triangolo test
		try {
			Triangolo tri = new Triangolo(10, 20, 13);
			
			System.out.println(tri.calcoloArea());
			System.out.println(tri.calcoloPerimetro());
		}catch (NullPointerException  e) 
		{
			  System.out.println("Dati non validi");
			  System.out.println(e.getMessage());
			}
		
	}

}
