//��Ҷ�֪��쳲��������У�����Ҫ������һ������n��
//�������쳲��������еĵ�n���0��ʼ����0��Ϊ0����n<=39
package hgy.java.arithmetic;

import org.junit.Test;

public class Fibonacci {
	//�ݹ�
	public int fibonacci(int n){
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}
	//����
	public int fibonacci2(int n){
		int expre = 0;
		int pre = 1;
		int ans = 0;
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else{
			for(int i = 2;i<=n;i++){
				ans = expre + pre;
				expre = pre;
				pre = ans;
			}
			return ans;
		}
	}
	
	@Test
	public void test(){
		System.out.println(fibonacci(39));
		System.out.println(fibonacci2(39));
	}
}
