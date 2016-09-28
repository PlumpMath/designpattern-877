package personal.wh.designpattern.ch14.iterator.sample;

public interface Iterator {

	void first();
	
	void next();
	
	boolean isDone();
	
	Object currentItem();
	
}
