package curso.ejemplos_basicos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializacionPersonas {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Persona p[] = new Persona[3];
		for (int i=0; i<p.length; i++) {
			
			p[i] = new Persona(PedirDatos.pedirNombre(), PedirDatos.pedirEdad());	
		}
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\alumno\\workspace_cig\\Proyecto_0505\\carpeta\\ListaObjetos.dat"));
		oos.writeObject(p);
		oos.close();
		p = null;
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\alumno\\workspace_cig\\Proyecto_0505\\carpeta\\ListaObjetos.dat"));	
		p = (Persona[])ois.readObject();
		ois.close();
		
		for (int i=0; i<p.length; i++) {
			
			System.out.println(p[i]);
		}
	}
}
