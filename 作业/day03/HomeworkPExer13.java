import java.util.Scanner;
class HomeworkPExer13{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("������һ��������");
		int num = scan.nextInt();
		if(num%2==0){
			System.out.print(num + "��ż��");
		}else{
			System.out.print(num + "������");
		}
		
	}
}