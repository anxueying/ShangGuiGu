/**
 * Swap
 * 互换两个变量的值的方法
 * @author bc
 * @since 2018年3月27日
 */
public class Swap {
    public static void main(String[] args) {
        int a = 3, b = 5;
        System.out.println("===临时变量===");
        temp(a, b);
        System.out.println("===算数运算===");
        arithmetic(a, b);
        System.out.println("===位运算====");
        bit(a, b);
    }

    // 借助第三个变量，使a,b变量的值交换
    public static void temp(int a, int b) {
        System.out.println("a=" + a + "；b=" + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("a=" + a + "；b=" + b);
    }

    // 算数运算--(不借助第三个变量)
    public static void arithmetic(int a, int b) {
        System.out.println("a=" + a + "；b=" + b);

        a = a + b;//8
        b = a - b;//3
        a = a - b;//5

        System.out.println("a=" + a + "；b=" + b);
    }

    // 位运算--(不借助第三个变量)
    public static void bit(int a, int b) {
        System.out.println("a=" + a + "；b=" + b);
        
        //按位异或的运算规则--异：1
        /**
         *     a    :0011
         *     b    :0101
         * a^b  :0110
         */
        a = a ^ b; //0110
        /**
         *     a     :0110
         *     b     :0101
         *     a^b  :0011
         */
        b = a ^ b; //0011
        /**
         *     a     :0110
         *     b     :0011
         *     a^b  :0101
         */
        a = a ^ b; //0101

        System.out.println("a=" + a + "；b=" + b);
    }
}