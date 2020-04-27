/**
 * Swap
 * ��������������ֵ�ķ���
 * @author bc
 * @since 2018��3��27��
 */
public class Swap {
    public static void main(String[] args) {
        int a = 3, b = 5;
        System.out.println("===��ʱ����===");
        temp(a, b);
        System.out.println("===��������===");
        arithmetic(a, b);
        System.out.println("===λ����====");
        bit(a, b);
    }

    // ����������������ʹa,b������ֵ����
    public static void temp(int a, int b) {
        System.out.println("a=" + a + "��b=" + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("a=" + a + "��b=" + b);
    }

    // ��������--(����������������)
    public static void arithmetic(int a, int b) {
        System.out.println("a=" + a + "��b=" + b);

        a = a + b;//8
        b = a - b;//3
        a = a - b;//5

        System.out.println("a=" + a + "��b=" + b);
    }

    // λ����--(����������������)
    public static void bit(int a, int b) {
        System.out.println("a=" + a + "��b=" + b);
        
        //��λ�����������--�죺1
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

        System.out.println("a=" + a + "��b=" + b);
    }
}