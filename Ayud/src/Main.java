
public class Main {

	public static void main(String[] args) {
		SectorCajas cajas = new SectorCajas();
		SectorGerente gerentes = new SectorGerente();
		
		Empleado cajero2 = new Empleado("Camilo", "Cajero", 3000);	//cambiado
		Empleado cajero1 = new Empleado("Vicente", "Cajero", 500);
		Empleado gerente = new Empleado("Rodrigo", "Gerente", 10000); //cambiado
			
		Empleado papi = new Empleado("Yadran", "Patr�n", 9000); //agregado
		
		cajas.agrega(cajero1);
		cajas.agrega(cajero2);
		
		gerentes.agrega(papi);
		gerentes.agrega(gerente);
		
		System.out.println(cajas.getSueldo());
		System.out.println(gerente.getSueldo());
	}

}
