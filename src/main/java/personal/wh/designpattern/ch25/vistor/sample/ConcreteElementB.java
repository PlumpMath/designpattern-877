package personal.wh.designpattern.ch25.vistor.sample;

public class ConcreteElementB extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);
	}

	public void operationB() {
		
	}

}
