class ThreeVtest{
	public static void main(String[] args){
		int a = 10;
		int b = 13;
		int c = 18;
		int bc = b>c?b:c;
		System.out.println(a>b?a:b);
		System.out.println(a>bc?a:bc);
		int max = (a>b)?(a>c?a:c):(b>c?b:c);//≤ªΩ®“È
	}
}