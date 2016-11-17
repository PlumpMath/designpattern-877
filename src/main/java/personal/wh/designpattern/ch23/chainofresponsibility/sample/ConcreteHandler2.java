package personal.wh.designpattern.ch23.chainofresponsibility.sample;

public class ConcreteHandler2 extends Handler {

	@Override
	public void handleRequest() {
		boolean someCondition = true;
		if (someCondition) {
			System.out.println("ConcreteHandler2 handle request");
		} else {
			if (this.successor != null) {
				this.successor.handleRequest();
			}
		}
	}
	
}
