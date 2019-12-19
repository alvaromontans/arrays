import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int [] arrayDesordenado = {121,24,1,258,0,-3,8};
		ordenarArrays(arrayDesordenado);
		imprimirArray(arrayDesordenado);
		
	}

	

	private static int[] ordenarArrays(int[] arrayOrdenar) {
		
		boolean ordenado = false;
		int contadorOrdenacion = 0;
		
		while(!ordenado) {
			for(int i = 0; i < arrayOrdenar.length-1; i++) {
				if(arrayOrdenar[i] < arrayOrdenar[i+1]) {
					int aux = arrayOrdenar[i];
					
					arrayOrdenar[i] = arrayOrdenar[i+1];
					arrayOrdenar[i+1] = aux;
					contadorOrdenacion++;

				}	
			}
			if(contadorOrdenacion == 0) {
				ordenado = true;
			}
			contadorOrdenacion = 0;
			
		}
		return arrayOrdenar;
		

}
	private static void imprimirArray(int[] arrayFinal) {
		System.out.println(Arrays.toString(arrayFinal));
		
	}
}
