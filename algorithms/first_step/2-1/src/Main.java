import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // 『アルゴリズムはじめの一歩完全攻略』
        //2-1 配列の合計
        
       int[] a = {72, 68, 92, 88, 41, 53, 97, 84, 39, 55};
       
       int sum = 0;
       int i;
       
       System.out.println("ループ前:" + sum);
       
       for (i = 0; i < a.length; i++){
           sum += a[i];
           System.out.println("ループ中: sum = " + sum + ", i = " + i);
       }
       
       System.out.println("ループ後: sum = " + sum + ", i = " + i);
       
       
    /* 実行結果
    ループ前:0
    ループ中: sum = 72, i = 0
    ループ中: sum = 140, i = 1
    ループ中: sum = 232, i = 2
    ループ中: sum = 320, i = 3
    ループ中: sum = 361, i = 4
    ループ中: sum = 414, i = 5
    ループ中: sum = 511, i = 6
    ループ中: sum = 595, i = 7
    ループ中: sum = 634, i = 8
    ループ中: sum = 689, i = 9
    ループ後: sum = 689, i = 10
    */
    }
}
