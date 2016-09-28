package personal.wh.designpattern.ch10.mediator.sample;

public class ConcreteColleagueA extends Colleague {

	public ConcreteColleagueA(Mediator mediator) {
		super(mediator);
	}
	
	public void someOperation() {
		getMediator().changed(this);
	}

}
