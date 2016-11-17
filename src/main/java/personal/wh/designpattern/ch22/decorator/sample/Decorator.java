package personal.wh.designpattern.ch22.decorator.sample;

public abstract class Decorator extends Component {

	protected Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}
	
	public void operation() {
		component.operation();
	}
	
}
