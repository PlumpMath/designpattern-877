package personal.wh.designpattern.ch24.bridge.sample;

public abstract class Abstraction {

	protected Implementor impl;
	
	public Abstraction(Implementor impl) {
		this.impl = impl;
	}
	
	public void operation() {
		impl.operationImpl();
	}
	
}
