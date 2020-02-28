package com.practice.java341;

enum Color {
    Black(0x000000), White(0xffffff), Red(0xff0000), Blue(0x0000ff), Green(0x008000), Yellow(0xffff00);

    private final int colorCode;

    Color(int colorCode){
        this.colorCode = colorCode;
    }

    public int getColorCode() {
        return colorCode;
    }
}

public class Java341 {
    /* 3-4-1 */
//    列挙型

    public static void main(String[] args) {
        Color sample = Color.Red;

        System.out.printf("%s のカラーコードは、#%06x です" ,sample, sample.getColorCode());
    }
}
