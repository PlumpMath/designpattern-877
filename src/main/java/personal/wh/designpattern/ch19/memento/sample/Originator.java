package personal.wh.designpattern.ch19.memento.sample;

public class Originator {

	private String state = "";
	
	public Memento createMemento() {
		return new MementoImpl(state);
	}
	
	public void setMemento(Memento memento) {
		MementoImpl mementoImpl = (MementoImpl) memento;
		this.state = mementoImpl.getState();
	}
	
}
