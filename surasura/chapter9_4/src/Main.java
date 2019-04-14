import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //『スラスラわかるJava』 第9章-4
        //動的束縛・ポリモーフィズム
        
        Car car1 = new Car();
        System.out.println(car1.getCarType());
        
        Car car2 = new Truck();
        System.out.println(car2.getCarType());
        
        Car car3 = new LongDriveTruck();
        System.out.println(car3.getCarType());
        
        
        /*
        実行結果
        
        自動車
        トラック
        長距離トラック
        */
 
    }
}
