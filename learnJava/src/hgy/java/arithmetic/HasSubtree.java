//�������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
package hgy.java.arithmetic;

import java.util.Arrays;

import org.junit.Test;

public class HasSubtree {
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}
	}

	// �������
	public void printPre(TreeNode root) {
		if (root != null)
			System.out.print(root.val + " ");
		if (root.left != null)
			printPre(root.left);
		if (root.right != null)
			printPre(root.right);
	}

	// �������
	public void printIn(TreeNode root) {
		if (root.left != null)
			printIn(root.left);
		System.out.print(root.val + " ");
		if (root.right != null)
			printIn(root.right);
	}

	// ͨ����������������������鹹��һ�ö�����
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if (pre.length == 0)
			return null;
		TreeNode root = new TreeNode(pre[0]);
		for (int i = 0; i < in.length; i++) {
			if (in[i] == pre[0]) {
				// copyOfRange����Arrays��[from,to)����;
				root.left = reConstructBinaryTree(
						Arrays.copyOfRange(pre, 1, i + 1),
						Arrays.copyOfRange(in, 0, i));
				root.right = reConstructBinaryTree(
						Arrays.copyOfRange(pre, i + 1, pre.length),
						Arrays.copyOfRange(in, i + 1, in.length));
				break;
			}
		}
		return root;
	}

	public boolean hasSubtree(TreeNode root1, TreeNode root2) {
		if (root1 == null || root2 == null)
			return false;
		if (root1.val == root2.val) {
			if (judge(root1, root2))
				return true;
		}
		// �ж����������Ƿ����root2
		return hasSubtree(root1.left, root2) || hasSubtree(root1.right, root2);

	}

	// �ж��Ƿ�Ϊ����
	public boolean judge(TreeNode root1, TreeNode root2) {
		if (root2 == null)
			return true;
		if (root1 == null)
			return false;
		if (root1.val == root2.val)
			return judge(root1.left, root2.left)
					&& judge(root1.right, root2.right);
		return false;
	}

	@Test
	public void test() {
		int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };
		int[] in = { 4, 7, 2, 1, 5, 3, 8, 6 };
		TreeNode tree1 = reConstructBinaryTree(pre, in);
		int[] pre2 = { 1, 2, 4, 7 };
		int[] in2 = { 4, 7, 2, 1 };
		TreeNode tree2 = reConstructBinaryTree(pre2, in2);
		System.out.println(hasSubtree(tree1, tree2));
	}

}
