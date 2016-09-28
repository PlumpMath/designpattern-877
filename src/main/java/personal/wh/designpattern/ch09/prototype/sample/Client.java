package personal.wh.designpattern.ch09.prototype.sample;

public class Client {

	private Prototype p;
	
	public Client(Prototype p) {
		this.p = p;
	}
	
	public void operation() {
		Prototype newPrototype = p.clone();
		System.out.println(newPrototype.equals(p));
	}
	
	public static void main(String[] args) {
		Client c = new Client(new ConcretePrototype1());
		c.operation();
	}
	
}
