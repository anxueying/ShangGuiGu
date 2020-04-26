# 第一章 Java 编程语言概述

## 一、走进 Java 语言

1、 Java 由 SUN 公司研发，后来被 Oracle 收购

2、Java 之父：James Gosling

3、Java 由 1995 年发布，正事版本由 1996 年1月发布（jdk1.0）



## 二、Java 的特点

面向对象

分布式

简单化

多线程

安全

跨平台移植 ---- JVM Java 虚拟机



## 三、Java 的三大平台体系

JavaSE （Java Standard Edition）Java 标准版：适用于开发 C/S（Client/Server） 架构的应用程序

JavaEE（Java Enterprise Edition）Java 企业版：适用于开发B/S（Browser/Server）架构的应用程序

JavaME（Java Micro Edition）Java 微型版：---->  Android



## 四、开发第一个应用程序

### 1、搭建开发环境

JVM （Java Virtual Machine）Java 虚拟机：用于与操作系统进行交互

![](img/JVM.PNG)

JRE（Java Runtime Environment）Java 运行环境：JVM + Java 提供的核心类库

JDK（Java Development Kit）Java 开发工具集：JRE + Java 开发工具包（javac.exe java.exe javadoc.exe）



### 2、下载安装 JDK

①通过命令提示符到 JDK 安装路径的bin路径下，执行 javac

②配置 path 环境变量： JDK 安装路径的bin路径下

​	目的：在任意路径下执行 javac

​	执行流程：先在当前路径下找是否有 javac.exe,若没有再到 path 环境变量中从前往后依次查找

③配置 JAVA_HOME ：配置到 JDK 安装路径的根目录。 如： d:\java\jdk1.8.0.1



### 3、开发第一个应用程序的步骤

①编写：.java 源文件。 【HelloWorld.java】

```java
public class HelloWorld{
    public static void main(String[] args){
        System.out.println("HelloWorld!");
    } 
}
```

②编译：通过 javac 命令，生成一个或多个 .class 字节码文件。【javac HelloWorld.java】

③运行：通过 java 命令，将一个或多个 .class 字节码文件加载到内存中。【java HelloWorld】



### 4、开发第一个应用程序的注意

①以.java结尾的文件称为 .java 源文件

②一个.java 源文件中可以有多个类

③一个 .java 源文件中只能有一个 public 修饰的类

④public 修饰类的名称必须与 .java 源文件名称一致

⑤每条语句以 ";" 分号结尾

⑥Java 严格区分大小写

⑦一类中只能有一个 main 方法，称为主方法，是程序的入口

```java
 public static void main(String[] args){}
```



## 五、注释语句

不会被 JVM 解释执行的语句。利用注释语句解释说明一段代码



//单行注释



/*

多行注释

注意：多行注释不能嵌套

*/



/**

Java 特有的注释：文档注释

可以通过 javadoc -d mydoc -author -version HelloWorld.java 命令生成说明文档

*/



# 第二章 Java 基础语法1

## 一、标识符

Java 中凡是自己命名的地方，都叫标识符。如：包名、类名、接口名、方法名、变量名、常量名



关键字：就是被 Java 赋予了特殊含义的单词

![](img/关键字和保留字.png)



### 1、命名规则（必须遵守，若不遵守编译不能通过）

①只能有字母 a-z A-Z, 数字 0-9，特殊字符 下划线"_" 和 美元符"$"

②数字不能开头

③名字之间不可以包含空格

④不能使用关键字和保留字，但是可以包含关键字和保留字

⑤Java 严格区分大小写，但是长度无限制



### 2、命名规范（可以不遵守，但是会受到鄙视）

①包名：所有字母都小写。 如：xxxyyyzzz

②类名、接口名：若由多个单词组成，所有单词的首字母都大写。 如： XxxYyyZzz

③变量名、方法名：若由多个单词组成，第一个单词首字母小写，其余单词首字母大写。如：xxxYyyZzz

④常量名：所有字母都大写，每个单词之间以 "_" 隔开。如： XXX_YYY_ZZZ



## 二、变量

保存数据



**局部变量**  &  成员变量



1. 变量的格式：数据类型 变量名 = 值;   如： int var = 10;

   //声明一个变量

   int var;

   //为变量赋值

   var = 10;

   var = 20;

2. 变量的概念：

   ①在内存中开辟一块内存中间

   ②该空间有名称（变量名）有类型（数据类型）

   ③变量可以在指定的范围内不断的变化

3. 变量的注意：

   ①在同一个作用域内变量名不能重复

   ②作用域：变量作用在所属的那对 {} 内

   ③**局部变量在使用前必须赋值**

   ④先声明，后使用



## 三、进制之间的转换（了解）

![1587691629833](img/1587691629833.png)



## 四、变量的数据类型

1、基本数据类型（8种）

​	 整型：byte(8位  -128 ~ 127)  short(16位)  int（32位）-默认类型  long(64位)

​	 浮点型：float(32位)  double(64位)-默认类型

​	 字符型：char(2个字节-16位)

