package cm1_extractMethod;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 * @author Manuel García 2018
 */
class TestCm1ExtractMethod {
	
	@Test
	void testEj1_Problema() {
		Ej1_Problema problema1 = new Ej1_Problema("Empresa 1 S.A",100);
		problema1.imprimirDeuda();
	}
	
	@Test
	void testEj1_SolNatural() {
		Ej1_SolNatural solucion1 = new Ej1_SolNatural("Empresa 1.1 S.A",100);
		solucion1.imprimirDeuda();
	}
	
	@Test
	void testEj2_Problema() {
		Ej2_Problema problema2 = new Ej2_Problema("Empresa 2 S.A",200);
		problema2.imprimirDeuda();
	}
	
	@Test
	void testEj2_SolSinVarLocal() {
		Ej2_SolSinVarLocal solucion2 = new Ej2_SolSinVarLocal("Empresa 2.1 S.A",200);
		solucion2.imprimirDeuda();
	}
	
	@Test
	void testEj3_Problema() {
		Ej3_Problema problema3 = new Ej3_Problema("Empresa 3 S.A",300);
		problema3.imprimirDeuda();
	}
	
	@Test
	void testEj2_SolConVarLocal() {
		Ej3_SolConVarLocal solucion3 = new Ej3_SolConVarLocal("Empresa 3.1 S.A",300);
		solucion3.imprimirDeuda();
	}

}
