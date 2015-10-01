
public class Main {

	public static void main(String[] args) {
		TrianguloFactory fabrica = new TrianguloFactory();
		Triangulo triangulo = fabrica.createTriangulo(10, 10, 10);
		System.out.println(triangulo.getDescripcion());

	}

}
