//���������Ķ�����������任ΪԴ�������ľ���
package hgy.java.arithmetic;

public class BinaryTreeMirror {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
	
	public void mirror(TreeNode root) {
		if(root == null)
			return ;
		change(root);
		mirror(root.left);
		mirror(root.right);
		
	}
	//���������������
	public void change(TreeNode root){
		TreeNode node = root.left;
		root.left = root.right;
		root.right = node;
	}

}
