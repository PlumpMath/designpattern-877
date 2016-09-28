package personal.wh.designpattern.ch10.mediator.sample;

public class ConcreteMediator implements Mediator {
	
	private ConcreteColleagueA colleagueA;
	
	private ConcreteColleagueB colleagueB;
	
	@Override
	public void changed(Colleague colleague) {
		colleagueA.someOperation();
		colleagueB.someOperation();
	}

}
