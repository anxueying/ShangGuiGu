package homework.day07.java;

public class ArrAddTest {
    public static void main(String[] args) {
        int[][] arr= new int[][]{{3,8,2},{2,7},{9,0,1,6}};
        int sum = 0;
        for(int[] i:arr){
            for(int j:i){
                sum += j;
            }
        }
        System.out.println("arr元素和为："+sum);
    }
}

