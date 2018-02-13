package cm3_inlineTemp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import helpers.Producto;

class TestCm3InlineTemp {

	@Test
	void testEj6_Problema() {
		Ej6_Problema clienteProblema6 = new Ej6_Problema("Empresa 5 S.A");
		
		Producto producto1 = new Producto("Camiseta",200);
		Producto producto2 = new Producto("Zapatos",150);
		Producto producto3 = new Producto("Gorra",50);
		Producto producto4 = new Producto("Camisa",200);
		
		Producto producto5 = new Producto("Impresora",1200);
		
		clienteProblema6.agregarProducto(producto1);
		clienteProblema6.agregarProducto(producto2);
		clienteProblema6.agregarProducto(producto3);
		clienteProblema6.agregarProducto(producto4);
		clienteProblema6.agregarProducto(producto5);
		
		clienteProblema6.imprimirDeuda();
	}
	
	@Test
	void testEj6_SolInLineTempVar() {
		Ej6_SolInLineTempVar clienteSolucion6 = new Ej6_SolInLineTempVar("Empresa 5.1 S.A");
		Producto producto1 = new Producto("Camiseta",200);
		Producto producto2 = new Producto("Zapatos",150);
		Producto producto3 = new Producto("Gorra",50);
		Producto producto4 = new Producto("Camisa",200);
		
		Producto producto5 = new Producto("Impresora",1200);
		
		clienteSolucion6.agregarProducto(producto1);
		clienteSolucion6.agregarProducto(producto2);
		clienteSolucion6.agregarProducto(producto3);
		clienteSolucion6.agregarProducto(producto4);
		clienteSolucion6.agregarProducto(producto5);
		
		clienteSolucion6.imprimirDeuda();
	}

}
