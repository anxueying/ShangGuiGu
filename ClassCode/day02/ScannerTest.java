//1.导包
import java.util.Scanner;
class ScannerTest{
	public static void main(String[] args){
		//2.创建Scanner的对象
		Scanner scan = new Scanner(System.in);
		//3.通过next()或nextXxx()方法接收键盘收入
		System.out.print("请输入姓名：");
		String name = scan.next();
		
		System.out.print("请输入年龄：");
		Int age = scan.nextInt();//Xxx表示对应的基本数据类型
		
		System.out.print("请输入成绩：");
		Double score = scan.nextDouble();//Xxx表示对应的基本数据类型
		
		//注意：没有nextChar(),非要写，如下
		System.out.print("请输入性别：");
		char gender = scan.next().charAt(0);//获取字符串最开始那个字符
		
		System.out.println("姓名：" + name);
		System.out.println("年龄：" + age);
		System.out.println("成绩：" + score);
		System.out.println("性别：" + gender);
	}
}