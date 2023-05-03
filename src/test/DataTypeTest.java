package test;

import domain.DataTypeModel;

import java.math.BigInteger;
import java.text.DecimalFormat;

//数据类型
public class DataTypeTest {

    //基本数据类型默认值
    public static void defaultValue(){
        DataTypeModel dataTypeModel=new DataTypeModel();
        System.out.println("byte的默认值："+dataTypeModel.getBasebyte());
        System.out.println("short的默认值："+dataTypeModel.getBaseshort());
        System.out.println("int的默认值："+dataTypeModel.getBaseint());
        System.out.println("float的默认值："+dataTypeModel.getBasefloat());
        System.out.println("double的默认值："+dataTypeModel.getBasedouble());
        System.out.println("long的默认值："+dataTypeModel.getBaselong());
        System.out.println("char的默认值："+dataTypeModel.getBasechar());
        System.out.println("boolean的默认值："+dataTypeModel.getBaseboolean());

        System.out.println("Byte的默认值："+dataTypeModel.getPackbyte());
        System.out.println("Short的默认值："+dataTypeModel.getPackshort());
        System.out.println("Integer的默认值："+dataTypeModel.getPackint());
        System.out.println("Float的默认值："+dataTypeModel.getPackfloat());
        System.out.println("Double的默认值："+dataTypeModel.getPackdouble());
        System.out.println("Long的默认值："+dataTypeModel.getPacklong());
        System.out.println("Character的默认值："+dataTypeModel.getPackchar());
        System.out.println("Boolean的默认值："+dataTypeModel.getPackboolean());
    }
    //基本数据的值域
    public static void valueZone(){
        System.out.println("byte的值域："+Byte.MIN_VALUE+"——"+Byte.MAX_VALUE);
        System.out.println("short的值域："+Short.MIN_VALUE+"——"+Short.MAX_VALUE);
        System.out.println("int的值域："+Integer.MIN_VALUE+"——"+Integer.MAX_VALUE);
        System.out.println("float的值域："+Float.MIN_VALUE+"——"+Float.MAX_VALUE);
        System.out.println("double的值域："+Double.MIN_VALUE+"——"+Double.MAX_VALUE);
        System.out.println("long的值域："+Long.MIN_VALUE+"——"+Long.MAX_VALUE);
        System.out.println("char的值域："+Character.MIN_VALUE+"——"+Character.MAX_VALUE);
        System.out.println("boolean的值域："+Boolean.FALSE+"——"+Boolean.TRUE);
    }
    //基本数据类型以二进制补码形式的位数
    public static void bitNumber(){
        System.out.println("byte的位数："+Byte.SIZE);
        System.out.println("short的位数："+Short.SIZE);
        System.out.println("int的位数："+Integer.SIZE);
        System.out.println("float的位数："+Float.SIZE);
        System.out.println("double的位数："+Double.SIZE);
        System.out.println("long的位数："+Long.SIZE);
        System.out.println("char的位数："+Character.SIZE);
        System.out.println("boolean的位数："+1);
    }
    //基本数据类型
    public static void baseDataType(){
        System.out.println("字节类型："+Byte.TYPE);
        System.out.println("短整数类型："+Short.TYPE);
        System.out.println("整数类型："+Integer.TYPE);
        System.out.println("单精度浮点类型："+Float.TYPE);
        System.out.println("双精度浮点类型："+Double.TYPE);
        System.out.println("长整数类型："+Long.TYPE);
        System.out.println("字符类型："+Character.TYPE);
        System.out.println("布尔类型："+Boolean.TYPE);
    }
    //基本数据类型与字符串的转换
    public static void convertOfBasisAndString(){
        System.out.println("字符串转换为基本数据类型：--------------------------------------");
        String str="12";
        System.out.println("---包装类Byte/Short/Integer/Long的静态方法decode(String s)："+(Byte.decode(str) instanceof Byte));
        System.out.println("---包装类Byte/Short/Integer/Long/Float/Double/Boolean/Char的静态方法valueOf(String s|char c)："+(Byte.valueOf(str) instanceof Byte));
        System.out.println("---包装类Byte/Short/Integer/Long/Float/Double/Boolean的静态方法parse*(String s)："+Byte.parseByte(str));
        System.out.println("基本数据类型转换为字符串：--------------------------------------");
        byte b=24;
        System.out.println("---基本数据类型与字符相加拼接："+((b+"") instanceof String));
        System.out.println("---包装类的静态方法toString(T b)："+(Byte.toString(b) instanceof String));
    }
    //基本数据类型之间的转换
    public static void convertOfBasis(){
        byte a=5;short b=a;int c=a;long d=a;float e=a;double f=a;
        System.out.println("byte可转换short/int/long/float/double："+a+"——"+b+"——"+c+"——"+d+"——"+e+"——"+f);
        a= (byte) b;c=b;d=b;e=b;f=b;
        System.out.println("short可转换byte(强)/int/long/float/double："+a+"——"+b+"——"+c+"——"+d+"——"+e+"——"+f);
        a= (byte) c;b= (short) c;d=c;e=c;f=c;
        System.out.println("int可转换byte(强)/short(强)/long/float/double："+a+"——"+b+"——"+c+"——"+d+"——"+e+"——"+f);
        a= (byte) d;b= (short) d;c= (int) d;e=d;f=d;
        System.out.println("long可转换byte(强)/short(强)/int(强)/float/double："+a+"——"+b+"——"+c+"——"+d+"——"+e+"——"+f);
        a= (byte) e;b= (short) e;c= (int) e;d= (long) e;f=e;
        System.out.println("float可转换byte(强)/short(强)/int(强)/long(强)/double："+a+"——"+b+"——"+c+"——"+d+"——"+e+"——"+f);
        a= (byte) f;b= (short) f;c= (int) f;d= (long) f;e= (float) f;
        System.out.println("float可转换byte(强)/short(强)/int(强)/long(强)/float(强)："+a+"——"+b+"——"+c+"——"+d+"——"+e+"——"+f);
    }
    //二进制（Binary）、八进制（Octal）、十进制（Decimal）、十六进制（Hexadecimal）之间的转换
    public static void convertScale(){
        DecimalFormat df = new DecimalFormat("00000000");
        System.out.println("十进制转换为二进制方法:------------------------------------------");
        String a=Integer.toBinaryString(20);
        int b=Integer.valueOf(a);
        System.out.println("Integer/Long的静态方法toBinaryString(int i):"+df.format(b));
        System.out.println("Integer/Long的静态方法toString(int i,int radix):"+Integer.toString(95,2));
        System.out.println("BigInteger的构造方法BigInteger(String s,int radix)创建对象调用toString():"+(new BigInteger("1011",2)).toString());
        System.out.println("十进制转换为八进制方法:------------------------------------------");
        a=Integer.toOctalString(20);
        b=Integer.valueOf(a);
        System.out.println("Integer/Long的静态方法toOctalString(int i):"+df.format(b));
        System.out.println("Integer/Long的静态方法toString(int i,int radix):"+Integer.toString(95,8));
        System.out.println("BigInteger的构造方法BigInteger(String s,int radix)创建对象调用toString():"+(new BigInteger("7256",8)).toString());
        System.out.println("十进制转换为十六进制方法:------------------------------------------");
        a=Integer.toHexString(20);
        b=Integer.valueOf(a);
        System.out.println("Integer/Long/Float/Double的静态方法toHexString(int i):"+df.format(b));
        System.out.println("Integer/Long的静态方法toString(int i,int radix):"+Integer.toString(95,16));
        System.out.println("BigInteger的构造方法BigInteger(String s,int radix)创建对象调用toString():"+(new BigInteger("9256AD",16)).toString());
        System.out.println("二进制转换为十进制方法:------------------------------------------");
        System.out.println("Byte/Short/Integer/Long的静态方法parse*(String s,int radix):"+Integer.parseInt("1011",2));
        System.out.println("Byte/Short/Integer/Long的静态方法valueOf(String s,int radix):"+Integer.valueOf("1011",2));
        System.out.println("BigInteger的构造方法BigInteger(String s,int radix):"+new BigInteger("1011",2));
        System.out.println("八进制转换为十进制方法:------------------------------------------");
        System.out.println("Byte/Short/Integer/Long的静态方法parse*(String s,int radix):"+Integer.parseInt("75265",8));
        System.out.println("Byte/Short/Integer/Long的静态方法valueOf(String s,int radix):"+Integer.valueOf("75265",8));
        System.out.println("BigInteger的构造方法BigInteger(String s,int radix):"+new BigInteger("75265",8));
        System.out.println("十六进制转换为十进制方法:------------------------------------------");
        System.out.println("Byte/Short/Integer/Long的静态方法parse*(String s,int radix):"+Integer.parseInt("65254D",16));
        System.out.println("Byte/Short/Integer/Long的静态方法valueOf(String s,int radix):"+Integer.valueOf("65254D",16));
        System.out.println("BigInteger的构造方法BigInteger(String s,int radix):"+new BigInteger("65254D",16));
    }
    //主类
    public static void main(String args[]){
        defaultValue();
        valueZone();
        bitNumber();
        baseDataType();
        convertOfBasisAndString();
        convertOfBasis();
        convertScale();
    }
}
