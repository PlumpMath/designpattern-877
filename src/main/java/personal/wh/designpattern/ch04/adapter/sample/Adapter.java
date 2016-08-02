package personal.wh.designpattern.ch04.adapter.sample;

public class Adapter implements Target {

	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public void request() {
		adaptee.specificRequest();
	}

}
