
public abstract class Observador {
	protected Sujeto _subject;
	
	public Observador (Sujeto s) {
	_subject = s;
	_subject.attach(this);
	}
	public abstract void update ();

}
