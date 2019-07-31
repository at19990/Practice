import java.util.*;

public class Main {
    public static void printArray(int[] a, String b){
        System.out.print("ソート" + b + ": ");
        for (int i = 0; i < a.length; i++){
            System.out.print("[" + a[i] + "]");
        }
        System.out.print("\n");
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // 『アルゴリズムはじめの一歩完全攻略』
        //4-2 挿入法
        
        int[] a = {90, 34, 78, 12, 56};
        int ins, cmp, temp;
        
        printArray(a, "前"); /* ソート前 */
        
        /*ソート*/
        for (ins = 1; ins < a.length; ins++){
            temp = a[ins];
            for (cmp = ins - 1; cmp >= 0; cmp--){
                if (a[cmp] > temp) {
                    a[cmp + 1] = a[cmp];
                }else{
                break;
                }
            }
            a[cmp + 1] = temp;
        }
        
        /* ソート後 */
        printArray(a, "後");
    
    /*実行結果
    ソート前: [90][34][78][12][56]
    ソート後: [12][34][56][78][90]
    */
    }
}
