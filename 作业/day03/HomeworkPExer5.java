import java.util.Scanner;
class HomeworkPExer5{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("������ѧ���ɼ���");
		int score = scan.nextInt();
		switch(score/10){
			case 10:
			case 9:
				System.out.println("�ȼ���A");
				break;
			case 8:
			case 7:
				System.out.println("�ȼ���B");
				break;
			case 6:
				System.out.println("�ȼ���C");
				break;
			default:
				System.out.println("�ȼ���D");
				break;				
		}
		
	}
}