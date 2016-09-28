package personal.wh.designpattern.ch17.strategy.sample;

public class Context {

	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void contextInterface() {
		strategy.algorithmInterface();
	}
	
}
