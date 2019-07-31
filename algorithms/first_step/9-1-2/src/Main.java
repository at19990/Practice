
public class Main {
    /*
    『アルゴリズムはじめの一歩完全攻略』
    9-1-2 動的計画法
    */
    public static int[] fibonacciNumbers = new int[100];
    
    public static int fibonacci(int n){
        int i;
        
        for(i = 0; i <= n; i++){
            if(i ==0){
                fibonacciNumbers[i] = 0;
            }else if(i == 1){
                fibonacciNumbers[i] = 1;
            }else{
                fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
            }
        }
        return fibonacciNumbers[n];
    }
    
    public static void main (String[] args) {
        for(int n = 0; n <= 8; n++){
            System.out.print(fibonacci(n) + ", ");
        }
        System.out.print("\n");
    }
/* 実行結果

0, 1, 1, 2, 3, 5, 8, 13, 21, 
*/

}