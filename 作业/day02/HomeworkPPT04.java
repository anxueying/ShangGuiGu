import java.util.Scanner;//����
class IfMarried{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);//����Scanner�Ķ���
		
		System.out.print("��ߣ���cm��");
		int height = scan.nextInt();
		
        System.out.print("�Ƹ�����ǧ��");
		double money = scan.nextDouble();
		
        System.out.print("˧�񣺣�true/false��");
		boolean handsome = scan.nextBoolean();	
		
		if((handsome == true) &&(height>180)&&(money>1)){
			System.out.print("��һ��Ҫ�޸���������");
	    }else if((handsome == true) ||(height>180) || (money>1)){
			System.out.print("�ްɣ����ϲ��㣬�������ࡣ");
		}else if ((handsome == false) &&(height<=180)&&(money<=1)){
			System.out.print("���ޣ�");
		}else{
			System.out.print("�ްɣ����ϲ��㣬�������ࡣ");
		}
	}
}