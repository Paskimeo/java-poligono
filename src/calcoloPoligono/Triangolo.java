package calcoloPoligono;

public class Triangolo implements PerimetroArea {

	
	//attributi
		 private int altezza,lunghezza,lato;

		//costruttore
		public Triangolo (int altezza, int lunghezza,int lato) {
			
			
			if (altezza <= 0 || lunghezza <= 0 || lato <= 0) {
			     throw new NullPointerException("il valore non puo essere 0 o negativo");
			     }
			
			
			
			this.altezza=altezza;
			this.lunghezza=lunghezza;
			this.lato=lato;
		}

		
		public int getLato() {
			return lato;
		}


		public void setLato(int lato) {
			this.lato = lato;
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
			 System.out.println(lato * 3);

		 }
		 
		 
		 @Override
		 public void calcoloArea() {
			System.out.println((lunghezza * altezza)/2);
		 }
	
}
