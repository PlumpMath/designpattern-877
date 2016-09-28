package personal.wh.designpattern.ch16.templatemethod.sample;

public abstract class AbstractClass {

	public abstract void doPrimitiveOperation1();
	
	public abstract void doPrimitiveOperation2();
	
	public final void templateMethod() {
		doPrimitiveOperation1();
		doPrimitiveOperation2();
	}
	
}
