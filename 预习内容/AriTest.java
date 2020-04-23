//运算符测试
class AriTest{
	public static void main(String[] args){
		//除号：/
		int num1 = 12;
		int num2 = 5;
		int result1 = num1/num2; //2
		System.out.println(result1);
		
		int result2 = num1/num2*num2; //10
		System.out.println(result2);
		
		double result3 = num1/num2; //2.0
		System.out.println(result3);
		
		double result4 = num1/num2 + 0.0; //2.0
		System.out.println(result4);
		
		double result5 = num1/(num2 + 0.0); //2.4
		System.out.println(result5);
		
		double result6 = num1/(double)num2;//2.4
		System.out.println(result6);
		
		double result7 = (double)(num1/num2);//2.0
		System.out.println(result7);
		
		//余：%。经常用来判断是否能除尽。
		//结果的符号与被模数(-12)的符号相同。（-12%-5=-2）
		int m1 = 12;
		int n1 = 5;
		System.out.println("m1 % n1 = " + m1 % n1);

		int m2 = -12;
		int n2 = 5;
		System.out.println("m2 % n2 = " + m2 % n2);

		int m3 = 12;
		int n3 = -5;
		System.out.println("m3 % n3 = " + m3 % n3);

		int m4 = -12;
		int n4 = -5;
		System.out.println("m4 % n4 = " + m4 % n4);		
		
		
		//++,不会改变本身变量的数据类型
		int a1 = 10;
		int b1 = ++a1; //11
		System.out.println("b1 = " + b1 + ", a1 = " + a1);
		
		int a2 = 10;
		int b2 = a2++; //10
		System.out.println("b2 = " + b2 + ", a2 = " + a2);	

		byte a5 = 127;
		a5++;
		System.out.println("a5 = " + a5); //-128 二进制转换
		
		//--不会改变本身变量的数据类型
		int a3 = 10;
		int b3 = --a3; //11
		System.out.println("b3 = " + b3 + ", a3 = " + a3);
		
		int a4 = 10;
		int b4 = a4--; //10
		System.out.println("b4 = " + b4 + ", a4 = " + a4);		
				
		byte a6 = -128;
		a6--;
		System.out.println("a6 = " + a6); //127	二进制转换	 
		
	}
}