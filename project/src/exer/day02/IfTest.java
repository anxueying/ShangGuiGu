class IfTest{
	public static void main(String[] args){
		int age = 18;
		// �����ж� ��ʽ1
		if(age >= 18){
			System.out.println("���ϳ����͵�����");
		}
		// �����ж� ��ʽ2
		if(age >= 18){
			System.out.println("���ϳ����͵�����");
		}else{
			System.out.println("�ⲻ��ȥ�׶�԰�ĳ������³���");
		}
		// �����ж� ��ʽ3
		if(age < 0){
			System.out.println("�ⲻ��ȥ�׶�԰�ĳ������³���");
		}else if(age < 18){
			System.out.println("�㵱��ɵ");
		}else if(age > 60){
			System.out.println("ȥ���㳡��ɣ����ֻҷ�����");
		}else{
			System.out.println("���ϳ����͵�����");
		}
		System.out.println("���Խ���");
	}
}