package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {

	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
	private final Forma mano;

	public Mano(final Forma forma) {
		/*throw new RuntimeException("No implementado aún");*/
		this.mano = forma;
	}

	public Integer getValor() {
		return this.mano.getValor();
	}

	private boolean gane(final Mano otra) {
		switch(this.mano.getValor()) {
		 case 0:
		     if (otra.getValor() == 3 || otra.getValor() == 4) {
		    	 return true; 
		    	 }
		     break;
		 case 1:
			 if (otra.getValor() == 4 || otra.getValor() == 0) {
		    	 return true;
		    	 }
		     break;
		 case 2:
			 if (otra.getValor() == 0 || otra.getValor() == 1) {
		    	 return true;
		    	 }
		     break;
		 case 3:
			 if (otra.getValor() == 1 || otra.getValor() == 2) {
		    	 return true;
		    	 }
		     break;
		 case 4:
			 if (otra.getValor() == 2 || otra.getValor() == 3) {
		    	 return true;
		    	 }
		     break;
		 default:
		 	return false;
		}
		return false;
	}
	
	private boolean empate(final Mano otra) {
		if (this.mano.getValor() == otra.getValor()) {
			return true;
		}
		return false;
	}

	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		//throw new RuntimeException("No implementado aún");
		if (this.gane(otra)) {
			return Resultado.GANA;
			}
		if (this.empate(otra)) {
			return Resultado.EMPATA;
			}
		return Resultado.PIERDE;
	}
}
