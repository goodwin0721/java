/*��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��*/
package hgy.java.arithmetic;

public class Replace {
	 public static String replaceSpace(StringBuffer str) {
	    	String s  = str.toString();
	    	return s.replace(" ", "%20");
	 }
	 public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("We Are Happy.");
		System.out.println(replaceSpace(buffer));
	}
}
