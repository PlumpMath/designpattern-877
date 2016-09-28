package personal.wh.designpattern.ch19.memento.sample;

public class Caretaker {

	private Memento memento = null;
	
	public void saveMemento(Memento memento) {
		this.memento = memento;
	}
	
	public Memento retrieveMemento() {
		return this.memento;
	}
	
}
