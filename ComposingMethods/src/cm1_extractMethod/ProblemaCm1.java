package cm1_extractMethod;
/**
 * @author Manuel García 2018
 * Problema Ejemplo para uso de Técnicas de Refactoración
 */
public class ProblemaCm1 {
	
	private static String nombre;
	private static double monto;

	public static void main(String[] args) {
		monto = 200.0;
		nombre = "San Juan S.A";
		
		imprimirDeuda();
	}
	
	private static void imprimirDeuda() {
		
		imprimirCabecera();
		
		//Imprime Detalles
		System.out.println("nombre de Empresa: "+ nombre);
		System.out.println("monto: "+monto);		
	}

	private static void imprimirCabecera() {
			System.out.println("*********************************");
			System.out.println("*****  Emisión de Reporte   *****");
			System.out.println("*********************************");
	}

}
