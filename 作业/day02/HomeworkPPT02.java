import java.util.Scanner;//����
class SortTest{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);//����Scanner�Ķ���
		System.out.print("���������num1��");
		int num1 = scan.nextInt();
		System.out.print("���������num2��");
		int num2 = scan.nextInt();
		System.out.print("���������num3��");
		int num3 = scan.nextInt();
		
		if(num1 > num2){
			//num1 > num2
			if(num1 > num3){
				//num1 > num2 & num1 > num3
				if(num2>num3){
					System.out.print("��С��������Ϊ��"+num3+"��"+num2+"��"+num1);
				}else{
					System.out.print("��С��������Ϊ��"+num2+"��"+num3+"��"+num1);
				}
		    }
			else{
				//num1 > num2 & num1 <= num3				
				System.out.print("��С��������Ϊ��"+num2+"��"+num1+"��"+num3);
			}	
		}else{
			//num1 <= num2
			if(num1 > num3){
				//num1 <= num2 & num1 > num3
				System.out.print("��С��������Ϊ��"+num3+"��"+num1+"��"+num2);
			}else{
				//num1 <= num2 & num1 <= num3
				if(num2>num3){
					System.out.print("��С��������Ϊ��"+num1+"��"+num3+"��"+num2);
				}else{
					System.out.print("��С��������Ϊ��"+num1+"��"+num2+"��"+num3);
				}
			}
		}
	}
}