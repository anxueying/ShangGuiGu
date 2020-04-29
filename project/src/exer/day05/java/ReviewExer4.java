package exer.day05.java;

public class ReviewExer4 {
    public static void main(String[] args) {
        if(ifleap(2000)){
            System.out.println("闰年");
        }else{
            System.out.println("非闰年");
        }
    }

    public static boolean ifleap(int year){
        if((year%4==0&&year%100!=0)||(year%400==0)){
            return true;
        }else{
            return false;
        }
    }
}
