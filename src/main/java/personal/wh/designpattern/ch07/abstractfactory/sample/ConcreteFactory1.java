package personal.wh.designpattern.ch07.abstractfactory.sample;

/**
 * 在具体工厂中表明2个具体产品的匹配关系
 * 
 * @author wh
 *
 */
public class ConcreteFactory1 implements AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}
