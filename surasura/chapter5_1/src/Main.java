import java.util.*;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws Exception {
      
        // 『スラスラわかるJava』
        // 第5章-1 日付
    
       Calendar calendar = Calendar.getInstance();
       Date today = calendar.getTime();
       System.out.println(today);  //実行結果例  Sun Apr 14 05:36:48 UTC 2019
       
       SimpleDateFormat fmt1 = new SimpleDateFormat("yyyy/MM/dd HH;mm:ss");
       String formatDate1 = fmt1.format(calendar.getTime());
       System.out.println(formatDate1);  //実行結果例  2019/04/14 05;36:48
       
       SimpleDateFormat fmt2 = new SimpleDateFormat("yyyy年MM月dd日 (E)", new Locale("en", "US"));
       String formatDate2 = fmt2.format(calendar.getTime());
       System.out.println(formatDate2);  //実行結果例  2019年04月14日 (Sun)
       
       SimpleDateFormat fmt3 = new SimpleDateFormat("yyyy年MM月dd日 (E)", new Locale("ja", "JP"));
       String formatDate3 = fmt3.format(calendar.getTime());
       System.out.println(formatDate3);  //実行結果例  2019年04月14日 (日)
       
       calendar.setTimeZone(TimeZone.getTimeZone("America/Los_angels"));
       System.out.println(calendar.getTime());  //実行結果例  Sun Apr 14 05:36:48 UTC 2019 
       
       calendar.clear();
       calendar.set(1234, 4, 6);
       System.out.println(calendar.getTime());  //実行結果例  Sat May 06 00:00:00 UTC 1234
       
       calendar.set(Calendar.HOUR_OF_DAY, 12);
       System.out.println(calendar.getTime());  //実行結果例  Sat May 06 12:00:00 UTC 1234
       
       calendar.add(Calendar.DAY_OF_MONTH, 3);
       System.out.println(calendar.getTime());  //実行結果例  Tue May 09 12:00:00 UTC 1234
   
    }  
}