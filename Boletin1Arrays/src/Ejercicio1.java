import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		String texto="";
		
		obtenerCadenaTexto(texto);
	}

	private static void obtenerCadenaTexto(String texto) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un texto");
		texto = sc.nextLine();
	}

}
