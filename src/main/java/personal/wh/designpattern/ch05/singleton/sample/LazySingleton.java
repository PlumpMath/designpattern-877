package personal.wh.designpattern.ch05.singleton.sample;

public class LazySingleton {

	private static LazySingleton uniqueInstance = null;
	
	private LazySingleton() {
	}
	
	public static synchronized LazySingleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new LazySingleton();
		}
		return uniqueInstance;
	}
	
}
