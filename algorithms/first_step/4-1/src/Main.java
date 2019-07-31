import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // 『アルゴリズムはじめの一歩完全攻略』
        //4-1 多重ループの基礎 (九九表の出力)
        
        for (int step = 1; step <=9; step++){
            System.out.print(step + "の段:  ");
            for (int num = 1; num <= 9; num++){
                System.out.printf("\t%2d", step * num);
            }
            System.out.printf("\n");
        }
      /*
      実行結果
      
      1の段:  	 1	 2	 3	 4	 5	 6	 7	 8	 9
      2の段:  	 2	 4	 6	 8	10	12	14	16	18
      3の段:  	 3	 6	 9	12	15	18	21	24	27
      4の段:  	 4	 8	12	16	20	24	28	32	36
      5の段:  	 5	10	15	20	25	30	35	40	45
      6の段:  	 6	12	18	24	30	36	42	48	54
      7の段:  	 7	14	21	28	35	42	49	56	63
      8の段:  	 8	16	24	32	40	48	56	64	72
      9の段:  	 9	18	27	36	45	54	63	72	81
      */
    }
}
