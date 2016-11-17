package personal.wh.designpattern.ch24.bridge.sample;

public class ConcreteImplementorA implements Implementor {

	@Override
	public void operationImpl() {
		System.out.println("A");
	}

}
