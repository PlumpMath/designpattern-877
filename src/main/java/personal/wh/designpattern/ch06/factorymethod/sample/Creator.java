package personal.wh.designpattern.ch06.factorymethod.sample;

public abstract class Creator {

	public void someOperation() {
		// Creator也不知道该选哪个Product，是子类去选择的
		// Client使用Creator的哪个子类，就使用了子类选择的那个Product
		Product p = factoryMethod();
		p.operation();
	}
	
	protected abstract Product factoryMethod();
}
