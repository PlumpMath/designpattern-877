package personal.wh.designpattern.ch24.bridge.sample;

public class Client {

	public static void main(String[] args) {
		Implementor i = new ConcreteImplementorA();
		RefinedAbstraction a = new RefinedAbstraction(i);
		a.otherOperation();
	}
	
}
