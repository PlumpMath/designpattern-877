package personal.wh.designpattern.ch08.builder.sample;

public class ConcreteBuilder implements Builder {

	private Product resultProduct;
	
	public Product getResult() {
		return resultProduct;
	}
	
	@Override
	public void buildPart() {
		
	}

}
