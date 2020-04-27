class PptExer4{
	public static void main(String[] args){
		int squar = Another.method(2,3);
		System.out.println("¾ØÐÎÃæ»ý£º"+squar);
	}

}

class Another{
	public static int method(int m,int n){
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		return m*n;
		
	}	
}