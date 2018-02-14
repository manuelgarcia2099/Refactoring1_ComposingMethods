package cm8_replaceMehodWithMethodObj;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cm7_removeAssignmentsToParams.Ej10_Problema;
/**
 * @author Manuel García 2018
 */
class TestCm8RecplaceMethodWithMethodObj {

	@Test
	void testEj11_Problema() {
		Ej11_Problema clienteProblema11 = new Ej11_Problema("Juan","Perez",15,15,15,2);
//		Ej11_Problema clienteProblema11 = new Ej11_Problema("Cesar","Valenzuela",10,10,10,1);
		clienteProblema11.generarInformacion();;
	}
	
	@Test
	void testEj11_SolReplaceMethodWithMethodObj() {
		Ej11_SolReplaceMethodWithMethodObj clienteSolucion11 = new Ej11_SolReplaceMethodWithMethodObj("Juan","Perez",15,15,15,2);
//		Ej11_SolReplaceMethodWithMethodObj clienteSolucion11 = new Ej11_SolReplaceMethodWithMethodObj("Cesar","Valenzuela",10,10,10,1);
		clienteSolucion11.generarInformacion();;
	}

}
