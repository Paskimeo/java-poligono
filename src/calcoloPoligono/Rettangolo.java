package calcoloPoligono;

public class Rettangolo implements PerimetroArea {
	
	//attributi
	 private int altezza,lunghezza;

	//costruttore
	public Rettangolo (int altezza, int lunghezza)throws NullPointerException {
		
		if (altezza <= 0 || lunghezza <= 0) {
		     throw new NullPointerException("il valore non puo essere 0 o negativo");
		     }
		
		
		
		this.altezza=altezza;
		this.lunghezza=lunghezza;
	}

	
	public int getAltezza() {
		return altezza;
	}


	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	public int getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(int lunghezza) {
		this.lunghezza = lunghezza;
	}









	//metodi
	 @Override
	 public void calcoloPerimetro() {
		 System.out.println((lunghezza + altezza) * 2);

	 }
	 
	 
	 @Override
	 public void calcoloArea() {
		System.out.println(lunghezza * altezza);
	 }
}
