import java.util.Scanner;
class Test2{
	public static void main(String[] args){
		double discount = 1;
		Scanner scan = new Scanner(System.in);
		System.out.print("�������ܼ۸�");
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
				System.out.println("��������");
		}
		System.out.println("�ܼۣ�"+(double)totalPrice);
		System.out.println("�ۿۣ�"+discount);
		System.out.println("�ۿۺ��ܼۣ�"+discount*totalPrice);
	}
}