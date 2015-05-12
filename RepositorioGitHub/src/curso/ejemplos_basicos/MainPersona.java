package curso.ejemplos_basicos;

import java.util.Scanner;

public class MainPersona {

	public static void main(String[] args) {

//		int i_numeroPersonas = PedirDatos.i_numeroPersonas();
//		for (int i_contador=0; i_contador<i_numeroPersonas; i_contador++) {
//			
//			String s_nombre = PedirDatos.pedirNombre();
//			byte by_edad = PedirDatos.pedirEdad();
//			Persona p = new Persona(s_nombre, by_edad);
//			p.mostrarPersona();
//			Persona.contaPersonas();
			
//			Persona p = new Persona(PedirDatos.pedirNombre(), PedirDatos.pedirEdad());
//			Persona p2 = new Persona("Francesco", (byte) 30);
//			Persona p3 = new Persona(PedirDatos.pedirNombre(), PedirDatos.pedirEdad());
//			Persona p4 = new Alumno(PedirDatos.pedirNombre(), PedirDatos.pedirEdad(), (byte) PedirDatos.pedirNota());
			Persona p5 = new Persona(PedirDatos.pedirNombre(), PedirDatos.pedirEdad());
			System.out.println(p5.incrementoEdad(p5, PedirDatos.pedirNumero()));
			p5.incrementoEdad2(PedirDatos.pedirNumero());
			System.out.println(p5);
			p5.incrementoEdad3(p5, PedirDatos.pedirNumero());
			System.out.println(p5);

//			if (p2 == p){
//				System.out.println(p + " e " + p2 + " son la misma persona");
//			} else {
//				System.out.println(p + " e " + p2 + " no son la misma persona");
//			}

//			Persona p3 = p;
			
//			if (p3 == p){
//				System.out.println(p + " e " + p3 + " son la misma persona");
//			} else {
//				System.out.println(p + " e " + p3 + " no son la misma persona");
//			}
			
//			p3.s_nombre = "Pepa";
//			p3.by_edad = 53;
			
//			p.mostrarPersona();
//			p2.mostrarPersona();
//			p3.mostrarPersona();
		
//			boolean bo_iguales = p.equals(p3);
//			
//			if (bo_iguales) {
//				System.out.println(p.s_nombre + " y " + p3.s_nombre + "son iguales");
//				} else {
//					System.out.println(p.s_nombre + " y " + p3.s_nombre + " no son iguales");
//				}
			
//			System.out.println(p);
			
//			System.out.println(p4.toString());
			
//			boolean bo_iguales2 = p.equals(p2);
//			if (bo_iguales2) {
//				System.out.println("p y p2 son iguales");
//				} else {
//					System.out.println("p y p2 no son iguales");
//				}
			
//			boolean bo_mayor = p.esMayorDeEdad();
//			if (bo_mayor) {
//				
//				System.out.println(p.s_nombre + " es mayor de edad");
//				} else {
//					
//					System.out.println(p.s_nombre + " no es mayor de edad");
//				}
//
//		}
		
//		System.out.println("Han sido inseridas " + Persona.i_contador + " personas");

	}
	
	

}
