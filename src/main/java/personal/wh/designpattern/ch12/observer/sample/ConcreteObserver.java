package personal.wh.designpattern.ch12.observer.sample;

public class ConcreteObserver implements Observer {

	private String observerState;
	
	@Override
	public void update(Subject subject) {
		observerState = ((ConcreteSubject) subject).getSubjectState();
	}

}
