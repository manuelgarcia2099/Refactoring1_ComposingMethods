package cm1_extractMethod;

import org.apache.log4j.Logger;
/**
 * @author Manuel García 2018
 */
public class Ej3_Problema {
	
	private static final Logger log = Logger.getLogger(Ej3_Problema.class);
	
	private String nombre;
	private double monto;
	
	public Ej3_Problema (String nombre, double monto) {
		this.nombre=nombre;
		this.monto=monto;
	}

	public void imprimirDeuda() {
		imprimirCabecera();
		
		//Imprime Detalles
		String resultado = " ";
		resultado += " Nombre de Empresa: "+ this.getNombre();
		resultado += " Total a pagar: "+ this.getMonto();	
		
		//#R
		double impuesto = (this.getMonto()*1.8)/100;
		resultado += " Impuesto: "+impuesto;
		resultado += " Total a pagar (Con impuesto): "+(this.getMonto()+impuesto);
		
		log.debug("Resultado=> "+resultado);
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

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
	
}
