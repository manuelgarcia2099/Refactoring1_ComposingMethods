package cm8_replaceMehodWithMethodObj;

import org.apache.log4j.Logger;

public class Box {
	
	private static final Logger log = Logger.getLogger(Ej11_SolReplaceMethodWithMethodObj.class);
	
	final private double precio=10;
	
	private double ancho; 
	private double largo; 
	private double altura; 
	private double peso;
	
	double precioPorAncho=0;
	double precioPorLargo=0;
	double precioPorAltura=0;
	double precioPorPeso=0;
	
	public Box(double ancho, double largo, double altura, double peso) {
		this.ancho=ancho;
		this.largo=largo;
		this.altura=altura;
		this.peso=peso;
	}
	
	public double computar(){
		
    	if(getAncho()>10) precioPorAncho = (precio*10)/100;
    	if(getLargo()>10) precioPorLargo =(precio*10)/100;
    	if(getAltura()>10) precioPorAltura =(precio*10)/100;
    	if(getPeso()>1) precioPorPeso =(precio*10)/100;
    	log.debug("precio:"+precio+" P. Ancho: "+precioPorAncho+ " P. Largo: "+precioPorLargo+" P. Altura: "+precioPorAltura+" P. Peso: "+precioPorPeso);
    	return (precio+precioPorAncho+precioPorLargo+precioPorAltura+precioPorPeso);
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
