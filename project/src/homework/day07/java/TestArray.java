package homework.day07.java;

public class TestArray {
    public static void main(String[] args) {
        int[] array1,array2;

        array1 = new int[]{2,3,5,7,11,13,17,19};
        for (int a:array1){
            System.out.print(a+"\t");
        }
        System.out.println();

        //array2 = array1;//此时赋值的是地址值，所以array2修改了，array1也修改了
        array2 = new int[array1.length];
        for (int i = 0;i<array2.length;i++){
            array2[i] = array1[i];//拓展：实现复制操作
            if(i%2==0){
                array2[i]=i;
            }
        }

        for (int a:array1){
            System.out.print(a+"\t");
        }
        System.out.println();

        for (int a:array2){
            System.out.print(a+"\t");
        }

    }
}
