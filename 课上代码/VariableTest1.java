class VariableTest1{
	public static void main(String[] args){
		double var1 = 2;
		double var2 = 1.9;
		//��Ϊ����var2��ֵҪ���ˣ������ڴ˴�����str
		String str = var1 + "/" + var2 + "=";
		//����ĿҪ��ֵ
		var2 = var1/var2;
		//������
		System.out.println(str+var2); 
	}
}