import java.util.*;

public class Main {
    public static StationList[] list = new StationList[12]; //配列
    
    public static int top; //先頭ポインタ
    
    public static void initStationList(){
        for (int i = 0; i < list.length; i++){
            list[i] = new StationList();
        }
        
        list[0].name = "東京";
        list[0].next = -1;
        list[1].name = "御茶ノ水";
        list[1].next = 3;
        list[2].name = "新宿";
        list[2].next = 4;
        list[3].name = "神田";
        list[3].next = 0;
        list[4].name = "四谷";
        list[4].next = 1;
        
        top = 2; //先頭
    }
    /* 連結リストを出力 */
    public static void printStationList(){
        int idx = top;
        while(idx != -1){
            System.out.print("[" + list[idx].name + "] →");
            idx = list[idx].next;
        }
        System.out.print("\n");
    }
    /*リストに要素を追加 */
    public static void insertStationList(int insIdx, String insName, int prevIdx){
        list[insIdx].name = insName;
        list[insIdx].next = list[prevIdx].next;
        list[prevIdx].next = insIdx;
    }
    /* リストに要素を追加 */
    public static void deleteStationList(int delIdx, int prevIdx){
        list[prevIdx].next = list[delIdx].next;
    }
   
    public static void main(String[] args) throws Exception {
        /*
        『アルゴリズムはじめの一歩完全攻略』
        5-2 連結リスト
        */
        
        initStationList();
        printStationList();
        
        insertStationList(5, "代々木", 2);
        insertStationList(6, "千駄ヶ谷", 5);
        insertStationList(7, "信濃町", 6);
        insertStationList(8, "市ヶ谷", 4);
        insertStationList(9, "飯田橋", 8);
        insertStationList(10, "水道橋", 9);
        printStationList();
        
        deleteStationList(5, 2);
        deleteStationList(6, 2);
        deleteStationList(7, 2);
        deleteStationList(8, 4);
        deleteStationList(9, 4);
        deleteStationList(10, 4);
        deleteStationList(4, 2);
        deleteStationList(1, 2);
        deleteStationList(3, 2);
        printStationList();
    }
}
