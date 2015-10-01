
public class Main {

	public static void main(String[] args) {
		SectorCajas cajas = new SectorCajas();
		SectorGerente gerentes = new SectorGerente();
		
		Empleado cajero1 = new Empleado("Vicente", "Cajero", 500);
		Empleado cajero2 = new Empleado("Rodrigo", "Cajero", 2000);
		Empleado gerente = new Empleado("Camilo", "Gerente", 3000);
		cajas.agrega(cajero1);
		cajas.agrega(cajero2);
		gerentes.agrega(gerente);
		
		System.out.println(cajas.getSueldo());
		System.out.println(gerente.getSueldo());
	}

}
