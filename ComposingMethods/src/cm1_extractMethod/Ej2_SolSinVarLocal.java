package cm1_extractMethod;

import org.apache.log4j.Logger;

public class Ej2_SolSinVarLocal {
	
	private static final Logger log = Logger.getLogger(Ej2_SolSinVarLocal.class);

	private String nombre;
	private double monto;
	
	public Ej2_SolSinVarLocal (String nombre, double monto) {
		this.nombre=nombre;
		this.monto=monto;
	}

	public void imprimirDeuda() {
		String resultado = "";
		resultado += imprimirCabecera();		

		//Imprime Detalles
		resultado += " Nombre de Empresa: "+ this.getNombre();
		resultado += " Total a pagar: "+ this.getMonto();	
				
		log.debug("Resultado=> "+resultado);
		
	}
	
	//#R
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
