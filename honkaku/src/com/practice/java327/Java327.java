package com.practice.java327;

import java.util.Scanner;

interface Hello{
    String say();
}

class DefaultHello implements Hello{

    private String message;

    DefaultHello(int lang_id, String name){
        if (lang_id == 0){
            message = "こんにちは、 " + name + " !";
        }else{
            message = "Hello, " + name + " !";
        }
    }

    public String say() {
        return message;
    }
}

public class Java327 {
    /* 3-2-7 */
//    インターフェース
//    ユーザーの言語を判定してあいさつを返す
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("言語を選択してください/Select the language (JA/EN)");
        String lang;
        int lang_id;
        while(true){
            lang = sc.next();
            if(lang.equals("JA")){
                lang_id = 0;
                break;
            }else if (lang.equals("EN")){
                lang_id = 1;
                break;
            }else{
                System.out.println("JAかENのどちらかを入力してください/Please input JA or EN.");
            }
        }

        if (lang_id == 0){
            System.out.println("名前を入力してください");
        }else{
            System.out.println("Please insert your name here.");
        }

        String name = sc.next();

        DefaultHello user = new DefaultHello(lang_id, name);

        System.out.println(user.say());

    }
}
