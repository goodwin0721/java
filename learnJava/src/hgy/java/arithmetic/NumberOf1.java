//����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
package hgy.java.arithmetic;

import org.junit.Test;

public class NumberOf1 {
	public int numberOf1(int n) {
		String num = Integer.toBinaryString(n);
		System.out.println(num);
		int count = 0;
		for(int i = 0;i < num.length();i++)
			if(num.charAt(i)=='1')
				count++;
		return count;
    }
	@Test
	public void test(){
		System.out.println(numberOf1(15));
	}
}
