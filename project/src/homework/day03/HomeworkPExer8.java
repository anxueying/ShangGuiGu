class HomeworkPExer8{
	public static void main(String[] args){
		int sum = 0,count = 0;
		for(int i=1;i<=100;i++){
			if(i%7 == 0){
				sum += i;
				count++;
			}
		}
		System.out.println("1~100֮����7�ı����ĸ���Ϊ��"+count);
		System.out.println("1~100֮����7�ı����������ĺ�Ϊ��"+sum);
	}
}