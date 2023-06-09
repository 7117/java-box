package sevendays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class a035日期 {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);

        //Date到String
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = sdf.format(d);
        System.out.println(dateStr);

        //String到date
        Date parseDate = sdf.parse(dateStr);
        System.out.println(parseDate);

        //时间戳
        d.setTime(System.currentTimeMillis());
        System.out.println(d.getTime());

        //日历类
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance.get(Calendar.MONTH));

        instance.setTime(new Date());
        instance.add(Calendar.YEAR,-1);
        System.out.println(instance.get(Calendar.YEAR));;

    }
}
