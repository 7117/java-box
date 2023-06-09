package sevendays;

import java.util.Arrays;

public class a033数组 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        arr1[0] = 0;
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[5];
        arr3[0] = 1;
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        int[][] arr4;
        arr4 = new int[][]{{1, 1, 1}, {2, 2, 2}};
        for (int[] ints : arr4) {
            System.out.println(Arrays.toString(ints));
        }
        int[][] arr44;
        arr44 = new int[][]{new int[]{1, 2, 3}, new int[]{21, 22, 23}};
        for (int[] ints : arr44) {
            System.out.println("二维数组的整形" + Arrays.toString(ints));
        }

        String[][] arr5;
        arr5 = new String[][]{new String[]{"1", "2", "3"}, new String[]{"21", "22", "23"}};
        for (String[] ints : arr5) {
            System.out.println("二维数组的字符串" + Arrays.toString(ints));
        }
        for (int i = 0; i < arr44.length; i++) {
            System.out.println(Arrays.toString(arr44[i]));
            for (int j = 0; j < arr44[i].length; j++) {
                System.out.println(arr44[i][j]);
            }
        }


    }
}
