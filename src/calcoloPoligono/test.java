package calcoloPoligono;

public class test {

	public static void main(String[] args) {
		
		
		
		Rettangolo ret = new Rettangolo(10, 10);
		
		ret.calcoloArea();
		ret.calcoloPerimetro();
		
		Triangolo tri = new Triangolo(10, 20, 30);
		
		tri.calcoloArea();
		tri.calcoloPerimetro();
	}

}
