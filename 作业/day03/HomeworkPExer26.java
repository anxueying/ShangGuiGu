class HomeworkPExer26{
	public static void main(String[] args){
		for(int i=1;i<=7;i++){//ÐÐ
			for(int j=1;j<=7;j++){
				if(j==i||j==8-i){
					System.out.print("O");
				}else{
					System.out.print("*");
				}	
			}    //ÁÐ
		System.out.println();	
		}
	}
}

/*
iÐÐ  O1    O2   *
1    1     7     
2    2     6
3    3     5
4    4	   4
5    5     3
6    6     2
7    7     1



*/