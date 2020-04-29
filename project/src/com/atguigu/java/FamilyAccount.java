package com.atguigu.java;

/**
 * @author Shelly
 * @version v1.0
 */
//import java.util.Scanner;
public class FamilyAccount {
    public static void main(String[] args){
        //Scanner scan = new Scanner(System.in);
        boolean loopFlag = true; //是否执行程序
        int balance = 10000;
        String details = "收支\t账户金额\t收支金额\t说明\n";
        String markdown = "";

        do{
            System.out.print("1.收支明细\n2.登记收入\n3.登记支出\n4.退   出\n请选择(1-4)：");
            char choice = Utility.readMenuSelection();
            switch (choice){
                case '1':
                    System.out.println("------当前收支明细记录------");
                    //显示所有的收入、支出名细列表
                    System.out.print(details);
                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    int earn = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    markdown = Utility.readString();
                    balance += earn;
                    details += "收入\t"+balance+"\t"+earn+"\t"+markdown+"\n";
                    System.out.print("------成功记录------");
                    break;
                case '3':
                    System.out.print("本次支出金额：");
                    int cost = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    markdown = Utility.readString();
                    balance -= cost;
                    details += "支出\t"+balance+"\t"+cost+"\t"+markdown+"\n";
                    System.out.println("------成功记录------");
                    break;
                case '4':
                    System.out.print("确认是否退出(Y/N)：");//待开发
                    char ifExit = Utility.readConfirmSelection();
                    if(ifExit=='Y'){
                        loopFlag = false;
                    }
                    break;
            }
        }while (loopFlag);
    }
}
