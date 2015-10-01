
public class Equilatero extends Triangulo {
	
	public Equilatero(int ladoA, int ladoB, int ladoC){
		super(ladoA,ladoB,ladoC);
	}

	@Override
	public String getDescripcion() {
		return "Soy Equilatero";
	}

	@Override
	public int getSuperficie() {
		
		return getLadoA()*(getLadoA()*(3)^(1/2));
	}

}
