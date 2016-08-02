package personal.wh.designpattern.ch05.singleton.sample;

public class HungrySingleton {

	private static HungrySingleton uniqueInstance = new HungrySingleton();
	
	private HungrySingleton() {
	}
	
	public static HungrySingleton getInstance() {
		return uniqueInstance;
	}
}
