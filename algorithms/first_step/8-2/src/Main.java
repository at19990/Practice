
public class Main {
    /*
    『アルゴリズムはじめの一歩完全攻略』
    8-2 クイックソート
     */
     
    public static int divideArray(int[] a, int head, int tail){
        int left = head + 1;
        int right = tail;
        int temp;
        
        while(true){
            while(left < tail && a[head] > a[left]){
                left++;
            }
            
            while(a[head] < a[right]){
                right--;
            }
            
            if(left >= right){
                break;
            }
            
            temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            
            left++;
            right--;
        }
        
        temp = a[head];
        a[head] = a[right];
        a[right] = temp;
        
        return right;
    }

    public static void sortArray(int[] a, int start, int end){
        int pivot;
        
        if(start < end){
            pivot = divideArray(a, start, end);
            
            sortArray(a, start, pivot - 1);
            
            sortArray(a, pivot + 1, end);
        }
    }
    
    public static void printArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print("[" + a[i] + "]");
        }
        System.out.print("\n");
    }
    
    public static void main (String[] args) {
        int[] a = {4, 7, 1, 6, 2, 5, 3};
        
        printArray(a);
        
        sortArray(a, 0, a.length - 1);
        
        printArray(a);
    }
/* 実行結果

[4][7][1][6][2][5][3]
[1][2][3][4][5][6][7]
*/
}
