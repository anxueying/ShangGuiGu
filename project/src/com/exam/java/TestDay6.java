package com.exam.java;

import homework.day06.java.PassObject;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class TestDay6 {
    int x,y;
    TestDay6(int x,int y){
        this.x = x;
        this.y = y;
    }
    public static void main(String[] args) {
        Penguin pgn = new Penguin();
        pgn.print();

        TestDay6 pt1,pt2;
        pt1 = new TestDay6(3,3);
        pt2 = new TestDay6(4,4);
        System.out.println(pt1.x+pt2.x);
    }

}

class Penguin{
    private String name = null;
    private  int health = 0;
    private  String sex = null;

    public Penguin(){
        health = 10;
        sex="xiong";
        System.out.println("执行");
    }

    public void print(){
        System.out.println(health);
    }
}
