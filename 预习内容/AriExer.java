/*
给出一个三位数的整数，打印显示它的个位数、十位数、百位数的值
*/
class AriExer{
	public static void main(String[] args){
		int num1 = 187;
		System.out.println("数字"+num1+"的情况如下：");
		System.out.println("个位数："+num1%10);
		System.out.println("十位数："+num1%100/10);
		System.out.println("百位数："+num1/100);
	}
}