import java.util.Scanner;
class SwitchTest{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("��������֣�");
		int week = scan.nextInt();
		switch(week){
			case 1:
				System.out.print("����һ");
				break;
			case 2:
				System.out.print("���ڶ�");
				break;
			case 3:
				System.out.print("������");
				break;
			case 4:
				System.out.print("������");
				break;
			case 5:
				System.out.print("������");
				break;
			case 6:
				System.out.print("������");
				break;
			case 7:
				System.out.print("������");
				break;		
			default:
				System.out.print("�Ƿ�����");
				break;
		}
	}
}