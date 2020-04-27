//没结果，检查一下问题
class Test1{
	public static void main(String[] args){
		
		long start = System.currentTimeMillis();
		
		for(int i=2;i<=10;i++){
			boolean flag = true;	
			for(int j=2;j<i;j++){ //不除自身
				if(i%j==0){
					flag = false;
					break; //确定不是，即可结束循环
				}
			}
			if(flag){
				System.out.println(i);
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println("耗费时间为："+(end-start)/1000/+"s")
	}
}