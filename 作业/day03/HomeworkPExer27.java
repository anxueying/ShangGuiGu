class HomeworkPExer27{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){//��
			for(int j=1;j<=5-i;j++){
				System.out.print("\t");
			}    //��
			
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*\t");
			}
		System.out.println();	
		}
		for(int i=6;i<=9;i++){//��
			for(int j=1;j<=i-5;j++){
				System.out.print("\t");
			}    //��
			
			for(int k=1;k<=2*(10-i)-1;k++){
				System.out.print("*\t");
			}
		System.out.println();	
		}
	}
}
/*

				*
			*	*	*
		*	*	*	*	*
	*	*	*	*	*	*	*	
*	*	*	*	*	*	*	*	*
	*	*	*	*	*	*	*	
		*	*	*	*	*
i   j   k
1   4   1
2   3   3
3   2   5
4   1   7 
5   0   9
j=i-5
6   1   7    19-2i    
7   2   5    
8   3   3   
9   4   1   

*/