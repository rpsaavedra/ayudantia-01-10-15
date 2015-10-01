
public abstract class Triangulo {
	private int ladoA;
	private int ladoB;
	private int ladoC;
	
	public Triangulo(int ladoA, int ladoB, int ladoC){
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}
	
	public abstract String getDescripcion();
	
	public abstract int getSuperficie();

	public int getLadoA(){
		return ladoA;
	}
	public int getLadoB(){
		return ladoB;
	}
	public int getLadoC(){
		return ladoC;
	}
	
	



}
