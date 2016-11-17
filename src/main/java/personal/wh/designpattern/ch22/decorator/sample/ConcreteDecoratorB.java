package personal.wh.designpattern.ch22.decorator.sample;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
		super(component);
	}
	
	private void addBehavior() {
		
	}
	
	@Override
	public void operation() {
		super.operation();
		addBehavior();
	}

}
