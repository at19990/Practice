import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // 『アルゴリズムはじめの一歩完全攻略』
        //1-3 ユークリッドの互除法
        
       try{
            System.out.println("整数aを入力してください:");
            int a = sc.nextInt();
           
            System.out.println("整数bを入力してください:");
            int b = sc.nextInt();
            
            while(a != b){
            if (a > b){
                a -= b;
            }else{
                b -= a;
            }
        }
        
        System.out.println(a);
        
        } catch (InputMismatchException e){
            System.out.println("不正な入力です。整数を入力してください");
        }
        
        
    }
}
