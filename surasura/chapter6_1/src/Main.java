import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //『スラスラわかるJava』 第6章 -1
       
        // リスト
        ArrayList<String> fruits = new ArrayList<>();
        
        System.out.println(fruits);
        
        fruits.add("りんご");
        
        System.out.println(fruits);
        
        fruits.add("みかん");
       
        System.out.println(fruits);
       
        fruits.add(1, "ぶどう");
        
        System.out.println(fruits);
       
        fruits.remove("ぶどう");
        
        System.out.println(fruits);
        
        String fruit = fruits.get(1);
        
        System.out.println(fruit);
        
        fruits.set(1, "メロン");
        
        System.out.println(fruits);
        
        //セット
        HashSet<String> animals = new HashSet<>();
        
        System.out.println(animals);
        
        animals.add("ライオン");
        
        animals.add("サーバル");
        
        animals.add("ライオン"); //重複
        
        animals.add("チーター");
        
        System.out.println(animals);
        
        animals.remove("ライオン");
        
        System.out.println(animals);
        
        //マップ
        HashMap<String, String> members = new HashMap<>();
        
        System.out.println(members);
        
        members.put("natsu@s.jp", "Souseki NATSUME");
        
        members.put("tani@s.jp", "Junichiro TANIZAKI");
        
        System.out.println(members);
        
        String oldMember = members.put("tani@s.jp", "Shuntaro TANIKAWA");//上書き
        
        System.out.println(oldMember);
        
        System.out.println(members);
        
        members.remove("natsu@s.jp");
        
        System.out.println(members);
        
        System.out.println(members.get("tani@s.jp"));
      
        
        /*
        実行結果
     
        []
        [りんご]
        [りんご, みかん]
        [りんご, ぶどう, みかん]
        [りんご, みかん]
        みかん
        [りんご, メロン]
        []
        [サーバル, ライオン, チーター]
        [サーバル, チーター]
        {}
        {tani@s.jp=Junichiro TANIZAKI, natsu@s.jp=Souseki NATSUME}
        Junichiro TANIZAKI
        {tani@s.jp=Shuntaro TANIKAWA, natsu@s.jp=Souseki NATSUME}
        {tani@s.jp=Shuntaro TANIKAWA}
        Shuntaro TANIKAWA
        */
        
    }
}
