import java.util.Scanner;//����
class AwardToMing{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);//����Scanner�Ķ���
		System.out.print("������С���ĳɼ���");
		Double score = scan.nextDouble();//��ȡ�ɼ�
		
		if(score == 100){
			System.out.print("����һ��BMW");
		}else if((score >= 80) && (score < 100)){
			System.out.print("����һ��̨iphone15s");
		}else if ((score >= 60) && (score < 80)){
			System.out.print("����һ���ο���");
		}else{
			System.out.print("ʲô����Ҳû��");
		}
	}
}