//��ӡ1-100���ڵ�����
class PrimeNum{
	public static void main(String[] args){
		for(int i =2;i<=100;i++){
			boolean flag = true;
			for(int j=2;j<i;j++){
				//����Ա���������϶�����
				if(i%j==0){
					flag = false;
				}
			}
			//���flag��true��˵��û����if
			if(flag){
				System.out.println(i);
			}
		}
	}
}