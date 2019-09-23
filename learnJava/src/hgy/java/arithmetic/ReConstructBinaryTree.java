/*����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
 * ���������ǰ���������������Ľ���ж������ظ������֡�
 * ��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�*/
package hgy.java.arithmetic;

import java.util.Arrays;

import org.junit.Test;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
	}
}
public class ReConstructBinaryTree {
	//solution
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		if(pre.length==0)
			return null;
		TreeNode root = new TreeNode(pre[0]);
		for(int i = 0 ; i < in.length;i++){
			if(in[i]==pre[0]){
				//copyOfRange����Arrays��[from,to)����;
				root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));
				root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1, in.length));
				break;
			}
		}
		return root;
	}
	
	//�������
	public void printPre(TreeNode root){
		if(root!=null)
			System.out.print(root.val+" ");
		if(root.left!=null)
			printPre(root.left);
		if(root.right!=null)
			printPre(root.right);
	}
	//�������
	public void printIn(TreeNode root){
		if(root.left != null)
			printIn(root.left);
		System.out.print(root.val+" ");
		if(root.right != null)
			printIn(root.right);
	}
	
	@Test
	public void test(){
		int[]pre = {1,2,4,7,3,5,6,8};
		int[]in = {4,7,2,1,5,3,8,6};
	 	TreeNode root = reConstructBinaryTree(pre,in);
		printPre(root);
		System.out.println();
		printIn(root);
	}
}
