package personal.wh.designpattern.ch09.prototype.sample;

public class ConcretePrototype1 implements Prototype {

	public Prototype clone() {
		Prototype p = new ConcretePrototype1();
		return p;
	}
	
}
