package com.practice.java342;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GenericStack<E>{
    private List<E> numList;

    public GenericStack(){
        numList = new ArrayList<>();
    }

//    要素を積む
    public boolean push(E task){
        return numList.add(task);
    }

    public E pop(){
//        nullでなければ一番上の要素を取り出す
        if(numList.isEmpty()){
            return null;
        }
        return numList.remove(numList.size() - 1);
    }
}

public class Java342 {
    /* 3-4-2 */
//    ジェネリクス

//    逆ポーランド記法の計算式を、スタックを使って計算する
    public static void main(String[] args) {

        System.out.println("空白区切りで、逆ポーランド記法の数式を入力してください");

        GenericStack<String> rpn = new GenericStack<>();

        Scanner sc = new Scanner(System.in);

//        標準入力から行ごと読みこむ
        String inputLine = sc.nextLine();

//        空白で分割
        final String[] inputChars = inputLine.split(" ");

        double a, b;
        label:
        for(String inputChar : inputChars){
//            数字であればそのまま積む
            if (inputChar.matches("^[0-9]*$")) {
                rpn.push(inputChar);
            }else{
//                演算子ごとに場合分けして、前2つの数字を取り出して計算
                switch (inputChar) {
                    case "+":
                        a = Double.parseDouble(rpn.pop());
                        b = Double.parseDouble(rpn.pop());
                        rpn.push(Double.toString(b + a));
                        break;
                    case "-":
                        a = Double.parseDouble(rpn.pop());
                        b = Double.parseDouble(rpn.pop());
                        rpn.push(Double.toString(b - a));
                        break;
                    case "*":
                        a = Double.parseDouble(rpn.pop());
                        b = Double.parseDouble(rpn.pop());
                        rpn.push(Double.toString(b * a));
                        break;
                    case "/":
                        a = Double.parseDouble(rpn.pop());
                        b = Double.parseDouble(rpn.pop());
//                        zero divide となる場合にはねて実行を終了
                        if (a == 0) {
                            System.out.println("エラー: 0で割ることはできません");
                            System.exit(0);
                        }
                        rpn.push(Double.toString(b / a));
                        break;
//                   数字と演算子以外が入ってきた場合にはねて実行を終了
                    default:
                        System.out.println("エラー: 入力が不正です");
                        System.exit(0);
                }
            }

        }

//        計算結果を取り出す
        String rpnResult = rpn.pop();

//        null でなければ標準出力に表示する
        if( rpnResult != null ){
            System.out.println("計算結果: " + Double.parseDouble(rpnResult));
        }
    }

}
