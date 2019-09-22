import java.math.*;

public class Main {
    /*
    『アルゴリズムはじめの一歩完全攻略』
    8-1 再帰呼び出し
    ネイピア数を1000桁求める
     */
    public static BigDecimal function(int i){

        BigDecimal n = BigDecimal.valueOf(i);

        if (i == 0){
            //0! = 1
            return BigDecimal.ONE;
        }else{
            /*
            再帰:エクセルの計算と同様に、1つ前の項に(1/n)をかける
            小数点以下1010桁まで求めて丸める
             */
            return function(i - 1).divide(n, 1010, RoundingMode.HALF_UP);
        }

    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        BigDecimal napier = BigDecimal.ZERO;

        for(int i = 0; i <= 450; i ++){
            /*
            i < 450 では精度が不十分だった ( http://www.tamagaki.com/math/e10000.html で確認)
            i >= 450 では10000まで増加させても、小数点以下1000桁はほぼ変化しなかった
             */
            napier = napier.add(function(i));
        }
        //小数点以下1001~1010桁を切り捨て
        BigDecimal output = napier.setScale(1000, RoundingMode.DOWN);

        System.out.println(output.toPlainString());

    }
/* 実行結果
2.718281828459045235360287471352662497757247093699959574966967627724076630353547
59457138217852516642742746639193200305992181741359662904357290033429526059563073
81323286279434907632338298807531952510190115738341879307021540891499348841675092
44761460668082264800168477411853742345442437107539077744992069551702761838606261
33138458300075204493382656029760673711320070932870912744374704723069697720931014
16928368190255151086574637721112523897844250569536967707854499699679468644549059
87931636889230098793127736178215424999229576351482208269895193668033182528869398
49646510582093923982948879332036250944311730123819706841614039701983767932068328
23764648042953118023287825098194558153017567173613320698112509961818815930416903
51598888519345807273866738589422879228499892086805825749279610484198444363463244
96848756023362482704197862320900216099023530436994184914631409343173814364054625
31520961836908887070167683964243781405927145635490613031072085103837505101157477
041718986106873969655212671546889570350354

実行時間:197ms
*/


}