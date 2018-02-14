package cm6_splitTemporaryVar;
/**
 * @author Manuel García 2018
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;

import cm5_introduceExplainingVar.Ej8_SolIntroduceExplainingVar;

public class Ej9_Problema {
	
	private static final Logger log = Logger.getLogger(Ej9_Problema.class);

	private String nombre;
	private int edad;
	
	public Ej9_Problema(String nombre, int edad) {
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
		String resultado="";
		Calendar fecha = Calendar.getInstance();
		int temp = 0;
        temp = fecha.get(Calendar.YEAR);
        resultado += " Año: "+temp;
        temp = fecha.get(Calendar.MONTH) + 1;
        resultado += " Mes: "+temp;
        temp = fecha.get(Calendar.DAY_OF_MONTH);
        resultado += " Día: "+temp;
        return resultado;
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

}
