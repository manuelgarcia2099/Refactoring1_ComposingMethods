package cm1_extractMethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCm1ExtractMethod {
	
	@Test
	void testCM1() {
		ProblemaCm1 problema1 = new ProblemaCm1("Juan Perez S.A",200);
		problema1.imprimirDeuda();

	}
	
	@Test
	void testEj1_Sol() {
		Ej1_Solucion solucion = new Ej1_Solucion("Pedro Tenorio S.A",300);
		solucion.imprimirDeuda();
	}

}
