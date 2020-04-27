class HomeworkPExer11{
	public static void main(String[] args){
		for(int i=2;i<=100;i++){
			int num = 0;
			for(int j=2;j<i;j++){
				if(i%j!=0){
					num++;
				}
			}
			if(num==i-2)//只有1和自身被整除
				System.out.println(i);
			}
		}
	}
}