import java.util.Scanner;
class Test2{
	public static void main(String[] args){
		double discount = 1;
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入总价格：");
		int totalPrice = scan.nextInt();
		switch(totalPrice/100){
			case 5:
				discount = 0.5;
				break;
			case 4:
				discount = 0.6;
				break;
			case 3:
				discount = 0.7;
				break;
			case 2:
				discount = 0.8;
				break;
			case 1:
			case 0:
				discount = 1;
				break;
			default:
				System.out.println("输入有误");
		}
		System.out.println("总价："+(double)totalPrice);
		System.out.println("折扣："+discount);
		System.out.println("折扣后总价："+discount*totalPrice);
	}
}