package cm1_extractMethod;
/**
 * @author Manuel García 2018
 */
public class Ej1_Solucion {

	private static String nombre;
	private static double monto;

	public static void main(String[] args) {
		monto = 200.0;
		nombre = "San Juan S.A";

		imprimirDeuda();
	}

	private static void imprimirDeuda() {
		imprimirCabecera();		
		imprimirDetalle();		
	}

	private static void imprimirCabecera() {
		System.out.println("*********************************");
		System.out.println("*****  Emisión de Reporte   *****");
		System.out.println("*********************************");
	}

	private static void imprimirDetalle() {
		System.out.println("nombre de Empresa: "+ nombre);
		System.out.println("monto: "+monto);		
	}


}
