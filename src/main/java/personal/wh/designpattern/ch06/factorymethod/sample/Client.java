package personal.wh.designpattern.ch06.factorymethod.sample;

public class Client {

	public static void main(String[] args) {
		Creator c = new ConcreteCreator1();
		c.someOperation();
	}
	
}
