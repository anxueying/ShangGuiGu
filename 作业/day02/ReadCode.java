//1. ���´���ļ������ǣ�
int i = 1;
i *= 0.2;  //����ı��������ͣ�����iΪ(int)0.2=0
i++; //1
System.out.println("i=" + i); 


//2. ���´�����������ǣ�

int i = 2; 
i *= i++; //4
/*
1. int i = 2;
2. i++�����������ʱ����int temp = i;
3. temp = 2;
4. i++ --> i=3
5. temp��ֵ��i --> i=2
6. *= ���� 2*2 = 4
*/

int j = 2;
j *= j+1;  //6

int k = 2;
k *= ++k; //9
/*
1. int k = 2;
2. ++k�����������ʱ����int temp = k+1;
3. temp = 3;
4. ++k --> k=3
5. temp��ֵ��k --> k=3
6. *= ���� 3*3 = 9
*/
System.out.println("i=" + i);
System.out.println("j=" + j);
System.out.println("k=" + k);

//3.
	public static void main(String[] args) {
		int a = 3;
		int b = 1;
		if(a = b){//�������ӦΪa==b
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
	}

//4.
	public static void main(String[] args) {
		int a = 8, b = 3;
		System.out.println(a>>>b); //1
		System.out.println(a>>>b | 2); //3
	}