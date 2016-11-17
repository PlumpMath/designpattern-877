package personal.wh.designpattern.ch25.vistor.sample;

public class ConcreteElementA extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}

	public void operationA() {
		
	}

}
