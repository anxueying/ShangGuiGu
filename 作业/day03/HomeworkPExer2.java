import java.util.Scanner;
class HomeworkPExer2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("������ѧ���ɼ���");
		int score = scan.nextInt();
		switch(score/60){
			case 0:
				System.out.println("���ϸ�");
				break;
			case 1:
				System.out.println("�ϸ�");
				break;
			default:
				System.out.println("���ϸ�");
				break;				
		}
		
	}
}