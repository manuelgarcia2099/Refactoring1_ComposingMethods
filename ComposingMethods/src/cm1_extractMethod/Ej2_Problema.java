package cm1_extractMethod;

import org.apache.log4j.Logger;
/**
 * @author Manuel García 2018
 */
public class Ej2_Problema {
	
	private static final Logger log = Logger.getLogger(Ej2_Problema.class);
	
	private String nombre;
	private double monto;
	
	public Ej2_Problema (String nombre, double monto) {
		this.nombre=nombre;
		this.monto=monto;
	}

	public void imprimirDeuda() {
		String resultado ="";
		
		//#R
		resultado += " Emisión de Reporte Ej2|";
		resultado += " GMP Soluciones Generales |";
		resultado += " @ Copyright 2018 - 2020 |";
		
		//Imprime Detalles
		resultado += " Nombre de Empresa: "+ this.getNombre();
		resultado += " Deuda sin impuesto: "+ this.getMonto();	
		
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
