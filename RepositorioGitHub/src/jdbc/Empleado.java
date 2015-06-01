package jdbc;

public class Empleado {
	
	int id_empleado;
	String nombre;
	String apellido;
	String email;
	String teléfono;
	String fecha_in;
	String id_job;
	int salario;
	int comisiones;
	int id_manager;
	int id_departamento;
	
	public Empleado(int id_empleado,
	String nombre,
	String apellido,
	String email,
	String teléfono,
	String fecha_in,
	String id_job,
	int salario,
	int comisiones,
	int id_manager,
	int id_departamento) {
		
		this.id_empleado = id_empleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.teléfono = teléfono;
		this.fecha_in = fecha_in;
		this.id_job = id_job;
		this.salario = salario;
		this.comisiones = comisiones;
		this.id_manager = id_manager;
		this.id_departamento = id_departamento;
		
	}
	
	@Override
	public String toString() {
		
		return (this.id_empleado + " " + this.nombre + " " 
		+ this.apellido + " " + this.email + " " + this.teléfono + " " 
		+ this.fecha_in + " " + this.id_job + " " + this.salario + " "
		+ this.comisiones + " " + this.id_manager + " " + this.id_departamento);
	}

}
