package personal.wh.designpattern.ch02.simplefactory.sample;

public class ImplA implements Api {

	@Override
	public void operation(String s) {
		System.out.println("ImplA s==" + s);
	}

}
