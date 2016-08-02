package personal.wh.designpattern.ch04.adapter.sample;

public class Client {

	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		Target target = new Adapter(adaptee);
		target.request();
	}
	
}
