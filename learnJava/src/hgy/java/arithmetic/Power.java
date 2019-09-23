//����һ��double���͵ĸ�����base��int���͵�����exponent��
//��base��exponent�η�����֤base��exponent��ͬʱΪ0
package hgy.java.arithmetic;

import org.junit.Test;

public class Power {
	public double power(double base, int exponent) {
		boolean flag = exponent>0;
		if(base == 0.0)
			return 0.0;
		if(!flag)//ָ��Ϊ����
			exponent = -exponent;
		double ans = 1.0;
		while(exponent>0){
			if(exponent%2==1){
				exponent--;
				ans = ans * base;
			}else{
				exponent = exponent/2;
				base = base * base;
			}
		}
		return flag?ans:1.0/ans;
	}

	@Test
	public void test() {
		System.out.println(power(2.0,-2));
	}
}
