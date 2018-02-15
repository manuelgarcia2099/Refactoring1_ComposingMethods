package cm9_substituteAlgorithm;

import org.apache.log4j.Logger;

import cm8_replaceMehodWithMethodObj.Ej11_Problema;

public class Ej12_Problema {
	
	private static final Logger log = Logger.getLogger(Ej12_Problema.class);
	
	private String[] dato;

	public Ej12_Problema(String[] dato) {
		this.dato=dato;
	}
	
	public void imprimirInformacion() {
		log.debug("Resultado: "+encontrarDato());
	}
	
	public String encontrarDato(){
		String[] elements = getDato();
		String resultado= "";
		
		  for (int i = 0; i < elements.length; i++) {
		    if (elements[i].equals("Don")){
		    	resultado+= " Don ";
		    }
		    if (elements[i].equals("John")){
		    	resultado+= " John ";
		    }
		    if (elements[i].equals("Kent")){
		      resultado+= " Kent ";
		    }
		  }
		  return resultado;
		}

	public String[] getDato() {
		return dato;
	}

	public void setDato(String[] dato) {
		this.dato = dato;
	}
	
}
