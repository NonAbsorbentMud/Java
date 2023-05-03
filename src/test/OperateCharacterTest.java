package test;

import java.text.DecimalFormat;

//运算符
public class OperateCharacterTest {
    //算术符号
    public static void arithmeticSign(){
        System.out.println("算术运算符：---------------------------------------");
        int a=4;
        System.out.println("加法+："+(2+5));
        System.out.println("减法-："+(2-5));
        System.out.println("乘法*+："+(2*5));
        System.out.println("除法+："+(2/5));
        System.out.println("取余%+："+(2%5));
        System.out.println("自增++："+(a++));
        System.out.println("自减--："+(a--));
    }
    //关系运算符
    public static void relationSign(){
        System.out.println("关系运算符：---------------------------------------");
        int a=5,b=5;
        System.out.println("等于==："+(a==b));
        System.out.println("不等于!=："+(a!=b));
        System.out.println("大于>："+(a>b));
        System.out.println("小于<："+(a<b));
        System.out.println("大于等于>=："+(a>=b));
        System.out.println("小于等于："+(a<=b));
    }
    //位运算符
    public static void bitSign(){
        System.out.println("8888对应的二进制码:"+Integer.toBinaryString(8888));
        System.out.println("6666对应的二进制码:"+Integer.toBinaryString(6666));
        System.out.println("位运算符：---------------------------------------");
        System.out.println("---与位运算&（相对位都为1，则为1，否则0）：");
        System.out.println("8888&6666的位运算对应的二进制码:"+Integer.toBinaryString(8888&6666));
        System.out.println("---或位运算|（相对位都为0，则为0，否则1）：");
        System.out.println("8888|6666的位运算对应的二进制码:"+Integer.toBinaryString(8888|6666));
        System.out.println("---异或位运算^（相对位相同，则为0，否则1）：");
        System.out.println("8888^6666的位运算对应的二进制码:"+Integer.toBinaryString(8888^6666));
        System.out.println("---取反位运算~（翻转操作数的每一位，即0变1,1变0）：");
        System.out.println("~6666的位运算对应的二进制码:"+Integer.toBinaryString(~6666));
        System.out.println("---左移位运算<<（向左移指定位数的操作数,即往右边添加指定位数的0）：");
        System.out.println("6666<<8的位运算对应的二进制码:"+Integer.toBinaryString(6666<<8));
        System.out.println("---右移位运算>>（向右移指定位数的操作数,即去掉右边指定的位数）：");
        System.out.println("6666>>8的位运算对应的二进制码:"+Integer.toBinaryString(6666>>8));
        System.out.println("---右移补零位运算>>>（向右移指定位数的操作数,并在空位以零填充,即去掉右边指定的位数）：");
        System.out.println("6666>>>8的位运算对应的二进制码:"+Integer.toBinaryString(6666>>>8));
    }
    //逻辑运算符
    public static void logicSign(){
        System.out.println("逻辑运算符：---------------------------------------");
        System.out.println("---与&&(同时为真才为真)："+(true&&true));
        System.out.println("---或||(只要有一个为真即为真)："+(true||false));
        System.out.println("---非!(逻辑状态取反)："+(!true));
    }
    //赋值运算符
    public static void toValueSign(){
        System.out.println("赋值运算符：---------------------------------------");
        System.out.println("---赋值符号=(直接赋值)：");
        System.out.println("---加和赋值+=：");
        System.out.println("---减和赋值-=：");
        System.out.println("---乘和赋值*=：");
        System.out.println("---除和赋值/=：");
        System.out.println("---取模和赋值%=：");
        System.out.println("---左移位赋值<<=：");
        System.out.println("---右移位赋值>>=：");
        System.out.println("---按位与赋值&=：");
        System.out.println("---按位异或赋值^=：");
        System.out.println("---按位或赋值|=：");
    }
    //条件运算符
    public static void conditionSign(){
        System.out.println("条件运算符：---------------------------------------");
        System.out.println("(boolean flag?v1:v2)："+(true?true:false));
    }
    //其它运算符
    public static void otherSign(){
        System.out.println("instanceof运算符：---------------------------------------");
        System.out.println("对象名/值 instanceof 类型名："+("" instanceof String));
    }
    //常用的转义字符
    public static void transferredSign(){
        System.out.println("常用的转义字符：---------------------------------------");
        System.out.println("---\\ r表示接受键盘输入,相当于按下了回车键：\r");
        System.out.println("---\\ n表示换行：\n");
        System.out.println("---\\ t表示制表符，相当于Table键：\t");
        System.out.println("---\\ b表示退格键，相当于Back Space键：\b");
        System.out.println("---\\\'表示单引号：\'");
        System.out.println("---\\\"表示双引号：\"");
        System.out.println("---\\\\表示一个斜杠：\\");
    }
    public static void main(String args[]){
        arithmeticSign();
        relationSign();
        bitSign();
        logicSign();
        toValueSign();
        conditionSign();
        otherSign();
        transferredSign();
    }
}
