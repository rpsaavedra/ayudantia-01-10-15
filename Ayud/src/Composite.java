import java.util.ArrayList;


public class Composite implements ISueldo{

	private ArrayList<ISueldo> empleados = new ArrayList<ISueldo>();
	@Override
	public double getSueldo() {
		double suma = 0;
		for (int i=0;i<empleados.size();i++){
			suma = suma + empleados.get(i).getSueldo();
		}
		return suma;
	}
	
	public void agrega(ISueldo p){
		empleados.add(p);
	}

}
