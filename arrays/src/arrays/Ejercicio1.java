package arrays;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		
		String texto= "";
		obtenerTexto(texto);
		String[] textoArray = new String[] {texto};
		String[] textoArrayDevolver = obtenerArray(textoArray);
		imprimirArray(textoArrayDevolver);
		
	}

	private static String obtenerTexto(String texto) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un texto");
		texto = sc.nextLine();
		return texto;
			
		}
	private static String[] obtenerArray(String[] textoArrayDevuelto) {
		
		textoArrayDevuelto = new String[4];
		return textoArrayDevuelto;
		
	}
	private static void imprimirArray(String[] textoArrayDevolver) {
		
		for(int i = 0; i < textoArrayDevolver.length ; i++)	        
	            System.out.print(textoArrayDevolver[i]);
	        
	}
	
	}




