//1.����
import java.util.Scanner;
class ScannerTest{
	public static void main(String[] args){
		//2.����Scanner�Ķ���
		Scanner scan = new Scanner(System.in);
		//3.ͨ��next()��nextXxx()�������ռ�������
		System.out.print("������������");
		String name = scan.next();
		
		System.out.print("���������䣺");
		Int age = scan.nextInt();//Xxx��ʾ��Ӧ�Ļ�����������
		
		System.out.print("������ɼ���");
		Double score = scan.nextDouble();//Xxx��ʾ��Ӧ�Ļ�����������
		
		//ע�⣺û��nextChar(),��Ҫд������
		System.out.print("�������Ա�");
		char gender = scan.next().charAt(0);//��ȡ�ַ����ʼ�Ǹ��ַ�
		
		System.out.println("������" + name);
		System.out.println("���䣺" + age);
		System.out.println("�ɼ���" + score);
		System.out.println("�Ա�" + gender);
	}
}