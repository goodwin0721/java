/*��K����ͬ�ַ���ȫ������ɵ�����,  ���Թٴ������������һ��, 
ʣ�µ�������Ϊ����,  ���æ�ҳ���������ߵ��ַ���?
����[��ABC��, ��ACB��, ��BAC��, ��CAB��, ��CBA��] ���� ��BCA��*/
package hgy.java.arithmetic;

import java.util.Scanner;


public class T3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int n = input.nextInt();
		String s = input.next();
		if(n==1)
			System.out.println(""+s.charAt(1)+s.charAt(0));
		else{
			int len = s.length();
			char[] res = new char[s.length()];
			for(int i = 0 ; i < res.length;i++)
				res[i] = s.charAt(i);
			for(int i = 1;i < n;i++){
				String temp = input.next();
				for(int k = 0;k < len;k++){
					res[k] = (char) (res[k]^temp.charAt(k));
				}
			}
			for(int i = 0;i < res.length;i++){
				System.out.print(res[i]);
			}
		}
		input.close();
	}
}
