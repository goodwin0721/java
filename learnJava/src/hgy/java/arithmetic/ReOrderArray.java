//����һ���������飬ʵ��һ�����������������������ֵ�˳��
//ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֣�
//����֤������������ż����ż��֮������λ�ò��䡣
package hgy.java.arithmetic;

import java.util.Arrays;

import org.junit.Test;

public class ReOrderArray {
	public void reOrderArray(int[] array) {
		boolean flag = false;
		for (int i = 0; i < array.length; i++) {
			flag = false;
			for (int j = 1; j < array.length-i; j++) {
				if (array[j-1] % 2 == 0 && array[j] % 2 == 1) {
					flag= true;
					int temp = array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
			if(flag == false)
				break;
		}
		System.out.println(Arrays.toString(array));
	}
	
	@Test
	public void test() {
		int []arr = {1,2,3,4,5,6};
		reOrderArray(arr);
	}

}
