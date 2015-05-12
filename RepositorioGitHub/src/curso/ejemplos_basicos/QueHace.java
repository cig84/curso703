package curso.ejemplos_basicos;

import java.util.Scanner;

public class QueHace {

	int a;/*
		 * por estar declarada aqu�, fuera de cualquier m�todo, a es un atributo
		 * de la clase. Por lo tanto, es accesible y visible desde todos los
		 * m�todos de la clase
		 */
	static int b = 50;

	void metodo() {
		System.out.println(a);
		a++;
	}
	public QueHace() { // el constructor me vale para inicializar los atributos
		
		a = 0;
	}
	public QueHace(int valor) { // sobrecarga
		
		a = valor;
	}

	public static void main (String[] args) {
		
		QueHace qh1 = null;
		QueHace qh2 = null;

		qh1 = new QueHace();
		qh2 = new QueHace();

		System.out.println(qh1.b);
		qh1.metodo();
		qh1.metodo();
		qh1.a = 33;
		qh1.metodo();
		System.out.println(qh1.a);
		qh2.metodo();
		qh1.b++;
		System.out.println(qh1.b); // imprime el valor de la variable b
		System.out.println(qh2.b); /*
									 * imprime el valor de la variable b qu�
									 * ser� el mismo que por el qh2, porqu� b es
									 * un atributo de la clase
									 */
		System.out.println(QueHace.b);
/*
		String nombre;
		int edad;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca nombre: ");
		nombre = sc.next();
		System.out.println("Introduzca edad: ");
		edad = sc.nextInt();
		System.out.println(nombre);
		System.out.println(edad);
*/		
		QueHace qh7 = null;
		qh7 = new QueHace();
		System.out.println(qh7.a); // Con el constructor por defecto
		qh7 = new QueHace(7); 
		System.out.println(qh7.a); // Con el constructor sobrecargado
		

	}

}
