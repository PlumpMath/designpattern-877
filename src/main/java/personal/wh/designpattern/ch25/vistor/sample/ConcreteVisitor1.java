package personal.wh.designpattern.ch25.vistor.sample;

public class ConcreteVisitor1 implements Visitor {

	@Override
	public void visitConcreteElementA(ConcreteElementA elementA) {
		elementA.operationA();
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB elementB) {
		elementB.operationB();
	}

}
