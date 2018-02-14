package cm5_introduceExplainingVar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCm5IntroduceExplainingVar {

	@Test
	void testEj8_Problema() {
		//Ej8_Problema productoEj8 = new Ej8_Problema("Lapicero","Faber Castell",5,200);
		Ej8_Problema productoEj8 = new Ej8_Problema("MAC","MACBOOKPRO14",5,200);
		productoEj8.imprimirInformación();
	}
	
	@Test
	void testEj8_SolIntroduceExplainingVar() {
		//Ej8_SolIntroduceExplainingVar productoSolEj8 = new Ej8_SolIntroduceExplainingVar("Lapicero","Faber Castell",5,200);
		Ej8_SolIntroduceExplainingVar productoSolEj8 = new Ej8_SolIntroduceExplainingVar("MAC","MACBOOKPRO14",5,200);
		productoSolEj8.imprimirInformación();
	}

}
