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
		final int Pie = 0;
		final int Spo = 1;
		final int Pap = 2;
		final int Lag = 3;
		final int Tij = 4;

		switch(this.mano.getValor()) {
		 case Pie:
		     if (otra.getValor() == Forma.LAGARTO.getValor() || otra.getValor() == Forma.TIJERA.getValor()) {
		    	 return true;
		    	 }
		     break;
		 case Spo:
			 if (otra.getValor() == Forma.TIJERA.getValor() || otra.getValor() == Forma.PIEDRA.getValor()) {
		    	 return true;
		    	 }
		     break;
		 case Pap:
			 if (otra.getValor() == Forma.PIEDRA.getValor() || otra.getValor() == Forma.SPOCK.getValor()) {
		    	 return true;
		    	 }
		     break;
		 case Lag:
			 if (otra.getValor() == Forma.SPOCK.getValor() || otra.getValor() == Forma.PAPEL.getValor()) {
		    	 return true;
		    	 }
		     break;
		 case Tij:
			 if (otra.getValor() == Forma.PAPEL.getValor() || otra.getValor() == Forma.LAGARTO.getValor()) {
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
