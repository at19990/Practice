import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        //『スラスラわかるJava』 第6章-2
        //配列
        String[] colors = new String[4];
        
        Scanner sc = new Scanner(System.in);
        
        int i = 0;
        
        while(i < 4){
            colors[i] = sc.next();  //入力 赤 青 緑 黄
            
            System.out.println("colors[" + i + "]:" + colors[i]);
            
            i++;
        }
        
        
        /*
        実行結果
        
        colors[0]:赤
        colors[1]:青
        colors[2]:緑
        colors[3]:黄
        
        */
        
        
        //『スラスラわかるJava』 第7章
        //拡張for
        for (String color : colors){
            System.out.println(color + "色");
        }
        
        /*
        実行結果
        
        赤色
        青色
        緑色
        黄色
        */
        
        
    }
}
