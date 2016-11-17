package personal.wh.designpattern.ch23.chainofresponsibility.sample;

public class ConcreteHandler1 extends Handler {

	@Override
	public void handleRequest() {
		boolean someCondition = false;
		if (someCondition) {
			System.out.println("ConcreteHandler1 handle request");
		} else {
			if (this.successor != null) {
				this.successor.handleRequest();
			}
		}
	}
	
}
