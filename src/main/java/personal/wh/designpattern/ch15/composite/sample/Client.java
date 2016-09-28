package personal.wh.designpattern.ch15.composite.sample;

public class Client {

	public static void main(String[] args) {
		TreeNode root = new NormalTreeNode();
		TreeNode n1 = new NormalTreeNode();
		TreeNode n2 = new NormalTreeNode();
		
		TreeNode leaf = new Leaf();
		
		root.addChild(n1);
		n1.addChild(n2);
		n2.addChild(leaf);
		
		TreeNode treeNode = root.getChild(0).getChild(0);
		treeNode.someOperation();
	}
	
}
