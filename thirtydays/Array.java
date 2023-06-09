package thirtydays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        int[][] arrTwo = new int[][]{{1, 2, 3}, {4, 5, 6}};
        Array Self = new Array();
        Self.TwoLine(arrTwo);
        int[][] ArrThr = new int[3][3];
        Self.DongTaiShuZu(ArrThr);
    }

    public void TwoLine(int[][] arrTwo) {
        for (int i = 0; i < arrTwo.length; i++) {
            System.out.println("我是TwoLine" + Arrays.toString(arrTwo[i]));
        }
    }

    public void DongTaiShuZu(int[][] ArrDongTai) {
        System.out.println("我是DongTaiShuZu" + Arrays.toString(ArrDongTai[0]));
    }
}
