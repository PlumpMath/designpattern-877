package personal.wh.designpattern.ch20.flyweight.sample;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

	private Map<String, Flyweight> fsMap = new HashMap<>();
	
	public Flyweight getFlyweight(String key) {
		Flyweight f = fsMap.get(key);
		
		if (f == null) {
			f = new ConcreteFlyweight(key);
			fsMap.put(key, f);
		}
		
		return f;
	}
	
}
