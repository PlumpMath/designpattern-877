package personal.wh.designpattern.ch06.factorymethod.sample;

public class ConcreteCreator2 extends Creator {

	@Override
	protected Product factoryMethod() {
		return new ConcreteProduct2();
	}

}
