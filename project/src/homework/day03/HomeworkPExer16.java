import java.util.Scanner;
class HomeworkPExer16{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("�������·ݣ�");
		int month = scan.nextInt();
		System.out.print("���������ڣ�");
		int day = scan.nextInt();		
		String constel = "";
		switch(month){
			case 1:
				if(day>19){
					constel = "ˮƿ��";
				}else{
					constel = "Ħ����";
				}
				break;
			case 2:
				if(day>18){
					constel = "˫����";
				}else{
					constel = "ˮƿ��";
				}
				break;
			case 3:
				if(day>20){
					constel = "������";
				}else{
					constel = "˫����";
				}
				break;
			case 4:
				if(day>19){
					constel = "��ţ��";
				}else{
					constel = "������";
				}
				break;
			case 5:
				if(day>20){
					constel = "˫����";
				}else{
					constel = "��ţ��";
				}
				break;
			case 6:
				if(day>21){
					constel = "��з��";
				}else{
					constel = "˫����";
				}
				break;
			case 7:
				if(day>22){
					constel = "ʨ����";
				}else{
					constel = "��з��";
				}
				break;
			case 8:
				if(day>22){
					constel = "��Ů��";
				}else{
					constel = "ʨ����";
				}
				break;
			case 9:
				if(day>22){
					constel = "�����";
				}else{
					constel = "��Ů��";
				}
				break;
			case 10:
				if(day>23){
					constel = "ˮƿ��";
				}else{
					constel = "Ħ����";
				}
				break;
			case 11:
				if(day>22){
					constel = "������";
				}else{
					constel = "��Ы��";
				}
				break;
			case 12:
				if(day>21){
					constel = "Ħ����";
				}else{
					constel = "������";
				}
				break;
		}
		
		
		System.out.println("����"+month+"��"+day+"����"+constel);

	}
}