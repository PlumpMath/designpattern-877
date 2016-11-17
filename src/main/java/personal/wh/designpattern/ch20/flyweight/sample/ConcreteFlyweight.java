package personal.wh.designpattern.ch20.flyweight.sample;

public class ConcreteFlyweight implements Flyweight {

	private String intrinsicState;
	
	public ConcreteFlyweight(String state) {
		this.intrinsicState = state;
	}
	
	@Override
	public void operation(String extrinsicState) {
		intrinsicState.toString();
	}

}
