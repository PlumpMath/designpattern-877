package personal.wh.designpattern.ch24.bridge.sample;

public class RefinedAbstraction extends Abstraction {

	public RefinedAbstraction(Implementor impl) {
		super(impl);
	}
	
	public void otherOperation() {
		super.operation();
		System.out.println("ok");
	}

}
