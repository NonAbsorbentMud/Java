package test;

import java.time.format.TextStyle;
import java.util.*;

public class  DateTest {
    //Date类：表示特定的瞬间，精确到毫秒
    public static void dateClassTest(){
        System.out.println("Date类--------------------------------------------------------");
        Date date=new Date();
        System.out.println("toString(把此Date对象转换为以下形式的String：dow mon dd hh:mm:ss zzz yyyy其中：dow是一周中的某一天(Sun,Mon,Tue,Wed,Thu,Fri,Sat)):"+(date.toString()));
        System.out.println("getYear(年份y由整数y-1900表示,已过时由Calendar.get(Calendar.YEAR)-1900 取代):"+(date.getYear()+1900));
        System.out.println("getMonth(月份由从0至11的整数表示,已过时由Calendar.get(Calendar.MONTH)取代):"+(date.getMonth()+1));
        System.out.println("getDate(日期（一月中的某天）按通常方式由整数1至31表示,已过时由Calendar.get(Calendar.DAY_OF_MONTH)取代):"+(date.getDate()));
        System.out.println("getHours(小时由从0至23的整数表示,已过时由Calendar.get(Calendar.HOUR_OF_DAY)取代):"+(date.getHours()));
        System.out.println("getMinutes(分钟按通常方式由0至59的整数表示,已过时由Calendar.get(Calendar.MINUTE)取代):"+(date.getMinutes()));
        System.out.println("getSeconds(秒由0至61的整数表示,已过时由Calendar.get(Calendar.SECOND)取代):"+(date.getSeconds()));
        System.out.println("getTime(返回自1970年1月1日00:00:00GMT以来此Date对象表示的毫秒数):"+(date.getTime()));
        System.out.println("getDay(已过时由Calendar.get(Calendar.DAY_OF_WEEK)取代):"+(date.getDay()));
        System.out.println("after(测试此日期是否在指定日期之后):"+(date.after(new Date())));
        System.out.println("before(测试此日期是否在指定日期之前):"+(date.before(new Date())));
        System.out.println("compareTo(比较两个日期的顺序):"+(date.compareTo(new Date())));
        System.out.println("equals(比较两个日期的相等性):"+(date.equals(new Date())));
        //System.out.println("parse(把字符串解释为日期和时间的表示形式,返回对应的毫秒数,由DateFormat.parse(String s)取代):"+(date.parse("2023-5-2 4:6:43")));
        System.out.println("--------------------------------------------------------");
    }
    /*
        Calendar接口：为特定瞬间与一组诸如YEAR、MONTH、DAY_OF_MONTH、HOUR等日历字段之间的转换提供了一些方法，
        并为操作日历字段（例如获得下星期的日期）提供了一些方法。瞬间可用毫秒值来表示，
        它是距历元（即格林威治标准时间1970年1月1日的 00:00:00.000，格里高利历）的偏移量。
    */
    public static void calendarClassTest(){
        System.out.println("Calendar接口--------------------------------------------------------");
        Calendar calendar=Calendar.getInstance();
        System.out.println("getInstance(使用默认时区和语言环境获得一个日历):"+calendar.toString());
        System.out.println("toString(返回此日历的字符串表示形式):"+calendar.toString());
        System.out.println("get(返回给定日历字段的值):-------------");
        System.out.println("---Calendar接口--------------年------------------------------------------");
        System.out.println("---字段YEAR(指示年):"+calendar.get(Calendar.YEAR));
        System.out.println("---Calendar接口--------------月------------------------------------------");
        System.out.println("---字段MONTH(指示月份):"+(calendar.get(Calendar.MONTH)+1));
        System.out.println("getDisplayName(返回给定style和locale下的日历field值的字符串表示形式):"+calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH));
        System.out.println("getDisplayName(返回给定style和locale下的日历field值的字符串表示形式):"+calendar.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.ENGLISH));
        System.out.println("getDisplayName(返回给定style和locale下的日历field值的字符串表示形式):"+calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()));
        System.out.println("getDisplayName(返回给定style和locale下的日历field值的字符串表示形式):"+calendar.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.getDefault()));
        System.out.println("---字段ALL_STYLES(指示所有风格名称的风格说明符，比如 \"January\" 和 \"Jan\"):"+(Calendar.ALL_STYLES));
        System.out.println("---字段LONG(指示长名称的风格说明符，比如 \"January\"):"+(Calendar.LONG));
        System.out.println("---字段SHORT(指示短名称的风格说明符，比如 \"Jan\"):"+(Calendar.SHORT));
        System.out.println("---字段JANUARY(一年中第一个月的MONTH字段值):"+(Calendar.JANUARY));
        System.out.println("---字段FEBRUARY(一年中第二个月的MONTH字段值):"+(Calendar.FEBRUARY));
        System.out.println("---字段MARCH(一年中第三个月的MONTH字段值):"+(Calendar.MARCH));
        System.out.println("---字段APRIL(一年中第四个月的MONTH字段值):"+(Calendar.APRIL));
        System.out.println("---字段MAY(一年中第五个月的MONTH字段值):"+(Calendar.MAY));
        System.out.println("---字段JUNE(一年中第六个月的MONTH字段值):"+(Calendar.JUNE));
        System.out.println("---字段JULY(一年中第七个月的MONTH字段值):"+(Calendar.JULY));
        System.out.println("---字段AUGUST(一年中第八个月的MONTH字段值):"+(Calendar.AUGUST));
        System.out.println("---字段SEPTEMBER(一年中第九个月的MONTH字段值):"+(Calendar.SEPTEMBER));
        System.out.println("---字段OCTOBER(一年中第十个月的MONTH字段值):"+(Calendar.OCTOBER));
        System.out.println("---字段NOVEMBER(一年中第十一个月的MONTH字段值):"+(Calendar.NOVEMBER));
        System.out.println("---字段DECEMBER(一年中第十二个月的MONTH字段值):"+(Calendar.DECEMBER));
        System.out.println("---字段UNDECIMBER(一年中第十三个月的MONTH字段值):"+(Calendar.UNDECIMBER));
        System.out.println("---Calendar接口--------------日------------------------------------------");
        System.out.println("---字段DATE(一个月中的某天):"+calendar.get(Calendar.DATE));
        System.out.println("---字段DAY_OF_MONTH(一个月中的某天):"+(calendar.get(Calendar.DAY_OF_MONTH)));
        System.out.println("---字段DAY_OF_YEAR(当前年中的天数):"+(calendar.get(Calendar.DAY_OF_YEAR)));
        System.out.println("---Calendar接口--------------时------------------------------------------");
        System.out.println("---字段HOUR_OF_DAY(小时):"+calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("---字段HOUR(上午或下午的小时):"+calendar.get(Calendar.HOUR));
        System.out.println("---字段AM(指示从午夜到中午之前这段时间的AM_PM字段值):"+(Calendar.AM));
        System.out.println("---字段PM(指示从中午到午夜之前这段时间的AM_PM字段值):"+(Calendar.PM));
        System.out.println("---字段AM_PM(指示HOUR是在中午之前还是在中午之后):"+(Calendar.AM_PM));
        System.out.println("---Calendar接口--------------分------------------------------------------");
        System.out.println("---字段MINUTE(分钟):"+calendar.get(Calendar.MINUTE));
        System.out.println("---Calendar接口--------------秒------------------------------------------");
        System.out.println("---字段SECOND(秒):"+calendar.get(Calendar.SECOND));
        System.out.println("---Calendar接口--------------毫秒------------------------------------------");
        System.out.println("---字段MILLISECOND(毫秒):"+calendar.get(Calendar.MILLISECOND));
        System.out.println("---字段ZONE_OFFSET(以毫秒为单位指示距GMT的大致偏移量):"+Calendar.ZONE_OFFSET);
        System.out.println("---字段DST_OFFSET(以毫秒为单位指示夏令时的偏移量):"+Calendar.DST_OFFSET);
        System.out.println("---Calendar接口--------------星期------------------------------------------");
        System.out.println("---字段DAY_OF_WEEK(一个星期中的某天):"+(calendar.get(Calendar.DAY_OF_WEEK)));
        System.out.println("getDisplayName(返回给定style和locale下的日历field值的字符串表示形式):"+calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH));
        System.out.println("getDisplayName(返回给定style和locale下的日历field值的字符串表示形式):"+calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.ENGLISH));
        System.out.println("getDisplayName(返回给定style和locale下的日历field值的字符串表示形式):"+calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()));
        System.out.println("getDisplayName(返回给定style和locale下的日历field值的字符串表示形式):"+calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.getDefault()));
        System.out.println("---字段MONDAY(指示Monday的DAY_OF_WEEK字段值):"+(Calendar.MONDAY));
        System.out.println("---字段TUESDAY(指示Tuesday的DAY_OF_WEEK字段值。):"+(Calendar.TUESDAY));
        System.out.println("---字段WEDNESDAY(指示Wednesday的DAY_OF_WEEK字段值):"+(Calendar.WEDNESDAY));
        System.out.println("---字段THURSDAY(指示Thursday的DAY_OF_WEEK字段值):"+(Calendar.THURSDAY));
        System.out.println("---字段FRIDAY(指示Friday的DAY_OF_WEEK字段值):"+(Calendar.FRIDAY));
        System.out.println("---字段SATURDAY(指示Saturday的DAY_OF_WEEK字段值):"+(Calendar.SATURDAY));
        System.out.println("---字段SUNDAY(指示Sunday的DAY_OF_WEEK字段值):"+(Calendar.SUNDAY));
        System.out.println("---字段DAY_OF_WEEK_IN_MONTH(当前月中的第几个星期):"+(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH)));
        System.out.println("---字段WEEK_OF_MONTH(当前月中的星期数):"+(calendar.get(Calendar.WEEK_OF_MONTH)));
        System.out.println("---字段WEEK_OF_YEAR(当前年中的星期数):"+(calendar.get(Calendar.WEEK_OF_YEAR)));
        calendar.add(Calendar.YEAR,-1);
        System.out.println("add(为给定的日历字段添加或减去指定的时间量):"+calendar.toString());
        System.out.println("after(判断此Calendar表示的时间是否在指定Object表示的时间之后):"+calendar.after(Calendar.getInstance()));
        System.out.println("before(判断此Calendar表示的时间是否在指定Object表示的时间之前):"+calendar.before(Calendar.getInstance()));
        System.out.println("compareTo(比较两个Calendar对象表示的时间值):"+calendar.compareTo(Calendar.getInstance()));
        System.out.println("equals(将此Calendar与指定Object比较):"+calendar.equals(Calendar.getInstance()));
        System.out.println("getTime(返回一个表示此Calendar时间值的Date对象):"+calendar.getTime());
        System.out.println("getTimeInMillis(返回此Calendar的时间值，以毫秒为单位):"+calendar.getTimeInMillis());
        System.out.println("getDisplayName(返回给定style和locale下的日历field值的字符串表示形式):"+calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH));
        calendar.setFirstDayOfWeek(1);
        System.out.println("setFirstDayOfWeek(设置一星期的第一天是哪一天；例如在美国是SUNDAY，而在法国是MONDAY):"+calendar.toString());
        calendar.clear();
        System.out.println("clear(将此Calendar的所日历字段值和时间值设置成未定义):"+calendar.toString());
        System.out.println("--------------------------------------------------------");
    }
    //实现Calendar接口的GregorianCalendar类
    public static void gregorianCalendarClassTest() {
        Calendar calendar=new GregorianCalendar();
        System.out.println("---GregorianCalendar类--------------年------------------------------------------");
        System.out.println("---字段YEAR(指示年):"+calendar.get(Calendar.YEAR));
        System.out.println("---GregorianCalendar类--------------月------------------------------------------");
        System.out.println("---字段MONTH(指示月份):"+(calendar.get(Calendar.MONTH)+1));
        System.out.println("---GregorianCalendar类--------------日------------------------------------------");
        System.out.println("---字段DATE(一个月中的某天):"+calendar.get(Calendar.DATE));
        System.out.println("---GregorianCalendar类--------------时------------------------------------------");
        System.out.println("---字段HOUR_OF_DAY(小时):"+calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("---GregorianCalendar类--------------分------------------------------------------");
        System.out.println("---字段MINUTE(分钟):"+calendar.get(Calendar.MINUTE));
        System.out.println("---GregorianCalendar类--------------秒------------------------------------------");
        System.out.println("---字段SECOND(秒):"+calendar.get(Calendar.SECOND));
        System.out.println("---GregorianCalendar类--------------毫秒------------------------------------------");
        System.out.println("---字段MILLISECOND(毫秒):"+calendar.get(Calendar.MILLISECOND));
        System.out.println("---GregorianCalendar类--------------星期------------------------------------------");
        System.out.println("---字段DAY_OF_WEEK(一个星期中的某天):"+(calendar.get(Calendar.DAY_OF_WEEK)));
    }
    /*
        Locale类：表示了特定的地理、政治和文化地区。需要Locale来执行其任务的操作称为语言环境敏感的操作，它使用Locale为用户量身定制信息。
        例如，显示一个数值就是语言环境敏感的操作，应该根据用户的国家、地区或文化的风俗/传统来格式化该数值。
    */
    public static void localeClassTest(){
        Locale locale=new Locale("en");
        System.out.println("---Locale类--------------------------------------------------------");
        System.out.println("getCountry(返回此语言环境的国家/地区代码,将为空字符串或大写的ISO 3166两字母代码):"+Locale.ENGLISH.getCountry());
        System.out.println("getDefault(获得此Java虚拟机实例的当前默认语言环境值):"+Locale.getDefault());
        System.out.println("getAvailableLocales(返回所有已安装语言环境的数组):"+ Arrays.toString(Locale.getAvailableLocales()));
        System.out.println("getDisplayCountry(返回适合向用户显示的语言环境国家/地区名):"+Locale.ENGLISH.getDisplayCountry());
        System.out.println("getDisplayLanguage(返回适合向用户显示的语言环境语言名):"+Locale.ENGLISH.getDisplayLanguage());
        System.out.println("getDisplayName(返回适合向用户显示的语言环境名):"+Locale.ENGLISH.getDisplayName());
        System.out.println("getDisplayVariant(返回适合向用户显示的语言环境变量代码名):"+Locale.ENGLISH.getDisplayVariant());
        System.out.println("---Locale类用于表示国家/地区的有用常量字段--------------------------------------------------------");
        System.out.println("CANADA:"+Locale.CANADA.getDisplayName());
        System.out.println("CANADA_FRENCH:"+Locale.CANADA_FRENCH.getDisplayName());
        System.out.println("CHINA:"+Locale.CHINA.getDisplayName());
        System.out.println("CHINESE:"+Locale.CHINESE.getDisplayName());
        System.out.println("ENGLISH:"+Locale.ENGLISH.getDisplayName());
        System.out.println("FRANCE:"+Locale.FRANCE.getDisplayName());
        System.out.println("FRENCH:"+Locale.FRENCH.getDisplayName());
        System.out.println("GERMAN:"+Locale.GERMAN.getDisplayName());
        System.out.println("GERMANY:"+Locale.GERMANY.getDisplayName());
        System.out.println("ITALIAN:"+Locale.ITALIAN.getDisplayName());
        System.out.println("ITALY:"+Locale.ITALY.getDisplayName());
        System.out.println("JAPAN:"+Locale.JAPAN.getDisplayName());
        System.out.println("JAPANESE:"+Locale.JAPANESE.getDisplayName());
        System.out.println("KOREA:"+Locale.KOREA.getDisplayName());
        System.out.println("KOREAN:"+Locale.KOREAN.getDisplayName());
        System.out.println("PRC:"+Locale.PRC.getDisplayName());
        System.out.println("ROOT:"+Locale.ROOT.getDisplayName());
        System.out.println("SIMPLIFIED_CHINESE:"+Locale.SIMPLIFIED_CHINESE.getDisplayName());
        System.out.println("TAIWAN:"+Locale.TAIWAN.getDisplayName());
        System.out.println("TRADITIONAL_CHINESE:"+Locale.TRADITIONAL_CHINESE.getDisplayName());
        System.out.println("UK:"+Locale.UK.getDisplayName());
        System.out.println("US:"+Locale.US.getDisplayName());
    }
    //主类
    public static void main(String[] args){
        dateClassTest();
        calendarClassTest();
        gregorianCalendarClassTest();
        localeClassTest();
    }
}
