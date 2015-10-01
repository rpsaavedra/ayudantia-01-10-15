
public class TrianguloFactory {
	public Triangulo createTriangulo(int ladoA, int ladoB, int ladoC){
		Triangulo T;
		if ((ladoA == ladoB) && (ladoA == ladoC)){
			T = new Equilatero(ladoA, ladoB, ladoC);
			return T;
		}
		else if((ladoA != ladoB) && (ladoA != ladoC) && (ladoB != ladoC)){
			T = new Escaleno(ladoA, ladoB, ladoC);
			return T;
		}
		else{
			T = new Isosceles(ladoA, ladoB, ladoC);
			return T;
		}
	}
}
