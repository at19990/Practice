import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 『スラスラわかるJava』
        // 第14章-1 例外
       
        Scanner sc = new Scanner(System.in);
        
       try{
           System.out.println("割る数を入力してください :");
           double num1 = sc.nextDouble();
           
           System.out.println("割られる数を入力してください:");
           double num2 = sc.nextDouble();
           
           double result = divide(num1,num2);
          
           System.out.println(num1 + " ÷ " + num2 + " = " + result);
       } catch (InputMismatchException e){
           System.out.println("不正な入力です。数値を入力してください。");
       } catch (ArithmeticException e){
           System.out.println("0で割ることはできません。");
       }
       
        
    }
    static double divide(double num1, double num2){
        if (num2 == 0.0){
            throw new ArithmeticException();
        }else{
            //0割りでないときには何もしない
        }
        return num1 / num2;
    }
}