package personal.wh.designpattern.ch07.abstractfactory.sample;

public class Client {

	public static void main(String[] args) {
		// 选择一个具体的工厂，也意味着选择了对应的产品簇
		AbstractFactory af = new ConcreteFactory1(); // A1 + B1
		AbstractProductA a = af.createProductA();
		AbstractProductB b = af.createProductB();
		a.operation();
		b.operation();
	}
	
}
