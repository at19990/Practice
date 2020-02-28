package com.practice.java41;

    /* 4-1 */
//    配列で複数のデータを扱う
public class Java41 {
//    章番号を標準出力に表示
    private static void printChapNum(int chapNum){
        System.out.printf("====== 4-1-%d =====\n", chapNum);
    }

    /* 4-1-1 */
//        配列の基本を理解する
    private static  void java411(){
        printChapNum(1);

        int[] array = new int[10];
        array[0] = 0;
        array[1] = 1;
        System.out.println(array[1]);

    }
    /* 4-1-2 */
//        配列を初期化する
    private static void java412(){
        printChapNum(2);

        String[] array = new String[] {"あ", "い", "う", "え", "お"};
        System.out.println(array[4]);

    }
    /* 4-1-3 */
//        配列への代入と取り出し
    private static void java413(){
        printChapNum(3);

        String[] array = new String[] {"あ", "い", "う", "え", "お"};
        array[4] = "あ";
        System.out.println(array[4]);
    }
    /* 4-1-4 */
//        配列のサイズを変更する
    private static void java414(){
        printChapNum(4);

    }

    public static void main(String[] args) {
        java411();
        java412();
        java413();
        java414();
    }
}
