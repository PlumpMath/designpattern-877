package personal.wh.designpattern.ch25.vistor.sample;

import java.util.ArrayList;
import java.util.Collection;

public class ObjectStructure {

	private Collection<Element> col = new ArrayList<>();
	
	public void handleRequest(Visitor visitor) {
		for (Element ele : col) {
			ele.accept(visitor);
		}
	}
	
	public void addElement(Element ele) {
		this.col.add(ele);
	}
	
}
