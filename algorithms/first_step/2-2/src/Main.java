import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // 『アルゴリズムはじめの一歩完全攻略』
        //2-2 線形探索
        
       int[] a = {72, 68, 92, 88, 41, 53, 97, 84, 39, 55};
       
       int i, x, pos;
       
       System.out.println("探したい数値を整数で入力してください");
       try{
            x = sc.nextInt();
            pos = -1;
       
            for (i = 0; i < a.length && pos == -1; i++){
                if (a[i] == x){
                    pos = i;
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
