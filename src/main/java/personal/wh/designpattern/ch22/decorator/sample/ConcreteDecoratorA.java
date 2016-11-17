package personal.wh.designpattern.ch22.decorator.sample;

public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component component) {
		super(component);
	}
	
	private String addedState;
	
	public String getAddedState() {
		return addedState;
	}
	
	public void setAddedState(String addedState) {
		this.addedState = addedState;
	}
	
	@Override
	public void operation() {
		super.operation();
	}

}
