package exer.day05.java;

public class ReviewExer3 {
    public static void main(String[] args) {
        signin(123,456);
    }

    public static void signin(int user,int passwd){
        if(user==123&&passwd==456){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
    }
}