​	 布尔型：boolean

2、引用数据类型

​		|--类(class)  ------------  String

​		|--接口(interface)

​		|--数组([])

3、声明变量的注意

①声明 long 型变量时，值后必须加 L 或 l 。  如：long l1 = 12223453**L**;

②声明 float 型变量时，值后必须加 F 或 f 。如：float f1 = 15.6F;

③声明 double 型变量时，值后可以 D 或 d 。 如： double d1 = 15.6D;

④声明 char 型变量时，值必须使用单引号。char 型变量只能存储单个字符

   char 以 Unicode 编码存储（包含中文、日文、特殊字符等）

​	如：char c1 = 'a';

​		char c2 = '中';

​		char c3 = '\n';

​		char c4 = '\u0004';

⑤声明 String 型变量时，值后必须使用双引号



## 五、数据类型之间的转换

自动类型转换（自动升级）：小容量转大容量。系统自动完成。

​	①byte short char ---> int ---> **long  --->  float**  --->  double

​	②byte short char 三者之间不做运算，若运算将自动提升为 int 再做运算

​	③boolean 不参与运算的



​	④任何基本数据类型与 String 使用连接符(+), 都将串接为 String

强制类型转换：大容量转小容量。需要使用强转符“(需要转换的类型)” 

​			   可能损失精度

int i1 = 123;

byte b1 = (byte)i1;



## 六、运算符

算数运算符 ：+ -  *  /  %  前++ 后++  前-- 后--  连接符(+)  +  -

//除法：

int res = 1234 / 1000 * 1000;  //1000

//取模

int res = -1 % 5;

//++ 运算符

int i = 10;

int j = i++;

System.out.println(i);

//关于 ++ 的面试题

int i = 10;

i = i++;

System.out.println(i);//i=10

![1587777440584](img/1587777440584.png)



//考试题

int x = 1, y = 1;

if(x++ == 2 && ++y == 1){

​	x = 7;

}

System.out.println(x);//x=2



赋值运算符: =  +=  -=  *=  /=  %=

【面试题】

short s = 1;

s = s + 1;//编译？NO

s += 1; //s = (short)(s + 1)编译？YES



比较运算符（关系运算符）：==  !=  >  <  >=  <=

​	结果都为 boolean 值

逻辑运算符：&&-短路与   ||-短路或   !-逻辑非   &-逻辑与   |-逻辑或   ^-逻辑异或

​	结果都为 boolean 值

​	需求：判断一个数是不是大于 10 小于 20

​	int a = 10;

​	//10 < a < 20; 错误的做法

​	boolean boo = a > 10 && a < 20;

【面试题】&& 与 & 的区别？     ||  与  |  的区别？

​	&& ：称为短路与，当左边表达式结果为 false 时，右边表达式将不再计算

​	&：是位运算符，当用于逻辑运算时，无论左边表达式结果为 true 还是false ，右边都计算

位运算符：~  &  |  ^   <<   >>  >>>

【面试题】用最快的速度计算 2 * 8 结果

  2 << 3;

三元运算符

 	格式：条件表达式 ?  表达式1 : 表达式2;

​	①若条件表达式结果为 true 执行表达式1，否则执行表达式2

​	②表达式1和表达式2结果的类型需要保持一致

​	int a = 10;

​	int b = 20;

​	//a > b ? a : "哈哈哈"；错误的写法

​	//System.out.println(a > b ? a : "哈哈哈"); 不建议使用

# 第三章 Java 基础语法2

## 流程控制

### 顺序结构

### 分支结构

#### if条件判断

​		①

​			if(条件表达式){

​				//若 条件表达式 结果为 true 时，需要执行的语句 

​			}



​		②

​			if(条件表达式){

​				//若 条件表达式 结果为 true 时，需要执行的语句 

​			}else{

​				//若 条件表达式 结果为 false 时，需要执行的语句

​			}

​		③

​			if(条件表达式1){

​				//若 条件表达式1 结果为 true 时，需要执行的语句

​			}else if(条件表达式2){

​				//若 条件表达式2 结果为 true 时，需要执行的语句

​			}

​			……

​			else{

​				//若上述条件表达式结果都为 false 时，需要执行的语句

​			}

​		注意：

​			①若某个条件表达式结果为 true 时，执行相应语句，其他 else-if 将不再执行

​			②if-else 语句可以嵌套

#### switch-case

```java
switch(变量){
    case 条件1:
        执行语句1;
        break; //可选
    case 条件2:
        执行语句2;
        break; //可选
    default: //可选
        执行语句3;
        break; //可选
}
```

注意：

- break没有的话，会有“击穿”效果。如满足条件1，则执行语句1、2、3均会执行
- 凡是if均可转换为switch..case，反之不行
- 在判断条件不多，且可使用switch时优先使用switch。效率略高。
- if和switch可互相嵌套使用

### 循环结构

#### 1. FOR

#### 2. WHILE

#### 3. DO..WHILE

#### 4. 三者的区别

#### 5. 嵌套循环