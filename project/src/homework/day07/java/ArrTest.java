package homework.day07.java;

public class ArrTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int arrMax = 0;
        int arrMin = 1000;
        int arrAvg = 0;
        int arrSum = 0;
        System.out.print("数组：");
        for(int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*100);
            if (arr[i]>arrMax){
                arrMax = arr[i];
            }else{
                if (arr[i]<arrMin){
                    arrMin = arr[i];
                }
            }
            arrSum += arr[i];
            System.out.print(arr[i]+"\t");
        }
        System.out.print("\n最大值："+arrMax);
        System.out.print("\n最小值："+arrMin);
        System.out.print("\n和值："+arrSum);
        System.out.print("\n平均值："+arrSum/arr.length);



    }
}
