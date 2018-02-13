package cm1_extractMethod;

import org.apache.log4j.Logger;
/**
 * @author Manuel García 2018
 */
public class Ej1_Problema {
	
	private static final Logger log = Logger.getLogger(Ej1_Problema.class);
	
	private String nombre;
	private double monto;
	
	public Ej1_Problema (String nombre, double monto) {
		this.nombre=nombre;
		this.monto=monto;
	}

	public void imprimirDeuda() {
		imprimirCabecera();
		
		//Imprime Detalles
		String resultado = " ";
		resultado += " Nombre de Empresa: "+ this.getNombre();
		resultado += " Total a pagar: "+ this.getMonto();	
		
		log.debug("Resultado=> "+resultado);
	}
	
	public String imprimirCabecera() {
			String resultado = "Emisión de Reporte Ej1 ";
			return resultado;
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
