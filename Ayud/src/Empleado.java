
public class Empleado implements ISueldo {

	private String nombre, cargo;
	private double sueldo;
	
	public Empleado(String nombre, String cargo, double sueldo){
		this.nombre = nombre;
		this.cargo = cargo;
		this.sueldo = sueldo;
	}
	@Override
	public double getSueldo() {
		
		return sueldo;
	}
	
}
