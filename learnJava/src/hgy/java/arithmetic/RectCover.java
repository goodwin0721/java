//���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
//������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
package hgy.java.arithmetic;

import org.junit.Test;

public class RectCover {
	/**
	 * �������κ�������====>���ա���������
	 * ����2*1ʱ����1��ֻ������f(1)=1�֣�����2*2ʱ����2��ɺᡢ���̣���f(2)=2�֣�
	 * ����2*3ʱ����3��������ʱ��ʣ������f(2)=2�֣���3�������ʱ��ʣһ����f(1)=1�֣�
	 * ����2*4ʱ����4��������ʱ��ʣ������f(3)=3�֣���4�������ʱ��ʣ������f(2)=2�֣�
	 * �Դ����ƣ�f(n) = f(n-1)+f(n-2)
	 * @param target
	 * @return
	 */
	public int rectCover(int target) {
		if (target <= 2)
			return target;
		else {
			return rectCover(target - 1) + rectCover(target - 2);
		}
	}

	@Test
	public void test() {
		System.out.println(rectCover(3));
	}
}
