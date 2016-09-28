package personal.wh.designpattern.ch15.composite.sample;

import java.util.ArrayList;
import java.util.List;

public class NormalTreeNode extends TreeNode {

	private List<TreeNode> childComponents = null;
	
	@Override
	public void someOperation() {
		if (childComponents != null) {
			for (TreeNode c : childComponents) {
				c.someOperation();
			}
		}
	}

	@Override
	public void addChild(TreeNode child) {
		if (childComponents == null) {
			childComponents = new ArrayList<TreeNode>();
		}
		childComponents.add(child);
	}

	@Override
	public void removeChild(TreeNode child) {
		
	}

	@Override
	public TreeNode getChild(int index) {
		if (childComponents != null) {
			if (index >= 0 && index < childComponents.size()) {
				return childComponents.get(index);
			}
		}
		return null;
	}

}
