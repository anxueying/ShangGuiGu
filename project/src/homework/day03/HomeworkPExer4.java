import java.util.Scanner;
class HomeworkPExer4{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("��������������");
		int week = scan.nextInt();
		switch(week){
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("����"+week);
				break;
			case 7:
				System.out.println("������");
				break;
			default:
				System.out.println("�Ƿ�����");
				break;				
		}
		
	}
}