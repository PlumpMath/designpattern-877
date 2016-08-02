package personal.wh.designpattern.ch05.singleton.sample;

public class BetterSingleton {
	
	private BetterSingleton() {
	}

	private static class SingletonHolder {
		private static BetterSingleton instance = new BetterSingleton();
	}
	
	public static BetterSingleton getInstance() {
		return SingletonHolder.instance;
	}
	
}
