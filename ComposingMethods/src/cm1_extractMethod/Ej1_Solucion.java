package cm1_extractMethod;

import org.apache.log4j.Logger;

/**
 * @author Manuel García 2018
 */
public class Ej1_Solucion {
	
	private static final Logger log = Logger.getLogger(Ej1_Solucion.class);

	private String nombre;
	private double monto;
	
	public Ej1_Solucion (String nombre, double monto) {
		this.nombre=nombre;
		this.monto=monto;
	}

	public void imprimirDeuda() {
		imprimirCabecera();		
		imprimirDetalle();		
	}
	
	public String imprimirCabecera() {
		String resultado = "Emisión de Reporte";
		return resultado;
	}

	private void imprimirDetalle() {
		String resultado = " ";
		resultado += " Nombre de Empresa: "+ this.getNombre();
		resultado += " Total a pagar: "+ this.getMonto();	
		log.debug("Resultado=> "+resultado);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

}
