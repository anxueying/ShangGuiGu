//1)�����д��룬���������ָ����������
class HomeWork03{
	public static void main(String[] args){
		int x = 4;
		int y = 1;
		if(x>2){
			if(y>2)
				System.out.println(x + y); //ֻ��һ�еĻ����Բ��ã���
				System.out.println("atguigu"); //�൱��û���������������
		}else
			System.out.println("x is " + x); //ֻ��һ�еĻ����Բ��ã���
		
		
	    boolean b = true;
        if(b == false)  //���д��if(b=false)�ܱ���ͨ��������ܣ�����ǣ�
	    System.out.println("a");//�����
        else if(b)
	    System.out.println("b");//���b
        else if(!b)
	    System.out.println("c");//�����
        else
	    System.out.println("d");//�����
	
	    if(b = false)  //���д��if(b=false)�ܱ���ͨ��������ܣ�����ǣ�
	    System.out.println("a");//�����
        else if(b)
	    System.out.println("b");//�����
        else if(!b)
	    System.out.println("c");//���c
        else
	    System.out.println("d");//�����
	}
	
}
