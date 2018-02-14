package cm4_replaceTempWithQuery;

import java.util.Enumeration;
import java.util.Vector;

import org.apache.log4j.Logger;

import helpers.Producto;
/**
 * @author Manuel García 2018
 */
public class Ej7_SolReplaceTempVarByQuery {
	
	private static final Logger log = Logger.getLogger(Ej7_SolReplaceTempVarByQuery.class);

	private String nombre;
	private Vector productos = new Vector();
	
	public Ej7_SolReplaceTempVarByQuery (String nombre) {
		this.nombre=nombre;
	}
	
	public void agregarProducto(Producto producto) {
		productos.addElement(producto);
	}

	public void imprimirDeuda() {
		
		imprimirCabecera();
		String resultado = " ";
		
		double deuda = getMontoDeDeuda();
		
		resultado+=imprimirDetalle(deuda);
		
		log.debug("Resultado=> "+resultado);
	}
	
	//#R
	private double getMontoDeDeuda() {
		
		double deuda=00;
		Enumeration totalPedidos = productos.elements();
		while(totalPedidos.hasMoreElements()) {
			double descuento=0;
			Producto producto = (Producto) totalPedidos.nextElement();
			deuda += getPagoPorProducto(producto);	
			if(getPagoPorProducto(producto)>1000) {
				descuento=(getPagoPorProducto(producto)*10)/100;
			}else {
				descuento=(getPagoPorProducto(producto)*5)/100;
			}
			deuda -= descuento;
		}
		return deuda;
	}
	
	//#R
	private double getPagoPorProducto(Producto producto) {
		return producto.getPrecio();
	}

	private String imprimirDetalle(double deuda) {

		double impuesto = (deuda*1.8)/100;
		
		//Imprime Detalles
		String resultado = " ";
		resultado += " Nombre de Empresa: "+ this.getNombre();
		resultado += " Total a pagar: "+ deuda;	
		resultado += " Impuesto: "+impuesto;
		resultado += " Total a pagar (Con impuesto): "+(deuda+impuesto);
		return resultado;

	}
	
	public String imprimirCabecera() {
			String resultado = "Emisión de Reporte";
			return resultado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
