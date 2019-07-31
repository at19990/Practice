import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // 『アルゴリズムはじめの一歩完全攻略』
        //3-1 二分探索
        
       int[] a = {39, 41, 53, 55, 68, 72, 84, 88, 92, 97};
       
       int x, pos, right, left, middle;
       
       System.out.println("探したい数値を整数で入力してください");
       try{
            x = sc.nextInt();
            pos = -1;
            left = 0;
            right = a.length - 1;
            
            while (pos == -1 && left <= right){
                middle = (left + right) / 2;
                if (a[middle] == x){
                    pos = middle;
                }else if (a[middle] > x) {
                    right = middle - 1;
                }else{
                    left = middle + 1;
                }
            }
            
            if(pos != -1){
                System.out.println(x + " は " + pos + " 番目にあります");
            }else{
                System.out.println(x + " は" + "見つかりませんでした");
            }
            
       
       }catch (InputMismatchException e){
           System.out.println("不正な入力です。整数を入力してください");
       }
       
    }
}
