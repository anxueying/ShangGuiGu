/*
��֧��label�������Ƽ����ɶ��Խϲ�

break  ������ǰѭ��(����ѭ����������label��֧�ֽ��������
continue  ��������ѭ������������ѭ���������´�ѭ����������labelѭ��,��֧�ִ����
*/

class BreakContinueTest{
	public static void main(){
		label:for(int i=0;i<=10;i++){
			for(int j=0;j<=10;j++){
				if(j==3){
					System.out.println("---"+i);
					break label;//Ĭ�Ͻ����ڲ�ѭ��j����iѭ������;��label�������ָ��ѭ����
				}
				System.out.println(i);
			}
		}
		
		label:{//�Ӵ����
			for(int i=0;i<=10;i++){
				for(int j=0;j<=10;j++){
					if(j==3){
						System.out.println("---"+i);
						break label;//Ĭ�Ͻ����ڲ�ѭ��j����iѭ������;��label�������ָ��ѭ����
					}
					System.out.println(i);
				}
			}
			System.out.println("hello");
		}
		
		//����ѭ��
		for(;;){
			
		}
		
		while(true){
			
		}
	}
}