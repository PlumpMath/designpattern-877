package personal.wh.designpattern.ch23.chainofresponsibility.sample;

public abstract class Handler {

	protected Handler successor;
	
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	public abstract void handleRequest();
	
}
