package cm9_substituteAlgorithm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCm9SubstituteAlgorithm {

	@Test
	void testEj12_Problema() {
		String [] dato= {"Don", "John", "Kent", "Juan", "Pedro", "Carlos"};
		Ej12_Problema problema12 = new Ej12_Problema(dato);
		problema12.imprimirInformacion();
	}
	
	@Test
	void testEj12_SolSubstituteAlgorithm() {
		String [] dato= {"Don", "John", "Kent", "Juan", "Pedro", "Carlos"};
		Ej12_SolSubstituteAlgorithm solucion12 = new Ej12_SolSubstituteAlgorithm(dato);
		solucion12.imprimirInformacion();
	}

}
