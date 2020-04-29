package com.exam.java;

public class TestDay4 {
    public static void main(String[] args){
        int a1=9;
        while (true){
            if(a1++>9)
                break;
        }
        System.out.println(a1); //11 在while外，经历两次++

        int a2=9;
        while (true){
            if(a2++>9)
                break;
            System.out.println(a2); //10 在while内，经历一次++
        }


        int i=10;
        do{
            i/=2;
        }while (i>1);
        System.out.println(i);

        int b=0;
        while (b<5){
            switch (b){
                case 0:
                case 3:
                    b = b+2;
                case 1:
                case 2:
                    b=b+3;
                default:
                    b=b+5;
            }
        }
        System.out.println(b);//10 没有break 运行到底

        int j =100;
        while (true){
            if(j++>100){
                break;
            }
            System.out.println(j);//101 第二个while被break掉，无法打印
        }

        for(int k=0;;){
            System.out.println("这是"+k);
            break;
        }
    }
}
