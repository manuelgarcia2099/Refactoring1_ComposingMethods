package cm5_introduceExplainingVar;

import java.util.Enumeration;
import java.util.Vector;

import org.apache.log4j.Logger;

import helpers.Producto;
/**
 * @author Manuel García 2018
 */
public class Ej8_Problema {
	
	private static final Logger log = Logger.getLogger(Ej8_Problema.class);

	private String nombre;
	private String modelo;
	private double precio;
	private int cantidad;
	
	public Ej8_Problema (String nombre, String modelo, double precio, int cantidad) {
		this.nombre=nombre;
		this.modelo=modelo;
		this.precio=precio;
		this.cantidad=cantidad;
	}
	
	public void imprimirInformacion() {
		
		String resultado="";
		resultado += imprimirCabecera();
		resultado += imprimirDetalle();
		resultado += calcularPrecioTotal();
		log.debug("Resultado=> "+resultado);
	}
	
	private String calcularPrecioTotal() {
		double descuento=0;
		double montoConDescuento=0;
		double impuesto=0;
		double montoTotal=0;
		if(getCantidad()>100) {
			descuento= generarDescuento(getPrecio());
		}
		montoConDescuento=getPrecio()-descuento;
		impuesto = calcularImpuesto(montoConDescuento);
		montoTotal= montoConDescuento + impuesto;
		return " | Precio: "+getPrecio()
				+" | Descuento: "+descuento
				+" | Precio con Descuento:"+montoConDescuento
				+" | Impuesto: "+impuesto
				+" | Precio Total: "+montoTotal;
	}

	//#R
	private double generarDescuento(double precio) {
		if(getNombre().toUpperCase().indexOf("MAC")> -1 && getModelo().toUpperCase().indexOf("MACBOOKPRO14")>-1) {
			return (getPrecio()*5)/100;
		}else {
			return (getPrecio()*10)/100;
		}
	}


	private double calcularImpuesto(double monto) {
		return (monto*1.8)/100;
	}

	private String imprimirDetalle() {
		return " Producto: "+ this.getNombre() +" | Modelo: "+this.getModelo() +"|Cantidad: "+ this.getCantidad();	

	}
	
	public String imprimirCabecera() {
			return "Emisión de Reporte: ";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
