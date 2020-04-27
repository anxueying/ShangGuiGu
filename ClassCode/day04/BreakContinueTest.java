/*
都支持label，但不推荐，可读性较差

break  结束当前循环(跳出循环），结束label，支持结束代码块
continue  结束当次循环（跳出本次循环，进入下次循环），进入label循环,不支持代码块
*/

class BreakContinueTest{
	public static void main(){
		label:for(int i=0;i<=10;i++){
			for(int j=0;j<=10;j++){
				if(j==3){
					System.out.println("---"+i);
					break label;//默认结束内层循环j，到i循环继续;加label，则结束指定循环层
				}
				System.out.println(i);
			}
		}
		
		label:{//加代码块
			for(int i=0;i<=10;i++){
				for(int j=0;j<=10;j++){
					if(j==3){
						System.out.println("---"+i);
						break label;//默认结束内层循环j，到i循环继续;加label，则结束指定循环层
					}
					System.out.println(i);
				}
			}
			System.out.println("hello");
		}
		
		//无限循环
		for(;;){
			
		}
		
		while(true){
			
		}
	}
}