package cm1_extractMethod;

import java.util.Enumeration;
import java.util.Vector;

import org.apache.log4j.Logger;

import helpers.Producto;
/**
 * @author Manuel García 2018
 */
public class Ej4_SolModificarVarLocal {
	
	private static final Logger log = Logger.getLogger(Ej4_SolModificarVarLocal.class);

	private String nombre;
	private Vector productos = new Vector();
	
	public Ej4_SolModificarVarLocal (String nombre) {
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

		double deuda =0.0;
		Enumeration totalPedidos = productos.elements();
		while(totalPedidos.hasMoreElements()) {
			Producto producto = (Producto) totalPedidos.nextElement();
			deuda += producto.getPrecio();			
		}
		return deuda;
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
