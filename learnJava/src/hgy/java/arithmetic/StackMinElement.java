//����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��������СԪ�ص�min������ʱ�临�Ӷ�ӦΪO��1������
package hgy.java.arithmetic;
import java.util.Stack;

import org.junit.Test;
public class StackMinElement {
	Stack<Integer> elemStack = new Stack<>();
	Stack<Integer> minStack = new Stack<>();
	int min = Integer.MAX_VALUE;
    public void push(int node) {
        min = min<node?min:node;
        elemStack.push(node);
        minStack.push(min);
    }
    
    public void pop() {
    	int e =elemStack.pop();
    	minStack.pop();
    	if(!minStack.isEmpty()){
    		int ee = minStack.pop();//ȡ����Сջջ���ĵڶ���Ԫ��
    		minStack.push(ee);
    		min = e <= min ? ee : min;
    	}else
    		min = Integer.MAX_VALUE;
    }
    
    public int top() {
		return elemStack.peek();
        
    }
    
    public int min() {
    	return min;
    }
    @Test
	public void test() {
    	for(int i  = 0; i < 10;i++){
    		int num = (int)(Math.random()*10);
    		push(num);
    		System.out.print(num+" "+min()+"|");
    	}
    	System.out.println();
    	for(int i = 0;i < 10;i++){
    		System.out.print(min() + " ");
    		pop();
    	}
	}
}
