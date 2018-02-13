package cm1_extractMethod;

import org.apache.log4j.Logger;
/**
 * @author Manuel García 2018
 */
public class Ej3_SolConVarLocal {
	
	private static final Logger log = Logger.getLogger(Ej3_SolConVarLocal.class);

	private String nombre;
	private double monto;
	
	public Ej3_SolConVarLocal (String nombre, double monto) {
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
		
		resultado += calcularTotalIncluidoImpuesto(this.getMonto());
		
		log.debug("Resultado=> "+resultado);
		
	}
	
	//#R
	public String calcularTotalIncluidoImpuesto(double monto) {
		String resultado="";
		double impuesto = (this.getMonto()*1.8)/100;
		double total = this.getMonto()+impuesto;
		resultado += " Impuesto: "+impuesto;
		resultado += " Total incluido Impuesto: "+total;
		return resultado;
	}
	
	public String imprimirCabecera() {
		String resultado = " Emisión de Reporte |";
		resultado += " GMP Soluciones Generales |";
		resultado += " @ Copyright 2018 - 2020 |";
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
