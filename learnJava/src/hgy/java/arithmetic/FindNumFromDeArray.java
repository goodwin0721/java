/*��һ����ά�����У�ÿ��һά����ĳ�����ͬ����
ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
�����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������*/
package hgy.java.arithmetic;
public class FindNumFromDeArray {
	
	public static boolean find(int target, int [][] array) {
		int row = array.length;//��
		int column = array[0].length;//��
//		System.out.println(row+" "+column);
    	//�����½ǵ����Ͻǲ�ѯ
    	int i = row-1;
    	int j = 0;
    	System.out.println(i + " " + j);
    	while(i>=0&&j<column){
    		if(array[i][j]==target)
    			return true;
    		else if(array[i][j]>target)
    			i--;
    		else if(array[i][j]<target)
    			j++;
    		System.out.println(i + " " + j);
    	}
        return false;
    }
    
    public static void main(String[] args) {
		int [][]arr = {{1,2,3,5,6},{2,4,5,7,9},{4,5,6,8,9}};
//		System.out.println(Arrays.deepToString(arr));
		for(int[]a:arr){
			for(int aa:a)
				System.out.print(aa+" ");
			System.out.println();
		}
		System.out.println(find(9,arr));
		
	}

}
