package cm6_splitTemporaryVar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cm5_introduceExplainingVar.Ej8_Problema;

class TestCm6SplitTempVar {

	@Test
	void testEj9_Problema() {
		Ej9_Problema funcionarioProblema = new Ej9_Problema("Juan Perez", 40);
		funcionarioProblema.imprimirInformacion();
	}
	
	@Test
	void testEj9_SolSplitTempVar() {
		Ej9_SolSplitTempVar funcionarioSolucion = new Ej9_SolSplitTempVar("Juan Diego", 35);
		funcionarioSolucion.imprimirInformacion();
	}
	

}
