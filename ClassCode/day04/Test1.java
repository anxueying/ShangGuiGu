//û��������һ������
class Test1{
	public static void main(String[] args){
		
		long start = System.currentTimeMillis();
		
		for(int i=2;i<=10;i++){
			boolean flag = true;	
			for(int j=2;j<i;j++){ //��������
				if(i%j==0){
					flag = false;
					break; //ȷ�����ǣ����ɽ���ѭ��
				}
			}
			if(flag){
				System.out.println(i);
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println("�ķ�ʱ��Ϊ��"+(end-start)/1000/+"s")
	}
}