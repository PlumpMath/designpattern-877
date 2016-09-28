package personal.wh.designpattern.ch12.observer.sample;

public class ConcreteSubject extends Subject {

	private String subjectState;
	
	public String getSubjectState() {
		return subjectState;
	}
	
	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
		this.notifyObservers();
	}
}
