package personal.wh.designpattern.ch09.prototype.sample;

public class ConcretePrototype2 implements Prototype {

	public Prototype clone() {
		Prototype p = new ConcretePrototype2();
		return p;
	}
	
}
