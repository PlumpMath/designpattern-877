package personal.wh.designpattern.ch13.command.sample;

public class ConcreteCommand implements Command {
	
	private Receiver receiver;
	
	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() { // 让接收者去执行
		receiver.action();
	}

}
