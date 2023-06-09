package sevendays;

import java.util.Arrays;
import java.util.List;

public class a048集合工具类 {
    public static void main(String[] args) {
        int[] is = {2,5,1,6,0};
        System.out.println(Arrays.toString(is));


        List<Integer> list = Arrays.asList(2,3,1,5,0);
        System.out.println(list);
        System.out.println(Arrays.binarySearch(is,2));

    }
}
