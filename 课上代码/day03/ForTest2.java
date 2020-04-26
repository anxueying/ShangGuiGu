
class ForTest2{
	public static void main(String[] args){
		for(int i=100;i <= 999;i++){
			int i1 = i/100; //百位
			int i2 = (i/10)%10; //十位
			int i3 = i%10;//个位
			if (i1*i1*i1 + i2*i2*i2 + i3*i3*i3 == i){
				System.out.println(i);
			}
		}
	}
}