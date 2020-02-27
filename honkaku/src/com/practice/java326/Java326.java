package com.practice.java326;

abstract class Pigeon {
    String name;
    int bodyLength;
    String location;
    String voice;

    abstract void name();
    abstract void bodyLength();
    abstract void location();
    abstract void voice();
}

class JapaneseGreenPigeon extends Pigeon {
    void name(){
        name = "アオバト";
    }
    void bodyLength(){
        bodyLength = 33;
    }
    void location(){
        location = "日本・中国・台湾";
    }
    void voice(){
        voice = "オーアーオー";
    }
}
class RockPigeon extends Pigeon {
    void name(){
        name = "カワラバト";
    }
    void bodyLength(){
        bodyLength = 30;
    }
    void location(){
        location = "世界の広い範囲";
    }
    void voice(){
        voice = "ゴロッポ、ゴロッポ";
    }
}

public class Java326 {
    private static void printSpecies(Pigeon pigeon){
        System.out.println(pigeon.name + "は、体長"
                + pigeon.bodyLength + "cm程度で、"
                + pigeon.location + "に生息し、"
                + pigeon.voice + "と鳴く");
    }

    public static void main(String[] args) {
        JapaneseGreenPigeon aobato = new JapaneseGreenPigeon();
        aobato.name();
        aobato.bodyLength();
        aobato.location();
        aobato.voice();

        RockPigeon kawarabato = new RockPigeon();
        kawarabato.name();
        kawarabato.bodyLength();
        kawarabato.location();
        kawarabato.voice();

        printSpecies(aobato);
        printSpecies(kawarabato);
    }

}
