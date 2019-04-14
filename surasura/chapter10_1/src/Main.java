import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //『スラスラわかるJava』 第10章-1
        //コンストラクター・final
        
        Truck truck1 = new Truck();
        
        truck1.speedUp(40);
        truck1.speedDown(10);
        System.out.println("速度 : " + truck1.getSpeed() + " (Km/h)");
        
        truck1.addPayload(100);
        truck1.deletePayload(50);
        System.out.println("積載量 : " + truck1.getPayload() + " (Kg)");
        
        
        
        
        
        /*
        実行結果
        
        速度 : 30 (Km/h)
        積載量 : 50 (Kg)
        */
 
    }
}
