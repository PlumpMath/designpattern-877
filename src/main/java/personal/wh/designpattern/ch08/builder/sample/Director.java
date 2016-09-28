package personal.wh.designpattern.ch08.builder.sample;

public class Director {

	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void construct() {
		builder.buildPart();
	}
	
}
