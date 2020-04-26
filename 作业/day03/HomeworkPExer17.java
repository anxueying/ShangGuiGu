import java.util.Scanner;
class HomeworkPExer17{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("ÇëÊäÈëÄê·İ£º");
		int year = scan.nextInt();
			
		String constel = "";
		switch(year%12){
			case 1:
				constel = "¼¦";
				break;
			case 2:
				constel = "¹·";
				break;
			case 3:
				constel = "Öí";
				break;
			case 4:
				constel = "Êó";
				break;
			case 5:
				constel = "Å£";
				break;
			case 6:
				constel = "»¢";
				break;
			case 7:
				constel = "ÍÃ";
				break;
			case 8:
				constel = "Áú";
				break;
			case 9:
				constel = "Éß";
				break;
			case 10:
				constel = "Âí";
				break;
			case 11:
				constel = "Ñò";
				break;
			case 12:
				constel = "ºï";
				break;
			default:
				constel = "ºï";
				break;
		}
		
		
		System.out.println(year+"ÄêÊÇ"+constel+"Äê");

	}
}