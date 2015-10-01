
public class UnObservador extends Observador{
	
	private double _data;
	
	public UnObservador (Sujeto s) {
	super(s);
	_data=0;
	}
	public void update () {
		
	
	_data = ((UnSujeto)_subject).getState();
	
	this.imprime();
	
	}
	
	public void imprime () {
	
		System.out.println("Ha llegado la factura "+ _data+ "\n");		
	}

}
