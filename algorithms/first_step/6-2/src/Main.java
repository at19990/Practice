import java.util.*;

public class Main {
    /*
    『アルゴリズムはじめの一歩完全攻略』
    6-2 二分探索木の探索
    */
    
    public static BST[] tree = new BST[101];
        
    public static int rootIdx = 0;
        
    public static int newIdx = 0;
        
    public static void addBST(int data){
        int currentIdx;
        boolean addFlag;
        
        /* 
        　各末端を-1として扱う
        　根を中心に指定した要素よりも小さいものをツリーの左側、
        　大きいものをツリーの右側に配置する
        */
        tree[newIdx].data = data;
        tree[newIdx].left = -1;  
        tree[newIdx].right = -1;
        
        if (newIdx != 0){
            currentIdx = rootIdx;
            addFlag = false;
        
            do{
                if (data < tree[currentIdx].data){
                    if (tree[currentIdx].left == -1){
                        tree[currentIdx].left = newIdx;
                        addFlag = true;
                    }else{
                        currentIdx = tree[currentIdx].left;
                    }
                }else{
                    if (tree[currentIdx].right == -1) {
                        tree[currentIdx].right = newIdx;
                        addFlag = true;
                    }else{  
                        currentIdx = tree[currentIdx].right;
                    }
                }
            }while (addFlag == false);
        }
        newIdx++;
    }
    public static void printPhysicalBST() {
        System.out.println("-----------------------------------------");
        for (int i = 0; i < newIdx; i++){
            System.out.println("tree[" + i + "]: data = " + tree[i].data + ", left = " + tree[i].left + ", right = " + tree[i].right);
        }
    }
    
    public static int searchBST (int x){
        int idx = -1;
        int currentIdx = rootIdx;
        
        while (currentIdx != -1) {
            if (tree[currentIdx].data == x){
                idx = currentIdx;
                break;
            }else if (tree[currentIdx].data > x) {
                currentIdx = tree[currentIdx].left;
            }else{
                currentIdx = tree[currentIdx].right;
            }
        }
        return idx;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= 100; i++){
            list.add(i);
        }
        Collections.shuffle(list);
        
        for (int i = 0; i < tree.length; i++){
            tree[i] = new BST();
        }
        //ランダムに配置した1 ~ 100までのリストの数字をツリーの要素として追加
        for (int i = 0; i < 100; i++){
            addBST(list.get(i));
        }
        
        try{
            System.out.println("探索したい数字を入力してください");
            input = Integer.parseInt(sc.next());
            
            System.out.println("「" + input + "」の探索結果: " + searchBST(input));
            
            printPhysicalBST();
            
        }catch (NumberFormatException e){
            System.out.println("不正な入力です。整数を入力してください");
        }
        
    }
    
