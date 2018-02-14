package cm8_replaceMehodWithMethodObj;

import java.util.Enumeration;
//import java.util.Vector;

import org.apache.log4j.Logger;

/**
 * @author Manuel García 2018
 */
public class Ej11_SolReplaceMethodWithMethodObj {
	
	private static final Logger log = Logger.getLogger(Ej11_SolReplaceMethodWithMethodObj.class);
	
	final private double precio=10;
	
	private String nombre;
	private String apellido;
	//cm, kg
	private double ancho; 
	private double largo; 
	private double altura; 
	private double peso;
	
	public Ej11_SolReplaceMethodWithMethodObj(String nombre, String apellido, double ancho, double largo, double altura, double peso) {
		this.nombre=nombre;
		this.ancho=ancho;
		this.largo=largo;
		this.altura=altura;
		this.peso=peso;
	}
	
	public void generarInformacion() {
		String resultado= ""+generarPrecio();
		log.debug("Resultado: "+resultado);
	}
	
	
    private double generarPrecio() {
    	return new Box(getAncho(), getLargo(), getAltura(), getPeso()).computar();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	
}
