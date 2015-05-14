package ejercicios.de.repaso;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Properties;

import org.omg.CORBA.CODESET_INCOMPATIBLE;

import ejercicios.de.repaso.InsertarPersonaException;

public class ListaPersonas {
	
	public static final int CAPACIDAD = 10;
	
	private Persona[] array_personas;
	private static int numeroPersonas=0;
	
	
	/**
	 * Es muy posible que haga falta añadir algún campo más
	 */
	
	public ListaPersonas()
	{
		//HAY QUE HACER UN CONSTRUCTOR
		//RECUERDA QUE EL CONSTRUCTOR SIRVE PARA
			//RESERVAR MEMORIA
			//INICIALIZAR EL ESTADO DEL OBJETO Y SUS ATRIBUTOS

		array_personas = new Persona[CAPACIDAD];
		for (int i=0; i<array_personas.length; i++) {
			array_personas[i] = null;
		}
	}
	
	public Persona[] getListaPersonas ()
	{
		//HAY QUE DEVOLVER EL ARRAY DE PERSONAS QUE CONFORMAN LA LISTA
		
		return this.array_personas;
	}
	
	public Persona buscarPersona (String nombre)
	{
		// BUSCAR PERSONA POR NOMBRE Y DEVOLVERLA
		//SI NO ESTÁ, DEVOLVER NULO
		int i=0;
		Persona p = null;
		boolean encontrado = false;
		
		while (i<numeroPersonas && encontrado==false) {
			String nombrePersona = array_personas[i].getNombre();
			if (nombrePersona.equals(nombre)) {
			p = array_personas[i];
			encontrado=true;
			}
			i++;
		}
		return p;
	}
	
	public Persona buscarPersona (int edad)
	{
		//BUSCAR PERSONA POR EDAD Y DEVOLVERLA
		//SI NO ESTÁ, DEVOLVER NULO
		int i=0;
		Persona p = null;
		boolean encontrado = false;
		
		while (i<numeroPersonas && encontrado==false) {
			int edadPersona = array_personas[i].getEdad();
			if (edadPersona==edad) {
			p = array_personas[i];
			encontrado=true;
			}
			i++;
		}
		return p;
	}
	
	public boolean serializar () throws FileNotFoundException, IOException
	{
		//Hacer uso del fichero de propiedades serializa.properties, 
		//para obtener de él el valor de la clave destino, 
		//que representa el nombre del fichero de salida
		
		Properties propiedades = new Properties();
		propiedades.load(new FileInputStream(".\\carpeta\\serializa.properties"));
		FileWriter fw = new FileWriter(".\\carpeta\\" + propiedades.getProperty("destino"));
		return false;
	}
	
	public Persona[] deserializar() throws FileNotFoundException, IOException
	{
		Persona[] array = new Persona[CAPACIDAD];
		Properties propiedades = new Properties();
		p = null;
		propiedades.load(new FileInputStream(".\\carpeta\\serializa.properties"));
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(".\\carpeta\\" + propiedades.getProperty("destino")));	
		persona = (Persona[])ois.readObject();
		ois.close();
		
		return array;
	}
	
	public void insertarPersona (Persona p) throws InsertarPersonaException
	{
		if (!estaLlena()) {
			array_personas[numeroPersonas] = p;
			numeroPersonas++;
		}
	}
	
	public int numeroPersonas()
	{
		return numeroPersonas;
	}
	
	public boolean estaLlena()
	{
		boolean llena = false;
		if (numeroPersonas==9) {
			llena = true;
		}
		return llena;
	}
	
	public void mostrar()
	{
		//MOSTRAR LA LISTA DE PERSONAS
		// pista: ayudarse del método toString de persona
		int i=0;
		while (array_personas[i]!=null) {
			System.out.println(array_personas[i]);
			i++;
		}
		
	}

}