/*実行例
    
入力
50
    
出力
要素の数を入力してください(最大100)
整数の要素を空白区切りまたは改行区切りで入力してください
物理的な順序
探索したい数字を入力してください
「50」の探索結果: 10
-----------------------------------------
tree[0]: data = 82, left = 1, right = 6
tree[1]: data = 29, left = 2, right = 3
tree[2]: data = 1, left = -1, right = 8
tree[3]: data = 71, left = 4, right = 5
tree[4]: data = 34, left = 32, right = 7
tree[5]: data = 77, left = 22, right = 42
tree[6]: data = 83, left = -1, right = 14
tree[7]: data = 44, left = 16, right = 10
tree[8]: data = 15, left = 12, right = 9
tree[9]: data = 22, left = 29, right = 26
tree[10]: data = 50, left = 38, right = 11
tree[11]: data = 55, left = 35, right = 24
tree[12]: data = 11, left = 13, right = 69
tree[13]: data = 3, left = 83, right = 15
tree[14]: data = 92, left = 23, right = 18
tree[15]: data = 5, left = 45, right = 27
tree[16]: data = 42, left = 17, right = 30
tree[17]: data = 37, left = 37, right = 19
tree[18]: data = 94, left = 21, right = 20
tree[19]: data = 41, left = 34, right = -1
tree[20]: data = 95, left = -1, right = 49
tree[21]: data = 93, left = -1, right = -1
tree[22]: data = 73, left = 28, right = 36
tree[23]: data = 84, left = -1, right = 25
tree[24]: data = 61, left = 31, right = 47
tree[25]: data = 91, left = 61, right = -1
tree[26]: data = 24, left = 52, right = 39
tree[27]: data = 7, left = 65, right = 40
tree[28]: data = 72, left = -1, right = -1
tree[29]: data = 20, left = 53, right = 67
tree[30]: data = 43, left = -1, right = -1
tree[31]: data = 60, left = 33, right = -1
tree[32]: data = 32, left = 59, right = 46
tree[33]: data = 56, left = -1, right = 44
tree[34]: data = 38, left = -1, right = 81
tree[35]: data = 53, left = 48, right = 66
tree[36]: data = 74, left = -1, right = 50
tree[37]: data = 36, left = 70, right = -1
tree[38]: data = 49, left = 41, right = -1
tree[39]: data = 28, left = 55, right = -1
tree[40]: data = 10, left = 54, right = -1
tree[41]: data = 47, left = 57, right = 43
tree[42]: data = 79, left = 58, right = 78
tree[43]: data = 48, left = -1, right = -1
tree[44]: data = 59, left = 80, right = -1
tree[45]: data = 4, left = -1, right = -1
tree[46]: data = 33, left = -1, right = -1
tree[47]: data = 67, left = 68, right = 87
tree[48]: data = 51, left = -1, right = 56
tree[49]: data = 96, left = -1, right = 51
tree[50]: data = 76, left = 92, right = -1
tree[51]: data = 100, left = 76, right = -1
tree[52]: data = 23, left = -1, right = -1
tree[53]: data = 16, left = -1, right = 64
tree[54]: data = 9, left = 60, right = -1
tree[55]: data = 27, left = 75, right = -1
tree[56]: data = 52, left = -1, right = -1
tree[57]: data = 46, left = 72, right = -1
tree[58]: data = 78, left = -1, right = -1
tree[59]: data = 30, left = -1, right = 89
tree[60]: data = 8, left = -1, right = -1
tree[61]: data = 90, left = 62, right = -1
tree[62]: data = 86, left = 73, right = 63
tree[63]: data = 88, left = 82, right = 91
tree[64]: data = 17, left = -1, right = 93
tree[65]: data = 6, left = -1, right = -1
tree[66]: data = 54, left = -1, right = -1
tree[67]: data = 21, left = -1, right = -1
tree[68]: data = 64, left = 74, right = 85
tree[69]: data = 13, left = 77, right = 71
tree[70]: data = 35, left = -1, right = -1
tree[71]: data = 14, left = -1, right = -1
tree[72]: data = 45, left = -1, right = -1
tree[73]: data = 85, left = -1, right = -1
tree[74]: data = 63, left = 84, right = -1
tree[75]: data = 25, left = -1, right = 90
tree[76]: data = 99, left = 79, right = -1
tree[77]: data = 12, left = -1, right = -1
tree[78]: data = 81, left = 98, right = -1
tree[79]: data = 97, left = -1, right = 97
tree[80]: data = 57, left = -1, right = 88
tree[81]: data = 39, left = -1, right = 86
tree[82]: data = 87, left = -1, right = -1
tree[83]: data = 2, left = -1, right = -1
tree[84]: data = 62, left = -1, right = -1
tree[85]: data = 65, left = -1, right = 96
tree[86]: data = 40, left = -1, right = -1
tree[87]: data = 69, left = 94, right = 99
tree[88]: data = 58, left = -1, right = -1
tree[89]: data = 31, left = -1, right = -1
tree[90]: data = 26, left = -1, right = -1
tree[91]: data = 89, left = -1, right = -1
tree[92]: data = 75, left = -1, right = -1
tree[93]: data = 19, left = 95, right = -1
tree[94]: data = 68, left = -1, right = -1
tree[95]: data = 18, left = -1, right = -1
tree[96]: data = 66, left = -1, right = -1
tree[97]: data = 98, left = -1, right = -1
tree[98]: data = 80, left = -1, right = -1
tree[99]: data = 70, left = -1, right = -1
*/

}
