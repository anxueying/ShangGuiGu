import java.util.Scanner;
class HomeworkPExer23{
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
		System.out.println(year+"��"+month+"��"+day+"������һ��ĵ�"+sum+"��");
	}
}

