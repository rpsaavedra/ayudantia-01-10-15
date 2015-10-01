import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public abstract class Sujeto {
	protected List<Observador> _observers;
	
	public Sujeto() {
	_observers =
	new LinkedList<Observador>();
	}
	public void attach(Observador o) {
	_observers.add(o);
	}
	public void detach(Observador o) {
	_observers.remove(o);
	}
	
	public void notifica () {
	Iterator<Observador> it;
	it = _observers.iterator();
	while (it.hasNext())
	it.next().update();
	}
	

}
