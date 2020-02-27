package com.practice.java22;

class Product {
    String name;
    int price;
    static final double SALES_TAX_RATE = 1.10;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    Product(String name){
        this(name, 0);
    }

    void print_price(){
        System.out.println(name + " は " + (int)Math.floor(price * SALES_TAX_RATE) + "円（税込）です");
    }
}

public class Java22 {
    /* 2-2 */
//    クラス・メソッド・インスタンス・コンストラクタ

    public static void main(String[] args) {
        Product pencil = new Product("鉛筆");

        pencil.price = 60;
        pencil.print_price();

        Product eraser = new Product("消しゴム", 100);
        eraser.print_price();
    }
}
