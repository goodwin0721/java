//һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
//�����������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ������

package hgy.java.arithmetic;

import org.junit.Test;

public class JumpFloor {
	/**
	 * ˼·��f(1)=1,f(2)=2,��һ���������������ٶ���һ��������һ�ף�ʣ����f(n-1)��������
	 * �ٶ���һ�������ڶ��ף�ʣ����f(n-2)������������f(n) =f(n-1)f(n-2),��쳲��������С�
	 * 
	 * @param target
	 * @return
	 */
	public int jumpFloor(int target) {
		int ways = 0;
		if (target == 1)
			ways = 1;
		else if (target == 2)
			ways = 2;
		else {
			int expre = 1;
			int pre = 2;
			for (int i = 3; i <= target; i++) {
				ways = expre + pre;
				expre = pre;
				pre = ways;
			}
		}
		return ways;
	}

	@Test
	public void test() {
		System.out.println(jumpFloor(3));
	}
}
