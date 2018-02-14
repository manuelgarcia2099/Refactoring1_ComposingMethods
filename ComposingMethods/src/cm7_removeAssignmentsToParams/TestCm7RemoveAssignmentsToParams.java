package cm7_removeAssignmentsToParams;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Manuel García 2018
 */
import org.junit.jupiter.api.Test;

class TestCm7RemoveAssignmentsToParams {

	@Test
	void testEj10_Problema() {
		//Ej10_Problema productoProblema10 = new Ej10_Problema("Lapicero","Faber Castell",5,200);
		Ej10_Problema productoProblema10 = new Ej10_Problema("MAC","MACBOOKPRO14",1005,200);
		productoProblema10.imprimirInformacion();
	}
	
	@Test
	void testEj10_SolRemoveAssignmentsToParams() {
		//Ej10_SolRemoveAssignmentsToParams productoSolucion10 = new Ej10_SolRemoveAssignmentsToParams("Lapicero","Faber Castell",5,200);
		Ej10_SolRemoveAssignmentsToParams productoSolucion10 = new Ej10_SolRemoveAssignmentsToParams("MAC","MACBOOKPRO14",1005,200);
		productoSolucion10.imprimirInformacion();
	}


}
