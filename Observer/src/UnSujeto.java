
public class UnSujeto extends Sujeto{
		private double factura;
		
		public double getState () {
		
		return factura;
		}
		
		public void setState(double d){
		factura=d;
		this.notifica();
		}
	}

