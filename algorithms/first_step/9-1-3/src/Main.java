import java.util.*;

public class Main {
    /*
    『アルゴリズムはじめの一歩完全攻略』
    9-1-3 動的計画法と再帰
    */
    public static long[] fibonacciNumbers = new long[101];

    public static void initFibonacciNumbers() {
        for(int i = 0; i < fibonacciNumbers.length; i++){
            fibonacciNumbers[i] = -1;
        }
    }

    public static long fibonacci(int n){
        System.out.println("fibonacci(" + n + ")が呼ばれました");

        if(fibonacciNumbers[n] == -1){
            if(n == 0){
                fibonacciNumbers[n] = 0;
            }else if(n == 1){
                fibonacciNumbers[n] = 1;
            }else{
                fibonacciNumbers[n] = fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
        return fibonacciNumbers[n];
    }

    public static void main (String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);

        initFibonacciNumbers();

        try{
            System.out.println("求めるフィボナッチ数列の項数nを入力してください(0 <= n <= 100)");
            n = Integer.parseInt(sc.next());
            System.out.println(n + "番目のフィボナッチ数 = " + fibonacci(n));
        }catch(NumberFormatException e1){
            System.out.println("不正な入力です。100までの整数を入力してください");
        }catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("扱える数を超えています。100までの数を入力してください");
        }

    }
/* 実行例
入力
10

出力
求めるフィボナッチ数列の項数nを入力してください(0 <= n <= 100)
fibonacci(10)が呼ばれました
fibonacci(9)が呼ばれました
fibonacci(8)が呼ばれました
fibonacci(7)が呼ばれました
fibonacci(6)が呼ばれました
fibonacci(5)が呼ばれました
fibonacci(4)が呼ばれました
fibonacci(3)が呼ばれました
fibonacci(2)が呼ばれました
fibonacci(1)が呼ばれました
fibonacci(0)が呼ばれました
fibonacci(1)が呼ばれました
fibonacci(2)が呼ばれました
fibonacci(3)が呼ばれました
fibonacci(4)が呼ばれました
fibonacci(5)が呼ばれました
fibonacci(6)が呼ばれました
fibonacci(7)が呼ばれました
fibonacci(8)が呼ばれました
10番目のフィボナッチ数 = 55
*/

}