package com.practice.java325;

/**
 * 商品の名前と価格を扱うクラス
 */
class Product {
    /** 商品名 */
    String product_name;

    /** 価格 */
    int price;

    /**
     * 商品名と価格の初期値を設定するコンストラクタです
     */
    Product(){
        this.product_name = "サンプル";
        price = 0;
    }

    /**
     * 商品名を取得します
     * @return 商品名(文字列)
     */
    public String getName(){
        return product_name;
    }

    /**
     * 商品名を設定します
     * @param product_name 商品名(文字列)
     */
    public void setName(String product_name){
        this.product_name = product_name;
    }

    /**
     * 商品の価格を取得します
     * @return 税抜価格(整数)
     */
    public int getPrice(){
        return  price;
    }

    /**
     * 商品の価格を設定します
     * @param price 税抜価格(整数)
     */
    public void setPrice(int price){
        this.price = price;
    }
}

/**
 *  商品の名前・価格に加えてIDを扱うクラス
 */
class ProductInfo extends Product{
    /** 商品ID */
    int productId;

    /**
     * 商品のIDを設定するコンストラクタです
     */
    ProductInfo(){
        productId = 0;
    }

    /**
     * 商品のIDを取得します
     * @return 商品ID(整数)
     */
    public int getId(){
        return productId;
    }

    /**
     * 商品のIDを設定します
     * @param productId 商品ID(整数)
     */
    public void setId(int productId){
        this.productId = productId;
    }
}

/**
 * 3-2-5演習用のクラス
 */
public class Java325 {
    /**
     * 演習のチャプター番号を標準出力に表示します
     * @param chap_num チャプター番号
     */
    private static void printTitle(int chap_num){
        System.out.println("===== 3-2-" + chap_num + " =====");
    }

    /**
     * 商品データを標準出力に表示します
     * @param product 商品のインスタンス
     */
    private static void printProductData(ProductInfo product){
        System.out.println("商品ID: " + product.getId()
                + " ;  商品名: " + product.getName()
                +  " ;  価格: " + product.getPrice() + " 円（税抜）");
    }

    /**
     * mainメソッド
     */
    public static void main(String[] args) {
        printTitle(5);

        ProductInfo pencil = new ProductInfo();
        printProductData(pencil);

        pencil.setId(1);
        pencil.setName("鉛筆");
        pencil.setPrice(60);

        printProductData(pencil);
    }
}
