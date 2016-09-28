package personal.wh.designpattern.ch19.memento.sample;

public class MementoImpl implements Memento {
	
	private String state;

	public MementoImpl(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}

}
