import java.util.Scanner;
class HomeworkPExer24{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("�������꣺");
		int year = scan.nextInt();
		System.out.print("�������£�");
		int month = scan.nextInt();
		System.out.print("�������գ�");
		int day = scan.nextInt();
		
		int sum = 0;
		for(int i= 1;i<=month-1;i++){
			switch(i){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
					sum += 31;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					sum += 30;
					break;
				case 2:
					if((year%4==0&&year%100!=0)||(year%400==0)){
						sum += 29;
					}else{
						sum += 28;
					}
			}
		}
		sum += day;
		//����2000��
		for(int i = 2000;i<year;i++){
			if((i%4==0&&i%100!=0)||(i%400==0)){
						sum += 366;
					}else{
						sum += 355;
					}
		}
		
		switch(sum%5){
			case 1:
			case 2:
			case 3:
				System.out.println("�������");
				break;
			case 4:
			case 0:
				System.out.println("����ɹ��");
				break;
			default:
				System.out.println("�Ƿ�");
		} 
		
	}
}

