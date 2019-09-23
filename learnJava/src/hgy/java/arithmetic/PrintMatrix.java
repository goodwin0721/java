//����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
//���磬�����������4 X 4���� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
//�����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
package hgy.java.arithmetic;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PrintMatrix {

	// ÿһȦ��Ϊ�ĸ����裺��������
	public ArrayList<Integer> printMatrix(int[][] matrix) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return arrayList;
		// ����ÿȦ�����������ٽ�
		int up = 0;
		int down = matrix.length - 1;
		int left = 0;
		int right = matrix[0].length - 1;
		while (true) {
			// ��
			for (int i = left; i <= right; i++)
				arrayList.add(matrix[up][i]);
			up++;
			if (up > down)
				break;

			// ��
			for (int i = up; i <= down; i++)
				arrayList.add(matrix[i][right]);
			right--;
			if (right < left)
				break;

			// ��
			for (int i = right; i >= left; i--)
				arrayList.add(matrix[down][i]);
			down--;
			if (down < up)
				break;

			// ��
			for (int i = down; i >= up; i--)
				arrayList.add(matrix[i][left]);
			left++;
			if (left > right)
				break;
		}
		return arrayList;
	}

	@Test
	public void test() {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		List<Integer> ansList = printMatrix(matrix);
		System.out.println(ansList);
	}

}
