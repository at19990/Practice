import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //『スラスラわかるJava』 第9章-2
        //カプセル化
        
        Car car2 = new Car();
        
        car2.speedUp(40);
        System.out.println("v1 = " + car2.getSpeed() + " (km/h)");
        
        car2.speedDown(10);
        System.out.println("v2 = " + car2.getSpeed() + " (km/h)");
        
        
        
        /*
        実行結果
        
        v1 = 40 (km/h)
        v2 = 30 (km/h)
        */
 
    }
}
