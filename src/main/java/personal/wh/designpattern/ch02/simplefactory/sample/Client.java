package personal.wh.designpattern.ch02.simplefactory.sample;

public class Client {

	public static void main(String[] args) {
		Api api = Factory.createApi(1);
		api.operation("正在使用简单工厂");
	}
	
}
