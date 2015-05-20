package curso.ejemplos_basicos;

import java.io.Serializable;

public class Alumno extends Persona implements Serializable {
	
	private int nota;
	private enum Notas {SOBRESALIENTE, NOTABLE, BIEN, APROBADO, SUSPENSO}
	private Notas notaAlumno;

	public int getNota() {
		
		return nota;
	}

	public void setNota(byte nota) {
		
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		 
		return (super.s_nombre + " " + super.i_edad + " " + this.notaAlumno);
		
	}
	
	public Alumno(String s_nombre, byte b_edad) {
		 
		super(s_nombre, b_edad);
		
	}
	
	public Alumno(String s_nombre, int i, int j) {
		
		super(s_nombre, i);
		this.nota = j;
		this.notaAlumno = notaRecibida();
		
	}
	
	private Notas notaRecibida() {	
		
		Notas notaCualitativa = null;
		switch (this.nota) {
		
			case 5: 
				notaCualitativa = Notas.APROBADO;
				break;
			case 6: 
				notaCualitativa = Notas.BIEN;
				break;
			case 7:
			case 8: 
				notaCualitativa = Notas.NOTABLE;
				break;
			case 9:
			case 10: 
				notaCualitativa = Notas.SOBRESALIENTE;
				break;
			default: 
				notaCualitativa = Notas.SUSPENSO;
				break;
		}
				return notaCualitativa;
	}
	
}
