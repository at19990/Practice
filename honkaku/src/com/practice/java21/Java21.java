package com.practice.java21;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Random;
import java.util.Scanner;

public class Java21 {
    public static void main(String... args){
        /* 2-1-1 */
//        文とブロック
        System.out.println("Hello world");

        /* 2-1-3 */
//        変数・型・リテラル
        int num_1 = 100;
        System.out.println(num_1);

        /* 2-1-4 */
//        算術演算子
        int num_2 = 200;
        int num_3 = num_1 + num_2;
        System.out.println(num_3);

        System.out.println(++num_1);
        System.out.println(num_1);
        System.out.println(num_2++);
        System.out.println(num_2);

//        関係演算子
        boolean compare = num_1 == num_2;
        System.out.println(compare);

//        三項演算子
        int num_4 = num_1 > 100 ? 1 : -1;
        System.out.println(num_4);

//        論理演算子
        boolean cond_a = true;
        boolean cond_b = false;
        boolean log_and =cond_a && cond_b;
        System.out.println(log_and);

//        ビット演算子
        int num_5 = 0xabcd;
        int num_6 = num_5 >>> 2;
        System.out.println(Integer.toHexString(num_6));

//        代入演算子
        int num_7 = num_1 %= 7;
        System.out.println(num_7);

//        文字結合
        String message = "Hello";
        message += "Java";
        System.out.println(message);

        /* 2-1-5 */

//        if文
        Random random = new Random();
        int rand_value = random.nextInt(100);
        String judge = "";
        if(rand_value % 15 == 0){
            judge = "FizzBuzz";
        }else if(rand_value % 5 == 0){
            judge = "Buzz";
        }else if(rand_value % 3 == 0){
            judge = "Fizz";
        }else{

        }
        System.out.print(rand_value);
        if(judge != ""){
            System.out.print(" → " + judge);
        }
        System.out.print("\n");

//        switch文
        Month month = LocalDateTime.now().getMonth();
        switch (month){
            case JANUARY:
            case FEBRUARY:
            case MARCH:
                System.out.println("春はあけぼの。やうやう白くなりゆく山際、少し明かりて、紫だちたる雲の細くたなびきたる。");
                break;
            case APRIL:
            case MAY:
            case JUNE:
                System.out.println("夏は夜。月のころはさらなり、闇もなほ、ほたるの多く飛びちがひたる。また、ただ一つ二つなど、ほのかにうち光りて行くもをかし。雨など降るもをかし。");
                break;
            case JULY:
            case AUGUST:
            case SEPTEMBER:
                System.out.println("秋は夕暮れ。夕日の差して山の端いと近うなりたるに、からすの寝所へ行くとて、三つ四つ、二つ三つなど飛び急ぐさへあはれなり。");
                break;
            default:
                System.out.println("冬はつとめて。雪の降りたるは、言ふべきにもあらず、霜のいと白きも、また、さらでもいと寒きに、火など急ぎおこして、炭もて渡るも、いとつきづきし。");
                break;
        }

//        for文
        int f_0 = 0;
        int f_1 = 1;
        int f_2;
        for (int i = 1; i <= 10; i++){
            switch (i){
                case 1:
                    System.out.println(f_0);
                    break;
                case 2:
                    System.out.println(f_1);
                    break;
                default:
                     f_2 = f_1 + f_0;
                     System.out.println(f_2);
                     f_0 = f_1;
                     f_1 = f_2;
                     break;
            }

        }

//        for-each文
        int[] numbers = {1, 1, 2, 3, 5, 8, 13, 21};
        for (int number : numbers){
            System.out.println(number * 3);
        }

//        while-do文
        Scanner sc = new Scanner(System.in);
        String input_text;
        do{
            System.out.println("パスワードを入力してください");
            input_text = sc.next();
        }while (!input_text.equals("abc"));



    }
}
