import java.util.Scanner;
class HomeworkPExer17{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("��������ݣ�");
		int year = scan.nextInt();
			
		String constel = "";
		switch(year%12){
			case 1:
				constel = "��";
				break;
			case 2:
				constel = "��";
				break;
			case 3:
				constel = "��";
				break;
			case 4:
				constel = "��";
				break;
			case 5:
				constel = "ţ";
				break;
			case 6:
				constel = "��";
				break;
			case 7:
				constel = "��";
				break;
			case 8:
				constel = "��";
				break;
			case 9:
				constel = "��";
				break;
			case 10:
				constel = "��";
				break;
			case 11:
				constel = "��";
				break;
			case 12:
				constel = "��";
				break;
			default:
				constel = "��";
				break;
		}
		
		
		System.out.println(year+"����"+constel+"��");

	}
}