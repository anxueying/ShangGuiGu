class BreakContinueExer1{
	public static void main(String[] args){
		for(int i=1;i<=100;i++){
			if(i%13!=0){
				continue;//�����������������
			}
			System.out.println(i);
			/*
			13
			26
			39
			52
			65
			78
			91
			*/
			if(i%13==0){
				System.out.println("break:"+i);
				break//��ֹforѭ��
			}
			//break:13
		}
	}
}