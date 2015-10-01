
public class Escaleno extends Triangulo {
	public Escaleno(int ladoA, int ladoB, int ladoC){
		super(ladoA,ladoB,ladoC);
	}

	@Override
	public String getDescripcion() {
		return "Soy Escaleno";
	}

	@Override
	public int getSuperficie() {
		
		return getLadoA()*getLadoB(); //no es el verdadero metodo
	}
}
