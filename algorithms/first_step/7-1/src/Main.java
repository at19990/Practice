import java.util.*;

public class Main {
    /*
    『アルゴリズムはじめの一歩完全攻略』
    7-1 ハッシュ表探索法の仕組み
    */
    
    public static int[] hashTable = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    
    public static int hashFunc(int data){
        return data % 10;
    }
    
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int data;
        int hashValue;
        
        try{
            do{
                System.out.println("格納する正の整数のデータを入力してください(負の値を入力すると格納終了)");
                data = Integer.parseInt(sc.next());
                
                if (data < 0){
                    System.out.println("格納を終了しました");
                    break;
                }else{
                    System.out.println(data + "が入力されました");
                }
                
                hashValue = hashFunc(data);
                hashTable[hashValue] = data;
            }while(true);
            
            do{
                System.out.println("サーチしたい正の整数のデータを入力してください(負の値を入力するとサーチ終了)");
                data = Integer.parseInt(sc.next());
                
                if(data < 0){
                    System.out.println("サーチを終了しました");
                    break;
                }
                
                hashValue = hashFunc(data);
                
                if(hashTable[hashValue] == data){
                    System.out.println(data + "は" + hashValue + "番目に見つかりました");
                }else{
                    System.out.println(data + "は見つかりません");
                }
            }while(true);
            
        }catch (NumberFormatException e){
            System.out.println("不正な入力です。整数を入力してください");
        }
        
    }
/* 実行例
入力
37
51
79
-1
37
51
79
99
-1

出力
格納する正の整数のデータを入力してください(負の値を入力すると格納終了)
37が入力されました
格納する正の整数のデータを入力してください(負の値を入力すると格納終了)
51が入力されました
格納する正の整数のデータを入力してください(負の値を入力すると格納終了)
79が入力されました
格納する正の整数のデータを入力してください(負の値を入力すると格納終了)
格納を終了しました
サーチしたい正の整数のデータを入力してください(負の値を入力するとサーチ終了)
37は7番目に見つかりました
サーチしたい正の整数のデータを入力してください(負の値を入力するとサーチ終了)
51は1番目に見つかりました
サーチしたい正の整数のデータを入力してください(負の値を入力するとサーチ終了)
79は9番目に見つかりました
サーチしたい正の整数のデータを入力してください(負の値を入力するとサーチ終了)
99は見つかりません
サーチしたい正の整数のデータを入力してください(負の値を入力するとサーチ終了)
サーチを終了しました

*/
}
