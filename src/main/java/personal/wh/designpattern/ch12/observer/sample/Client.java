package personal.wh.designpattern.ch12.observer.sample;

public class Client {

	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		subject.attach(new ConcreteObserver());
		subject.setSubjectState("1");
	}
	
}
