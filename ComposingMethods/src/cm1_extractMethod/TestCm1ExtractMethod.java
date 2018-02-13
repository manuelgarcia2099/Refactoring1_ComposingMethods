package cm1_extractMethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCm1ExtractMethod {
	
	@Test
	void testEj1_Problema() {
		Ej1_Problema problema1 = new Ej1_Problema("Empresa 1 S.A",100);
		problema1.imprimirDeuda();

	}
	
	@Test
	void testEj1_SolNatural() {
		Ej1_SolNatural solucion = new Ej1_SolNatural("Empresa 2 S.A",200);
		solucion.imprimirDeuda();
	}
	
	@Test
	void testEj2_Problema() {
		Ej2_Problema problema1 = new Ej2_Problema("Empresa 3 S.A",300);
		problema1.imprimirDeuda();

	}
	
	@Test
	void testEj2_SolSinVarLocal() {
		Ej2_SolSinVarLocal solucion = new Ej2_SolSinVarLocal("Empresa 4 S.A",400);
		solucion.imprimirDeuda();
	}

}
