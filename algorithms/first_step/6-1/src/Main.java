import java.util.*;

public class Main {
    /*
    『アルゴリズムはじめの一歩完全攻略』
    6-1 二分探索木のデータ構造と要素の追加
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
        System.out.println("物理的な順序");
        for (int i = 0; i < newIdx; i++){
            System.out.println("tree[" + i + "]: data = " + tree[i].data + ", left = " + tree[i].left + ", right = " + tree[i].right);
        }
    }
    
    public static void printLogicalBST(int currentIdx){
        
        if(currentIdx != -1){
            System.out.println("tree[" + currentIdx + "]: data = " + tree[currentIdx].data + ", left = " + tree[currentIdx].left + ", right = " + tree[currentIdx].right);
            
            printLogicalBST(tree[currentIdx].left);
            printLogicalBST(tree[currentIdx].right);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < tree.length; i++){
            tree[i] = new BST();
        }
        
        try{
            System.out.println("要素の数を入力してください(最大100)");
            int itemNum = sc.nextInt();
            System.out.println("整数の要素を空白区切りまたは改行区切りで入力してください");
            for(int n = 0; n < itemNum; n++){
                addBST(sc.nextInt());
            }
            printPhysicalBST();
            System.out.println("--------------------------------------------------\n論理的な順序");
            printLogicalBST(rootIdx);
        }catch (InputMismatchException e){
            System.out.println("不正な入力です。整数を入力してください");
        }catch (NoSuchElementException e){
            System.out.println("入力した要素数よりも実際の要素の数が少なくなっています");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("扱える要素の数を超えています");
        }
        
    }
    
/*実行例
    
入力
100
96 24 45 23 100 94 14 33 58 18 29 88 31 21 40 85 5 30 6 12 47 91 72 81 60 53 
11 49 97 13 27 50 92 57 16 48 9 54 77 56 73 20 10 76 78 80 90 34 62 69 46 68 
64 74 95 8 35 55 4 63 43 67 2 52 15 41 75 3 79 87 86 36 38 32 82 93 89 61 65 
37 98 26 25 71 84 70 99 51 22 59 1 83 19 39 42 17 66 28 7 44
    
出力
要素の数を入力してください(最大100)
整数の要素を空白区切りまたは改行区切りで入力してください
物理的な順序
tree[0]: data = 96, left = 1, right = 4
tree[1]: data = 24, left = 3, right = 2
tree[2]: data = 45, left = 7, right = 5
tree[3]: data = 23, left = 6, right = -1
tree[4]: data = 100, left = 28, right = -1
tree[5]: data = 94, left = 8, right = 54
tree[6]: data = 14, left = 16, right = 9
tree[7]: data = 33, left = 10, right = 14
tree[8]: data = 58, left = 20, right = 11
tree[9]: data = 18, left = 34, right = 13
tree[10]: data = 29, left = 30, right = 12
tree[11]: data = 88, left = 15, right = 21
tree[12]: data = 31, left = 17, right = 73
tree[13]: data = 21, left = 41, right = 88
tree[14]: data = 40, left = 47, right = 60
tree[15]: data = 85, left = 22, right = 69
tree[16]: data = 5, left = 58, right = 18
tree[17]: data = 30, left = -1, right = -1
tree[18]: data = 6, left = -1, right = 19
tree[19]: data = 12, left = 26, right = 29
tree[20]: data = 47, left = 50, right = 25
tree[21]: data = 91, left = 46, right = 32
tree[22]: data = 72, left = 24, right = 23
tree[23]: data = 81, left = 38, right = 74
tree[24]: data = 60, left = 89, right = 48
tree[25]: data = 53, left = 27, right = 33
tree[26]: data = 11, left = 36, right = -1
tree[27]: data = 49, left = 35, right = 31
tree[28]: data = 97, left = -1, right = 80
tree[29]: data = 13, left = -1, right = -1
tree[30]: data = 27, left = 81, right = 97
tree[31]: data = 50, left = -1, right = 63
tree[32]: data = 92, left = -1, right = 75
tree[33]: data = 57, left = 37, right = -1
tree[34]: data = 16, left = 64, right = 95
tree[35]: data = 48, left = -1, right = -1
tree[36]: data = 9, left = 55, right = 42
tree[37]: data = 54, left = -1, right = 39
tree[38]: data = 77, left = 40, right = 44
tree[39]: data = 56, left = 57, right = -1
tree[40]: data = 73, left = -1, right = 43
tree[41]: data = 20, left = 92, right = -1
tree[42]: data = 10, left = -1, right = -1
tree[43]: data = 76, left = 53, right = -1
tree[44]: data = 78, left = -1, right = 45
tree[45]: data = 80, left = 68, right = -1
tree[46]: data = 90, left = 76, right = -1
tree[47]: data = 34, left = -1, right = 56
tree[48]: data = 62, left = 77, right = 49
tree[49]: data = 69, left = 51, right = 83
tree[50]: data = 46, left = -1, right = -1
tree[51]: data = 68, left = 52, right = -1
tree[52]: data = 64, left = 59, right = 61
tree[53]: data = 74, left = -1, right = 66
tree[54]: data = 95, left = -1, right = -1
tree[55]: data = 8, left = 98, right = -1
tree[56]: data = 35, left = -1, right = 71
tree[57]: data = 55, left = -1, right = -1
tree[58]: data = 4, left = 62, right = -1
tree[59]: data = 63, left = -1, right = -1
tree[60]: data = 43, left = 65, right = 99
tree[61]: data = 67, left = 78, right = -1
tree[62]: data = 2, left = 90, right = 67
tree[63]: data = 52, left = 87, right = -1
tree[64]: data = 15, left = -1, right = -1
tree[65]: data = 41, left = -1, right = 94
tree[66]: data = 75, left = -1, right = -1
tree[67]: data = 3, left = -1, right = -1
tree[68]: data = 79, left = -1, right = -1
tree[69]: data = 87, left = 70, right = -1
tree[70]: data = 86, left = -1, right = -1
tree[71]: data = 36, left = -1, right = 72
tree[72]: data = 38, left = 79, right = 93
tree[73]: data = 32, left = -1, right = -1
tree[74]: data = 82, left = -1, right = 84
tree[75]: data = 93, left = -1, right = -1
tree[76]: data = 89, left = -1, right = -1
tree[77]: data = 61, left = -1, right = -1
tree[78]: data = 65, left = -1, right = 96
tree[79]: data = 37, left = -1, right = -1
tree[80]: data = 98, left = -1, right = 86
tree[81]: data = 26, left = 82, right = -1
tree[82]: data = 25, left = -1, right = -1
tree[83]: data = 71, left = 85, right = -1
tree[84]: data = 84, left = 91, right = -1
tree[85]: data = 70, left = -1, right = -1
tree[86]: data = 99, left = -1, right = -1
tree[87]: data = 51, left = -1, right = -1
tree[88]: data = 22, left = -1, right = -1
tree[89]: data = 59, left = -1, right = -1
tree[90]: data = 1, left = -1, right = -1
tree[91]: data = 83, left = -1, right = -1
tree[92]: data = 19, left = -1, right = -1
tree[93]: data = 39, left = -1, right = -1
tree[94]: data = 42, left = -1, right = -1
tree[95]: data = 17, left = -1, right = -1
tree[96]: data = 66, left = -1, right = -1
tree[97]: data = 28, left = -1, right = -1
tree[98]: data = 7, left = -1, right = -1
tree[99]: data = 44, left = -1, right = -1
--------------------------------------------------
論理的な順序
tree[0]: data = 96, left = 1, right = 4
tree[1]: data = 24, left = 3, right = 2
tree[3]: data = 23, left = 6, right = -1
tree[6]: data = 14, left = 16, right = 9
tree[16]: data = 5, left = 58, right = 18
tree[58]: data = 4, left = 62, right = -1
tree[62]: data = 2, left = 90, right = 67
tree[90]: data = 1, left = -1, right = -1
tree[67]: data = 3, left = -1, right = -1
tree[18]: data = 6, left = -1, right = 19
tree[19]: data = 12, left = 26, right = 29
tree[26]: data = 11, left = 36, right = -1
tree[36]: data = 9, left = 55, right = 42
tree[55]: data = 8, left = 98, right = -1
tree[98]: data = 7, left = -1, right = -1
tree[42]: data = 10, left = -1, right = -1
tree[29]: data = 13, left = -1, right = -1
tree[9]: data = 18, left = 34, right = 13
tree[34]: data = 16, left = 64, right = 95
tree[64]: data = 15, left = -1, right = -1
tree[95]: data = 17, left = -1, right = -1
tree[13]: data = 21, left = 41, right = 88
tree[41]: data = 20, left = 92, right = -1
tree[92]: data = 19, left = -1, right = -1
tree[88]: data = 22, left = -1, right = -1
tree[2]: data = 45, left = 7, right = 5
tree[7]: data = 33, left = 10, right = 14
tree[10]: data = 29, left = 30, right = 12
tree[30]: data = 27, left = 81, right = 97
tree[81]: data = 26, left = 82, right = -1
tree[82]: data = 25, left = -1, right = -1
tree[97]: data = 28, left = -1, right = -1
tree[12]: data = 31, left = 17, right = 73
tree[17]: data = 30, left = -1, right = -1
tree[73]: data = 32, left = -1, right = -1
tree[14]: data = 40, left = 47, right = 60
tree[47]: data = 34, left = -1, right = 56
tree[56]: data = 35, left = -1, right = 71
tree[71]: data = 36, left = -1, right = 72
tree[72]: data = 38, left = 79, right = 93
tree[79]: data = 37, left = -1, right = -1
tree[93]: data = 39, left = -1, right = -1
tree[60]: data = 43, left = 65, right = 99
tree[65]: data = 41, left = -1, right = 94
tree[94]: data = 42, left = -1, right = -1
tree[99]: data = 44, left = -1, right = -1
tree[5]: data = 94, left = 8, right = 54
tree[8]: data = 58, left = 20, right = 11
tree[20]: data = 47, left = 50, right = 25
tree[50]: data = 46, left = -1, right = -1
tree[25]: data = 53, left = 27, right = 33
tree[27]: data = 49, left = 35, right = 31
tree[35]: data = 48, left = -1, right = -1
tree[31]: data = 50, left = -1, right = 63
tree[63]: data = 52, left = 87, right = -1
tree[87]: data = 51, left = -1, right = -1
tree[33]: data = 57, left = 37, right = -1
tree[37]: data = 54, left = -1, right = 39
tree[39]: data = 56, left = 57, right = -1
tree[57]: data = 55, left = -1, right = -1
tree[11]: data = 88, left = 15, right = 21
tree[15]: data = 85, left = 22, right = 69
tree[22]: data = 72, left = 24, right = 23
tree[24]: data = 60, left = 89, right = 48
tree[89]: data = 59, left = -1, right = -1
tree[48]: data = 62, left = 77, right = 49
tree[77]: data = 61, left = -1, right = -1
tree[49]: data = 69, left = 51, right = 83
tree[51]: data = 68, left = 52, right = -1
tree[52]: data = 64, left = 59, right = 61
tree[59]: data = 63, left = -1, right = -1
tree[61]: data = 67, left = 78, right = -1
tree[78]: data = 65, left = -1, right = 96
tree[96]: data = 66, left = -1, right = -1
tree[83]: data = 71, left = 85, right = -1
tree[85]: data = 70, left = -1, right = -1
tree[23]: data = 81, left = 38, right = 74
tree[38]: data = 77, left = 40, right = 44
tree[40]: data = 73, left = -1, right = 43
tree[43]: data = 76, left = 53, right = -1
tree[53]: data = 74, left = -1, right = 66
tree[66]: data = 75, left = -1, right = -1
tree[44]: data = 78, left = -1, right = 45
tree[45]: data = 80, left = 68, right = -1
tree[68]: data = 79, left = -1, right = -1
tree[74]: data = 82, left = -1, right = 84
tree[84]: data = 84, left = 91, right = -1
tree[91]: data = 83, left = -1, right = -1
tree[69]: data = 87, left = 70, right = -1
tree[70]: data = 86, left = -1, right = -1
tree[21]: data = 91, left = 46, right = 32
tree[46]: data = 90, left = 76, right = -1
tree[76]: data = 89, left = -1, right = -1
tree[32]: data = 92, left = -1, right = 75
tree[75]: data = 93, left = -1, right = -1
tree[54]: data = 95, left = -1, right = -1
tree[4]: data = 100, left = 28, right = -1
tree[28]: data = 97, left = -1, right = 80
tree[80]: data = 98, left = -1, right = 86
tree[86]: data = 99, left = -1, right = -1
*/

}
