class Test1{
	public static void main(String[] args){
		byte b1 = 10, b2 = 20;
		int b3 = b1 + b2;
		System.out.println("byte类型b1和b2的和为：\n"+b3);
		
		short s1 = 1000, s2 = 2000;
		int s3 = s1 + s2;
		System.out.println("short类型s1和s2的和为：\n"+s3);
		
		char ch1 = 'a';
		int i1 = 30;
		int ch3 = ch1 - i1;
		System.out.println("char类型ch1和int类型i1的差为：\n"+ch3);
	}
}