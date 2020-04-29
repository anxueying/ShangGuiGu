# 一、面向对象编程思想

1、面向对象编程思想的特点

2、面向对象：将现实生活中一类事物的共性内容进行提取，使用 Java 类对其进行描述

3、面向对象更加注重前期的设计

​	对类的设计

​	设计类就是设计类的成员（属性&方法）

4、类和对象

类：抽象的，描述的现实生活中的一类事物

对象：就是一个实实在在的个体

通过 new 关键字创建对象

![](E:\ShangGuiGu\ShangGuiGu\学习内容\img\QQ图片20200428183519.jpg)

> 什么是“面向对象”思想？
>
> 1. 面向对象可以将复杂的事情简单化。原来需要面对很多功能行为，现在只需将功能行为封装进对象，面对那一个具有功能行为的对象即可。
> 2. 面向对象可以使角色发生转变，从执行者变为指挥者。比如说面试官你是一个指挥者，你招我进来，我就是一个执行者，你只需要利用我编程功能即可，至于我是怎么编的，你不用担心执行细节，交给我即可
> 3. 面向对象更加注重前期的设计。一旦设计好后，就具有很强的通用性和可拓展性。
>    1. 通用性（在这能用，在那也能用）。
>    2. 可拓展性：有新功能，只要在功能里加即可，不用改动原来设计好的程序。



定义类：

```java
class 类{
    //属性-变量
    String a;
    int b;
    //行为-方法
    public void eat{
        //吃饭的动作
    }
}
```

调用属性和方法

```java
类 对象名 = new 类();
//属性
对象名.a = "属性1";
对象名.b = 1;
//方法
对象名.eat();
```



# 二、属性的特点

1、属性：也叫成员变量，也叫实例变量

2、局部变量 & 成员变量 的区别？

	1. 存储位置：局部变量在栈中，成员变量在堆中
 	2. 作用域：局部变量只在当前作用域{}中有效，成员变量在整个程序内有效
 	3. 初始值：局部变量使用前必须先赋值，没有默认值；成员变量根据数据类型的不同，有默认值。

3、属性的默认值

- byte,short,int   0
- long  0L
- float  0.0F
- double  0.0D
- char  '\u0000'
- boolean   false
- 引用数据类型  nulll
  - String
  - interface
  - 数组[]

![](E:\ShangGuiGu\ShangGuiGu\学习内容\img\蜂蜜浏览器_QQ图片20200428183724.jpg)



# 三、参数的值传递

```java
class MethodTest {
	public static void main(String[] args) {

		//变量的格式：数据类型 变量名 = 值;     int a = 10;
		Number1 num = new Number1(); //num类型为对象

		num.a = 10;
		num.b = 20;

		MethodTest mt = new MethodTest(); //调用类方法的步骤1

		System.out.println("num.a=" + num.a + ", num.b=" + num.b);

		mt.add(num); //调用类方法的步骤2

		System.out.println("num.a=" + num.a + ", num.b="+ num.b);
		//num.a=?  num.b=?
		
	}

	public void add(Number1 n){//Number1 n = num; 声明一个类方法
		System.out.println("n.a=" + n.a + " , n.b=" + n.b);//n.a=10 n.b=20

		n.a += 1;
		n.b += 2;

		System.out.println("n.a=" + n.a  + ", n.b=" + n.b);//n.a=11 n.b=22
	}
}

// 类
class Number1{

	int a;
	int b;

}
```

![](E:\ShangGuiGu\ShangGuiGu\学习内容\img\蜂蜜浏览器_QQ图片20200428185907.jpg)

