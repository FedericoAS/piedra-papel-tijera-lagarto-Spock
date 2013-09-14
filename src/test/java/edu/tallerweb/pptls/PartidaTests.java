package edu.tallerweb.pptls;

import static org.junit.Assert.*;
import org.junit.Test;

public class PartidaTests {

	@Test
	public void queSpockVaporizaPiedra() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Spock vaporiza piedra",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void queSpockDestrozaTijera() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Spock destroza Tijera",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queSpockEsEnvenenadoPorLagarto() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Spock es envenenado por Lagarto",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queSpockEsRefutadoPorPapel() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Spock es refutado por Papel",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queSpockEmpataSpock() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Spock empata Spock",
				Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queTijeraCortaPapel() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Tijera corta Papel",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queTijeraDecapitaLagarto() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Tijera decapita Lagarto",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queTijeraEsDestrozadaPorSpock() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Tijera es destrozada por Spock",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queTijeraEsAplastadaporPiedra() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Tijera es aplastada por Piedra",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

	}
	@Test
	public void queTijeraEmpataTijera() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Tijera empata Tijera",
				Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void quePapelCubrePiedra() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Papel cubre Piedra",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void quePapelRefutaSpock() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Papel refuta Spock",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void quePapelEsCortadoPorTijera() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Papel es cortado por Tijera",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void quePapelEsComidoPorLagarto() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Papel es comido por Lagarto",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void quePapelEmpataPapel() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Papel empata Papel",
				Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));

	}
		
	@Test
	public void quePiedraAplastaLagarto() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Piedra aplasta Lagarto",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void quePiedraAplastaTijera() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Piedra aplasta Tijera",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void quePiedraEsCubiertaPorPapel() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Piedra es cubierta por Papel",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void quePiedraEsVaporizadaPorSpock() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Piedra es vaporizada por Spock",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void quePiedraEmpataPiedra() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Piedra empata Piedra",
				Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queLagartoEnvenenaSpock() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Lagarto envenena Spock",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queLagartoComePapel() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Lagarto come Papel",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queLagartoEsAplastadoPorPiedra() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Lagarto es aplastado por Piedra",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queLagartoEsDecapitadoPorTijera() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Lagarto es decapitado por Tijera",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queLagartoEmpataLagarto() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Lagarto empata Lagarto",
				Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));

	}

}
