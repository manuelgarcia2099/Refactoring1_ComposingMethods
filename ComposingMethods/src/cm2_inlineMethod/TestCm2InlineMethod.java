package cm2_inlineMethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import helpers.Producto;

class TestCm2InlineMethod {

	@Test
	void testEj5_Problema() {
		Ej5_Problema clienteProblema5 = new Ej5_Problema("Empresa 5 S.A");
		
		Producto producto1 = new Producto("Camiseta",200);
		Producto producto2 = new Producto("Zapatos",150);
		Producto producto3 = new Producto("Gorra",50);
		Producto producto4 = new Producto("Camisa",200);
		
		clienteProblema5.agregarProducto(producto1);
		clienteProblema5.agregarProducto(producto2);
		clienteProblema5.agregarProducto(producto3);
		clienteProblema5.agregarProducto(producto4);
		
		clienteProblema5.imprimirDeuda();
	}
	
	@Test
	void testEj5_SolNatural() {
		Ej5_SolNatural clienteSolucion5 = new Ej5_SolNatural("Empresa 5.1 S.A");
		Producto producto1 = new Producto("Camiseta",200);
		Producto producto2 = new Producto("Zapatos",150);
		Producto producto3 = new Producto("Gorra",50);
		Producto producto4 = new Producto("Camisa",200);
		
		clienteSolucion5.agregarProducto(producto1);
		clienteSolucion5.agregarProducto(producto2);
		clienteSolucion5.agregarProducto(producto3);
//		clienteSolucion5.agregarProducto(producto4);
		
		clienteSolucion5.imprimirDeuda();
	}

}
