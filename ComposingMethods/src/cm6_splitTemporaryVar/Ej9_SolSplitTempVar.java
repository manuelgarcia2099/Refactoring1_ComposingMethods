package cm6_splitTemporaryVar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;

import cm5_introduceExplainingVar.Ej8_SolIntroduceExplainingVar;

public class Ej9_SolSplitTempVar {
	
	private static final Logger log = Logger.getLogger(Ej9_SolSplitTempVar.class);

	private String nombre;
	private int edad;
	private Date fechaDeRegisro;
	
	public Ej9_SolSplitTempVar(String nombre, int edad) {
		this.nombre=nombre;
		this.edad = edad;
	}
	
	public void imprimirInformacion() {
		String resultado="";
		resultado += getNombre();
		resultado += getEdad();
		resultado += generarFechaDeRegistro();
		log.debug("Registro del Trabajador: "+resultado);
	}

	private String generarFechaDeRegistro() {
		Calendar fecha = Calendar.getInstance();
        final int anho = fecha.get(Calendar.YEAR);
        final int mes = fecha.get(Calendar.MONTH) + 1;
        final int dia = fecha.get(Calendar.DAY_OF_MONTH);
        return " Año: "+anho+" Mes: "+mes+" Día:"+dia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Date getFechaDeRegisro() {
		return fechaDeRegisro;
	}

	public void setFechaDeRegisro(Date fechaDeRegisro) {
		this.fechaDeRegisro = fechaDeRegisro;
	}
		
	
	

}
