//һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
//�����������һ��n����̨���ܹ��ж�����������
package hgy.java.arithmetic;

import org.junit.Test;

public class JumpFloorII {
	/**
	 * ˼·����һ��������i����ʣ�µ���f(n-i)����������f(n)=f(n-1)+......+f(n-n),f(0)=0,f(1)=1,f(2)=2
	 * ��f(n-1) = f(n-1-1)+......+f(n-1-(n-1)),����f(n) = 2*f(n-1)
	 * @param target
	 * @return
	 */
	public int jumpFloor(int target) {
		if (target <= 2)
			return target;
		else
			return 2 * jumpFloor(target - 1);
	}

	// ��������˼·�Ż�
	public int jumpFloor1(int target) {
		return target > 0 ? 1 << (target - 1) : 0;
	}

	/**
	 * ˼·����һ��������i����ʣ�µ���f(n-i)����������f(n)=f(n-1)+......+f(n-n),f(0)=0,f(1)=1,f(2)=2
	 * @param target
	 * @return
	 */
	// ����
	public int jumpFloor2(int target) {
		if (target <= 2)
			return target;
		int[] ways = new int[target + 1];
		ways[1] = 1;
		ways[2] = 2;
		for (int i = 3; i <= target; i++) {
			for (int j = 1; j < i; j++)
				ways[i] = ways[i] + ways[j];
			ways[i]++;// ����һ�������յ�
		}
		return ways[target];
	}

	@Test
	public void test() {
		System.out.println(jumpFloor(6));
		System.out.println(jumpFloor1(0));
		System.out.println(jumpFloor2(6));
	}

}
