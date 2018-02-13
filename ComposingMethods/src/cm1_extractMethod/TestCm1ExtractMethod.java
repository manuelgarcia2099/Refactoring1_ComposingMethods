package cm1_extractMethod;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import helpers.Producto;
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
	void testEj3_SolConVarLocal() {
		Ej3_SolConVarLocal solucion3 = new Ej3_SolConVarLocal("Empresa 3.1 S.A",300);
		solucion3.imprimirDeuda();
	}
	
	@Test
	void testEj4_Problema() {
		Ej4_Problema clienteProblema4 = new Ej4_Problema("Empresa 4 S.A");
		
		Producto producto1 = new Producto("Camiseta",200);
		Producto producto2 = new Producto("Zapatos",150);
		Producto producto3 = new Producto("Gorra",50);
		
		clienteProblema4.agregarProducto(producto1);
		clienteProblema4.agregarProducto(producto2);
		clienteProblema4.agregarProducto(producto3);
		
		clienteProblema4.imprimirDeuda();
	}
	
	@Test
	void testEj4_SolModificarVarLocal() {
		Ej4_SolModificarVarLocal clienteSolucion4 = new Ej4_SolModificarVarLocal("Empresa 4.1 S.A");
		Producto producto1 = new Producto("Camiseta",200);
		Producto producto2 = new Producto("Zapatos",150);
		Producto producto3 = new Producto("Gorra",50);
		
		clienteSolucion4.agregarProducto(producto1);
		clienteSolucion4.agregarProducto(producto2);
		clienteSolucion4.agregarProducto(producto3);
		
		clienteSolucion4.imprimirDeuda();
	}

}
