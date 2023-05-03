package test;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.logging.SimpleFormatter;

//格式化
public class FormatTest {
    //实现DateFormat抽象类的SimpleDateFormat类时间格式化：日期格式是不同步的。建议为每个线程创建独立的格式实例
    public static void dateFormatTest(){
        System.out.println("SimpleDateFormat类----------------------------------------------------------");
        System.out.println("---日期和时间模式:\n" +
                "y：年，示例：1996; 96  \n" +
                "M：年中的月份，示例：July; Jul; 07  \n" +
                "d：月份中的天数，示例：10  \n" +
                "H：一天中的小时数（0-23），示例：0  \n" +
                "m：小时中的分钟数，示例：30  \n" +
                "s：分钟中的秒数，示例：55  \n" +
                "S：毫秒数，示例：978  \n" +
                "G：Era标志符，示例：AD  \n" +
                "w：年中的周数，示例：27  \n" +
                "W：月份中的周数，示例：2  \n" +
                "D：年中的天数，示例：189  \n" +
                "F：月份中的星期，示例：2  \n" +
                "E：星期中的天数，示例：Tuesday; Tue  \n" +
                "a：Am/pm 标记，示例：PM  \n" +
                "k：一天中的小时数（1-24），示例：24  \n" +
                "K：am/pm 中的小时数（0-11），示例： 0  \n" +
                "h：am/pm 中的小时数（1-12），示例：12  \n" +
                "z：时区，示例：Pacific Standard Time; PST; GMT-08:00  \n" +
                "Z：时区，示例：-0800 \n");
        System.out.println("SimpleDateFormat类构造格式化对象：-------------------------------------------------------");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        System.out.println("---用默认的模式和默认语言环境的日期格式符号构造：" + simpleDateFormat.toPattern());
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("---用给定的模式和默认语言环境的日期格式符号构造：" +simpleDateFormat1.toPattern());
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", DateFormatSymbols.getInstance());
        System.out.println("---用给定的模式和日期符号构造：" +simpleDateFormat2.toPattern());
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
        System.out.println("---用给定的模式和给定语言环境的默认日期格式符号构造：" +simpleDateFormat3.toPattern());
        System.out.println("SimpleDateFormat类方法：-------------------------------------------------------");
        System.out.println("---toPattern(返回描述此日期格式的模式字符串)：\n" +
                "simpleDateFormat:"+simpleDateFormat.toPattern()+"\n"+
                "simpleDateFormat1:"+simpleDateFormat1.toPattern()+"\n"+
                "simpleDateFormat2:"+simpleDateFormat2.toPattern()+"\n"+
                "simpleDateFormat3"+simpleDateFormat3.toPattern());
        System.out.println("---toLocalizedPattern(返回描述此日期格式的本地化模式字符串)：\n" +
                "simpleDateFormat:"+simpleDateFormat.toLocalizedPattern()+"\n"+
                "simpleDateFormat1:"+simpleDateFormat1.toLocalizedPattern()+"\n"+
                "simpleDateFormat2:"+simpleDateFormat2.toLocalizedPattern()+"\n"+
                "simpleDateFormat3:"+simpleDateFormat3.toLocalizedPattern());
        String format = simpleDateFormat.format(Calendar.getInstance().getTime());
        String format1 = simpleDateFormat1.format(Calendar.getInstance().getTime());
        String format2 = simpleDateFormat2.format(Calendar.getInstance().getTime());
        String format3 = simpleDateFormat3.format(Calendar.getInstance().getTime());
        System.out.println("---format(将给定的Date格式化为日期/时间字符串)：\n" +
                "simpleDateFormat:"+format+"\n"+
                "simpleDateFormat1:"+format1+"\n"+
                "simpleDateFormat2:"+format2+"\n"+
                "simpleDateFormat3:"+format3);
        try{
            System.out.println("---parse(解析字符串的文本，生成 Date)：\n" +
                    "simpleDateFormat:"+simpleDateFormat.parse(format)+"\n"+
                    "simpleDateFormat1:"+simpleDateFormat1.parse(format1)+"\n"+
                    "simpleDateFormat2:"+simpleDateFormat2.parse(format2)+"\n"+
                    "simpleDateFormat3:"+simpleDateFormat3.parse(format3));
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("---getCalendar(获取与此日期/时间格式器关联的日历)：\n" +
                "simpleDateFormat:"+simpleDateFormat.getCalendar().toString()+"\n"+
                "simpleDateFormat1:"+simpleDateFormat1.getCalendar().toString()+"\n"+
                "simpleDateFormat2:"+simpleDateFormat2.getCalendar().toString()+"\n"+
                "simpleDateFormat3:"+simpleDateFormat3.getCalendar().toString());
    }

    //主类
    public static void main(String[] args) {
        dateFormatTest();
    }
}
