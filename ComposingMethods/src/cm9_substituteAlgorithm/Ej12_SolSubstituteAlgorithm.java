package cm9_substituteAlgorithm;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

public class Ej12_SolSubstituteAlgorithm {
	
private static final Logger log = Logger.getLogger(Ej12_SolSubstituteAlgorithm.class);
	
	private String[] dato;

	public Ej12_SolSubstituteAlgorithm(String[] dato) {
		this.dato=dato;
	}
	
	public void imprimirInformacion() {
		log.debug("Resultado: "+encontrarDato());
	}
	
	public String encontrarDato(){
		String resultado= "";
		
		String[] elements = getDato();
		List candidatos = Arrays.asList(new String[] {"Don","John","Kent"});
		for (int i = 0; i < elements.length; i++) {
			if(candidatos.contains(elements[i])){
				resultado += " "+elements[i];
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
