package personal.wh.designpattern.ch13.command.sample;

public class Invoker {

	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void runCommand() { // 驱动命令执行
		command.execute();
	}
	
}
