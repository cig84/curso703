package curso.ejemplos_basicos;

public class MainArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int [10];
		int [][] arrayBidi = {{32,24},{23,84}};
		
		for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                System.out.print(arrayBidi[row][col] + " ");
            }
            System.out.print("\n");
		}
	}

}
