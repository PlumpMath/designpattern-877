package personal.wh.designpattern.ch24.bridge.sample;

public class ConcreteImplementorB implements Implementor {

	@Override
	public void operationImpl() {
		System.out.println("B");
	}

}
