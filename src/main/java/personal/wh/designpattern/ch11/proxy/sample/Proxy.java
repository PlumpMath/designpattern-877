package personal.wh.designpattern.ch11.proxy.sample;

public class Proxy implements Subject {

	private Subject s;
	
	public Proxy(Subject s) {
		this.s = s;
	}
	
	@Override
	public void request() {
		s.request();
	}

}
