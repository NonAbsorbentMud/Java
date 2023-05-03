package test;

import java.util.Arrays;

//字符串
//1.如果要操作少量的数据用 String；
//2.多线程操作字符串缓冲区下操作大量数据 StringBuffer；
//3.单线程操作字符串缓冲区下操作大量数据 StringBuilder（推荐使用）。
public class StringTest {
    //常用字符串类
    public static void strTypeTest(){
        System.out.println("String类(不可变字符串)：------------------------------------");
        String str=new String("11");
        System.out.println("String-11的哈希地址"+str.hashCode());
        str="12";
        System.out.println("String-12的哈希地址"+str.hashCode());
        System.out.println("StringBuffer类(可变字符串、效率低、线程安全)：------------------------------------");
        StringBuffer sb=new StringBuffer("11");
        System.out.println("StringBuffer-11的哈希地址"+sb.hashCode());
        sb.delete(0,sb.length());
        sb.append("12");
        System.out.println("StringBuffer-12的哈希地址"+sb.hashCode());
        System.out.println("StringBuilder类(可变字符串、效率高、线程不安全，会自动维护数组的扩容，默认16字符空间，超过自动扩充)：------------------------------------");
        StringBuilder sbu=new StringBuilder("11");
        System.out.println("StringBuilder-11的哈希地址"+sbu.hashCode());
        sbu.delete(0,sb.length());
        sbu.append("12");
        System.out.println("StringBuilder-12的哈希地址"+sbu.hashCode());
    }
    //字符串的类方法
    public static void strClassMethod(){
        String str=" ddd dda ass cd ";
        StringBuffer sb=new StringBuffer(" ddd dda ass cd ");
        StringBuilder sbu=new StringBuilder(" ddd dda ass cd ");
        System.out.println("------------------String/StringBuffer/StringBuilder----------------------------------------");
        System.out.println("substring(截取字符串):"+str.substring(0,10)+"——"+sb.substring(0,10)+"——"+sbu.substring(0,10));
        System.out.println("charAt(返回指定索引处的char值):"+str.charAt(8)+"——"+sb.charAt(8)+"——"+sbu.charAt(8));
        System.out.println("indexOf(返回指定字符在此字符串中第一次出现处的索引):"+str.indexOf("d")+"——"+sb.indexOf("d")+"——"+sbu.indexOf("d"));
        System.out.println("lastIndexOf(返回指定字符在此字符串中最后一次出现处的索引):"+str.lastIndexOf("d")+"——"+sb.lastIndexOf("d")+"——"+sbu.lastIndexOf("d"));
        System.out.println("length(返回此字符串的长度):"+str.length()+"——"+sb.length()+"——"+sbu.length());
        System.out.println("replace(使用给定字符替换子字符串中的字符):"+str.replace(" ","-")+"——"+sb.replace(1,4,"123")+"——"+sbu.replace(1,4,"123"));
        System.out.println("------------------String----------------------------------------");
        System.out.println("concat(字符串连接):"+str.concat(" 456")+"——"+sb+"——"+sbu);
        System.out.println("toUpperCase(转换为大写):"+ str.toUpperCase()+"——"+sb+"——"+sbu);
        System.out.println("toLowerCase(转换为小写):"+ str.toLowerCase()+"——"+sb+"——"+sbu);
        System.out.println("replaceAll(替换指定字符):"+ str.replaceAll(" ","-")+"——"+sb+"——"+sbu);
        System.out.println("replaceFirst(替换第一个出现的指定字符):"+ str.replaceFirst(" ","-")+"——"+sb+"——"+sbu);
        System.out.println("isEmpty(当且仅当length()为0时返回true):"+ str.isEmpty()+"——"+sb+"——"+sbu);
        System.out.println("matches(是否匹配对应的正则表达式):"+ str.matches("ddd")+"——"+sb+"——"+sbu);
        System.out.println("format(格式化字符串):"+ String.format(str, "00")+"——"+sb+"——"+sbu);
        System.out.println("split(分割字符串):"+ Arrays.toString(str.split(" "))+"——"+sb+"——"+sbu);
        System.out.println("trim(返回字符串的副本，忽略前导空白和尾部空白):"+str.trim()+"——"+sb.toString()+"——"+sbu.toString());
        System.out.println("compareTo(按字典顺序比较两个字符串):"+"A".compareTo("a")+"——"+sb+"——"+sbu);
        System.out.println("contains(当且仅当此字符串包含指定的char值序列时，返回true):"+str.contains("ddd")+"——"+sb+"——"+sbu);
        System.out.println("toCharArray(转换为char数组):"+Arrays.toString(str.toCharArray())+"——"+sb+"——"+sbu);
        System.out.println("getBytes(转换为byte数组):"+Arrays.toString(str.getBytes())+"——"+sb+"——"+sbu);
        System.out.println("------------------StringBuffer/StringBuilder----------------------------------------");
        System.out.println("append(追加字符串):"+str+"——"+sb.append(" 456")+"——"+sbu.append(" 456"));
        System.out.println("reverse(将此字符序列用其反转形式取代):"+str+"——"+sb.reverse()+"——"+sbu.reverse());
        System.out.println("insert(插入字符串):"+str+"——"+sb.insert(0,"11")+"——"+sbu.insert(0,"11"));
        System.out.println("delete(删除指定范围的字符串):"+str+"——"+sb.delete(0,2)+"——"+sbu.delete(0,2));
        System.out.println("deleteCharAt(删除指定下标的字符):"+str+"——"+sb.deleteCharAt(0)+"——"+sbu.deleteCharAt(0));
        sb.setCharAt(0,'0');
        sbu.setCharAt(0,'0');
        System.out.println("setCharAt(返回当前容量):"+str+"——"+sb+"——"+sbu);
        System.out.println("capacity(返回当前容量):"+str+"——"+sb.capacity()+"——"+sbu.capacity());
        System.out.println("----------------------------------------------------------");
    }
    //字节/字符数组与字符串之间的转换
    public static void convertOfByteArrayAndStr(){
        System.out.println("字符串转换成字节/字符数组：-------------------------------------------");
        String str="中文_123_China。";
        byte[] bytes=str.getBytes();
        System.out.println("getBytes(使用平台的默认字符集将此String编码为byte序列):"+Arrays.toString(bytes));
        char[] chars=str.toCharArray();
        System.out.println("toCharArray(将此字符串转换为一个新的字符数组):"+Arrays.toString(chars));
        System.out.println("字节/字符数组转换成字符串：-------------------------------------------");
        System.out.println("String的构造方法:"+(new String(bytes)));
        System.out.println("String的构造方法:"+(new String(chars)));
    }
    //主类
    public static void main(String args[]){
        strTypeTest();
        strClassMethod();
        convertOfByteArrayAndStr();
    }
}
