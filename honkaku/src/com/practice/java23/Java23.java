package com.practice.java23;

/**
 *  商品の価格を扱うクラス
 */
class Product {
    /** 商品名 */
    String name;

    /** 価格 */
    int price;

    /** 消費税率 */
    static final double SALES_TAX_RATE = 1.10;

    /**
     *  商品名と価格を指定してインスタンスを生成
     * @param name 商品名
     * @param price 価格(税抜)
     */
    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    /**
     *  商品名を指定してインスタンスを生成
     * @param name 商品名
     */
    Product(String name){
        this(name, 0);
    }

    /**
     *  点数を標準出力に表示
     */
    void print_price(){
        System.out.println(name + " は " + (int)Math.floor(price * SALES_TAX_RATE) + "円（税込）です");
    }

    @Deprecated
    void printPrice(){
        System.out.println(name + " は " + (int)Math.floor(price * SALES_TAX_RATE) + "円です");
    }
}

/**
 *  2-3 Javadoc, アノテーション演習用のクラス
 * @author at19990
 * @version 1.0
 * @since 1.0
 */
public class Java23 {
    /**
     *  mainメソッド
     */
    public static void main(String[] args) {
        Product pencil = new Product("鉛筆");

        pencil.price = 60;
        pencil.print_price();

        Product eraser = new Product("消しゴム", 100);
        eraser.print_price();
    }
}
