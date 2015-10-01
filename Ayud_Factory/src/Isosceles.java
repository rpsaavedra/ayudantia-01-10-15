
public class Isosceles extends Triangulo {

	
	public Isosceles(int ladoA, int ladoB, int ladoC){
		super(ladoA,ladoB,ladoC);
	}

	@Override
	public String getDescripcion() {
		return "Soy Isosceles";
	}

	@Override
	public int getSuperficie() {
		int distinto = 0;
		int igual = 0;
		if (getLadoA() == getLadoB()){
			igual = getLadoA();
			distinto = getLadoC();
		}
		else if (getLadoB() == getLadoC()){
			igual = getLadoB();
			distinto = getLadoA();
		}
		else{
			igual = getLadoA();
			distinto = getLadoB();
		}
		return ((igual^2 - ((distinto^2)/4))^(1/2) * distinto)/2;
	}

}