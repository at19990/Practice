import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //『スラスラわかるJava』 第9章-1
        //クラス・インスタンス
        
        Car car1 = new Car();
        car1.speed = 50;
        System.out.println("最初のスピード:" + car1.speed);
        
        car1.speedUp(20);
        System.out.println("加速後のスピード:" + car1.speed);
        
        car1.speedDown(50);
        System.out.println("減速後のスピード:" + car1.speed);
        
        /*
        実行結果
        
        最初のスピード:50
        加速後のスピード:70
        減速後のスピード:20
        */
    }
}
