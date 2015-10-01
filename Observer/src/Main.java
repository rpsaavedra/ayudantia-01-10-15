import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		UnSujeto suj= new UnSujeto();
		UnObservador a=new UnObservador(suj);
		
		String inp;
		while(true){
		System.out.println("Indica la factura:");	
		inp=in.next();
		suj.setState(Integer.parseInt(inp));
		}
	}

}
