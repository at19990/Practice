import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 『スラスラわかるJava』
        // 第15章-1 スレッド
       
        long x = 2;
        
        Thread thread = new Thread(new MyRunnable());
        
        thread.start();
        
        for (int i = 0; i < 20; i++){
            try{
                Thread.sleep(80);
                if ((i + 1) == 1){
                    System.out.println(x);
                }else{
                    x *= 2;
                    System.out.println(x);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        
        }
        
        
    /*
    実行結果
 
    2
    2の1乗 (5% 実行完了)
    4
    2の2乗 (10% 実行完了)
    8
    2の3乗 (15% 実行完了)
    16
    2の4乗 (20% 実行完了)
    32
    2の5乗 (25% 実行完了)
    64
    2の6乗 (30% 実行完了)
    128
    2の7乗 (35% 実行完了)
    256
    2の8乗 (40% 実行完了)
    512
    2の9乗 (45% 実行完了)
    1024
    2の10乗 (50% 実行完了)
    2048
    2の11乗 (55% 実行完了)
    4096
    2の12乗 (60% 実行完了)
    8192
    2の13乗 (65% 実行完了)
    16384
    2の14乗 (70% 実行完了)
    32768
    2の15乗 (75% 実行完了)
    65536
    2の16乗 (80% 実行完了)
    131072
    2の17乗 (85% 実行完了)
    262144
    2の18乗 (90% 実行完了)
    524288
    2の19乗 (95% 実行完了)
    1048576
    2の20乗 (100% 実行完了)
    計算が終了しました
    */
    }  
}