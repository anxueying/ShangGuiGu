import java.util.Scanner;
class SwitchTest2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("������ɼ���");
		int score = scan.nextInt();
		switch(score/10){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.print("�ȼ���D");
				break;
			case 6:
				System.out.print("�ȼ���C");
				break;
			case 7:
			case 8:
				System.out.print("�ȼ���B");
				break;		
			case 9:
				System.out.print("�ȼ���A");
				break;		
			default:
				System.out.print("�ȼ���A");
				break;
		}
	}
}