package personal.wh.designpattern.ch15.composite.sample;

public abstract class TreeNode {

	public abstract void someOperation();
	
	public void addChild(TreeNode child) {
		throw new UnsupportedOperationException();
	}
	
	public void removeChild(TreeNode child) {
		throw new UnsupportedOperationException();
	}
	
	public TreeNode getChild(int index) {
		throw new UnsupportedOperationException();
	}
}
