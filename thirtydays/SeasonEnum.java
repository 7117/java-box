package thirtydays;

import java.util.Arrays;
import java.util.Scanner;

enum Season {
    spring, summer, autumn, winter;
}


public class SeasonEnum {
    public static void main(String[] args) {
        System.out.println("请输入季节" +  "1、春天" +  "2、夏天" +  "3、秋天" +  "4、冬天");
        Scanner scan = new Scanner(System.in);
        int seasons = scan.nextInt();
        change(seasons);
    }

    private static void change(int seasons) {
        Season season = Season.spring;
        switch (seasons) {
            case 1:
                break;
            case 2:
                season = Season.summer;
                break;
            case 3:
                season = Season.autumn;
                break;
            case 4:
                season = Season.winter;
                break;
        }
        System.out.println("顺序1："+season);
        System.out.println("顺序2："+season.name());
        System.out.println("顺序3："+Arrays.toString(Season.values()));
        System.out.println("顺序4："+season.ordinal());
        System.out.println("顺序5："+Season.valueOf("summer"));
        System.out.println("顺序6："+Season.autumn.compareTo(Season.valueOf("summer")));
        System.out.println("顺序7："+Season.spring.compareTo(Season.valueOf("summer")));
    }
}