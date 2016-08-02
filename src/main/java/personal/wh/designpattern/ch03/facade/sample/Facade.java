package personal.wh.designpattern.ch03.facade.sample;

public class Facade {

	public void test() {
		AModuleApi a = new AModuleImpl();
		a.testA();
		
		BModuleApi b = new BModuleImpl();
		b.testB();
		
		CModuleApi c = new CModuleImpl();
		c.testC();
	}
	
}
