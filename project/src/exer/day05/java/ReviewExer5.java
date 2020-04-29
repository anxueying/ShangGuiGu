package exer.day05.java;

public class ReviewExer5 {
    public static void main(String[] args) {
        printpic();
    }

    public static void  printpic(){
        for(int i=1;i<=3;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
