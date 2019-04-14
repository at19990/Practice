public class MyRunnable implements Runnable{
    public void run() {
        for (int i = 0; i < 20; i++){
            try{
                Thread.sleep(80);
                System.out.println(2 + "の" + (i + 1) + "乗 (" + ((i + 1) * 5) + "% 実行完了)");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("計算が終了しました");
        
    }
}