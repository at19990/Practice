package com.practice.java31;

import java.util.Random;

public class Java31 {
    private static void title(int chap_num){
        System.out.println("===== 3-1-" + chap_num + " =====");
    }

    private static void java312(){
        /* 3-1-2 */
        title(2);
//        int型リテラル 10進数・8進数・16進数・2進数
        int[] numbers = {123, 012, 0xabc, 0b10};
        for(int num : numbers){
            System.out.println(num);
        }

//        long型リテラル
        long longNum = 100_000_000_000L;
        System.out.println(longNum);

//        float型リテラル
        float floatNum = 3.14159265f;
        System.out.println(floatNum);

//        double型リテラル
        double doubleNum = 1.41421356;
        System.out.println(doubleNum);

//        真偽リテラル
        boolean bool = true;
        System.out.println(bool);

//        文字リテラル
        char c = 'C';
        System.out.println(c);

//        ワイドニング
        double doubleNum2 = floatNum;
        System.out.println(doubleNum2);

//        ナローイング
        int intNum = (int)doubleNum;
        System.out.println(intNum);
    }

    private static void java313(){
        /* 3-1-3 */
//        参照型・nullチェック
        title(3);

        String name = "鉛筆";
        System.out.println(name.charAt(1));

        Random rand = new Random();
        int bin = rand.nextInt(2);
        String str;
        System.out.println(bin);
        if(bin == 0){
            str = null;
        }else{
            str = "鉛筆";
        }
        if(str != null){
            System.out.println("strは " + str.length() + "文字です");
        }else{
            System.out.println("str は null です");
        }
    }
    private static void java314(){
        /* 3-1-4 */
//        ラッパークラス
        title(3);

        System.out.println("Double: {ビット数: " + Double.SIZE
                +  ", バイト数: " + Double.BYTES
                + ", 最大値: " + Double.MAX_VALUE
                + ", 最小値: " + Double.MIN_VALUE
        + "}");

        Integer num_1 = new Integer(100);
        Integer num_2 = Integer.valueOf(100);

        int num_3 = num_2.intValue();

        Integer num_4 = Integer.valueOf("100", 2 );

        String num_5 = Integer.toString(100);

        String num_6 = num_1.toString();
    }

    private static void java315(){
        /* 3-1-5 */
//        オートボクシング・アンボクシング
        title(5);

        int num_1 = 100;
        Integer numInt_1 = 100;
        Integer sum = num_1 + numInt_1;
        System.out.println(sum);

        Integer numInt_2 = new Integer(100);
        Integer numInt_3 = new Integer(100);

        System.out.println(num_1 == numInt_1);
        System.out.println(numInt_1 == numInt_2);
        System.out.println(numInt_2 == numInt_3);

        System.out.println(numInt_1.equals(numInt_2));
        System.out.println(numInt_2.equals(numInt_3));

    }

    public static void main(String[] args) {
        java312();
        java313();
        java314();
        java315();
    }
}
