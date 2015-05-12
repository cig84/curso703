package curso.ejemplos_basicos;

public class MainArrayIncrementado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = {3, 6, 12};
		int n = 10;
		int[] arrayadj = sumaNumero(array, array.length);
		sumaArray(array, n);
		for (int i=0; i<array.length; i++) {
			
			System.out.println(arrayadj[i]);
			System.out.println(array[i]);
		}
	}
	
	public static int[] sumaNumero(int[] array, int adj) {
		
		int[] arrayadj = new int[array.length];
		for (int i=0; i<array.length; i++) {
			
			arrayadj[i] = array[i] + adj;
		}
		return arrayadj;
	}
	
	public static void sumaArray(int[] array, int adj) {
		
		for (int i=0; i<array.length; i++) {
			
			array[i] = array[i] + adj;
		}
	}

}
