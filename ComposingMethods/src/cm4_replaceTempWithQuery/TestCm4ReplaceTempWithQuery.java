package cm4_replaceTempWithQuery;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cm3_inlineTemp.Ej6_Problema;
import cm5_introduceExplainingVar.Ej8_Problema;
import helpers.Producto;

class TestCm4ReplaceTempWithQuery {

	@Test
	void testEj7_Problema() {
		Ej7_Problema clienteProblema7 = new Ej7_Problema("Empresa 7 S.A");
		
		Producto producto1 = new Producto("Camiseta",100);
		Producto producto2 = new Producto("Impresora",2000);
		
		clienteProblema7.agregarProducto(producto1);
		clienteProblema7.agregarProducto(producto2);
		
		clienteProblema7.imprimirDeuda();
	}
	
	@Test
	void testEj7_SolReplaceTempVarByQuery() {
		Ej7_SolReplaceTempVarByQuery clienteProblema7 = new Ej7_SolReplaceTempVarByQuery("Empresa 7.1 S.A");
		
		Producto producto1 = new Producto("Camiseta",100);
		Producto producto2 = new Producto("Impresora",2000);
		
		clienteProblema7.agregarProducto(producto1);
		clienteProblema7.agregarProducto(producto2);
		
		clienteProblema7.imprimirDeuda();
	}
	

}
