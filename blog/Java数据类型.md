# Java运算符

一般而言，单目运算符优先级较高，赋值运算符优先级较低。算术运算符优先级较高，关系和逻辑运算符优先级较低。多数运算符具有左结合性，单目运算符、三目运算符、赋值运算符具有右结合性。

Java 语言中运算符的优先级共分为 14 级，其中 1 级最高，14 级最低。在同一个表达式中运算符优先级高的先执行。表 1 列出了所有的运算符的优先级以及结合性。

表1 运算符的优先级

| 优先级 | 运算符                                           | 结合性   |
| ------ | ------------------------------------------------ | -------- |
| 1      | ()、[]、{}                                       | 从左向右 |
| 2      | !、+、-、~、++、--                               | 从右向左 |
| 3      | *、/、%                                          | 从左向右 |
| 4      | +、-                                             | 从左向右 |
| 5      | «、»、>>>                                        | 从左向右 |
| 6      | <、<=、>、>=、instanceof                         | 从左向右 |
| 7      | ==、!=                                           | 从左向右 |
| 8      | &                                                | 从左向右 |
| 9      | ^                                                | 从左向右 |
| 10     | \|                                               | 从左向右 |
| 11     | &&                                               | 从左向右 |
| 12     | \|\|                                             | 从左向右 |
| 13     | ?:                                               | 从右向左 |
| 14     | =、+=、-=、*=、/=、&=、\|=、^=、~=、«=、»=、>>>= | 从右向左 |

使用优先级为 1 的小括号可以改变其他运算符的优先级，即如果需要将具有较低优先级的运算符先运算，则可以使用小括号将该运算符和操作符括起来。

## 1. 算数运算符

| 运算符 | 含义                                                   |
| ------ | ------------------------------------------------------ |
| +      | 正号                                                   |
| -      | 负号                                                   |
| +      | 加                                                     |
| -      | 减                                                     |
| *      | 乘                                                     |
| /      | 除。注意不能除尽时结果的运算顺序。                     |
| %      | 取模，结果的符号与被模数(-12)的符号相同。（-12%-5=-2） |
| (前)++ | 自增，先自增后运算。自增不会改变本身变量的数据类型     |
| (后)++ | 自增，先运算后自增。自增不会改变本身变量的数据类型     |
| (前)-- | 自减，先自减后运算。自减不会改变本身变量的数据类型     |
| (后)-- | 自减，先运算后自减。自减不会改变本身变量的数据类型     |

## 2. 赋值运算符

- 符号：=
  - 数据类型不一致，可自动或强制转换
  - 支持连续赋值`int i1 = 10, i2 =11;`
- 扩展：`+=`,`-=`,`*=`,`/=`,`%=`
  - 一般情况下`a+=1`等同于`a = a+1`
  - 当a为byte、short时，使用扩展运算符，数据类型不会变为int，仍为原数据类型

## 3. 逻辑运算符

| 运算符 | 含义     | 记忆点                  | 区别                             |
| ------ | -------- | ----------------------- | -------------------------------- |
| &      | 逻辑与   | 且                      | 左边无论真假，右边都进行运算     |
| &&     | 短路与   | 且                      | 左真右算，左假右不算             |
| \|     | 逻辑或   | 或                      | 左边无论真假，右边都进行运算     |
| \|\|   | 短路或   | 或                      | 左假右算，左真右不算（与&&相反） |
| !      | 逻辑非   | 非                      |                                  |
| ^      | 逻辑异或 | 相同为true，不同为false |                                  |

## 4. 比较运算符（关系运算符）

结果是boolean类型

| 运算符    | 含义                 |
| --------- | -------------------- |
| ==        | 相等于               |
| !=        | 不等于               |
| >         | 大于                 |
| <         | 小于                 |
| >=        | 大于等于             |
| <=        | 小于等于             |
| instancof | 检查是否是类的“对象” |

## 5. 位运算符

位运算符是直接二进制运算符，因此叫“位”运算符。具体有以下符号：

| 符号   | 含义       | 范例      | 细节                                                         |
| ------ | ---------- | --------- | ------------------------------------------------------------ |
| >>     | 右移       | 12>>2     | 二进制数右移，移除部分删掉，如首位为1，空余位数以1补足，如首位为0，空余位数以0补足。 |
| <<     | 左移       | 12<<2     | 二进制数左移，移除部分删掉，末尾以0补足。                    |
| >>>    | 无符号右移 | 12>>>2    | 二进制数右移，移除部分删掉，无论首位为什么，空余位数以0补足  |
| **\|** | **或**     | **12\|2** | **只有0\|0=0，其余为1**                                      |
| **&**  | **与**     | **12&2**  | **只有1&1=1，其余为0**                                       |
| **^**  | **异或**   | **12^2**  | **相同为0，不同为1。如0^0=0,1^0=1**                          |
| ~      | 反         | ~6=-7     | 按补码各位取反                                               |

## 6. 三元运算符

`(条件表达式)? 表达式1：表达式2`，根据条件表达式的结果：

- true：执行表达式1
- false：执行表达式2

可嵌套使用，表达式1和表达式2要求数据类型一致（不能一个字符串一个数字）。

凡是可使用三元运算符的地方，都可以改写为if-else，反之不成立。

优点：简洁高效

