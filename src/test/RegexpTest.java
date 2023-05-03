package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//正则表达式
public class RegexpTest {
    //典型调用
    public static void typicalTemp(){
        Pattern p=Pattern.compile("[0-9]*");
        Matcher matcher=p.matcher("54682");
        Boolean flag=matcher.matches();
        System.out.println("经典模式：\n1、Pattern p=Pattern.compile(\"[0-9]*\");" +
                "\n2、Matcher matcher=p.matcher(\"54682\");" +
                "\n3、Boolean flag=matcher.matches();" +
                "\n结果输出："+flag);
    }
    //正则表达式的语法
    public static void regexpSyntax(){
        System.out.println("正则语法：---------------------------------------------------------");
        System.out.println("1、Greedy数量词 \n" +
                "X?：X一次或一次也没有 \n" +
                "X*：X零次或多次 \n" +
                "X+：X一次或多次 \n" +
                "X{n}：X恰好 n 次 \n" +
                "X{n,}：X至少 n 次 \n" +
                "X{n,m}：X至少 n 次，但是不超过m次 \n");
        System.out.println("2、边界匹配器 \n" +
                "^：行的开头 \n" +
                "$：行的结尾 \n" +
                "\\b：单词边界 \n" +
                "\\B：非单词边界 \n" +
                "\\A：输入的开头 \n" +
                "\\G：上一个匹配的结尾 \n" +
                "\\Z：输入的结尾，仅用于最后的结束符（如果有的话） \n" +
                "\\z：输入的结尾 \n");
        System.out.println("3、Logical运算符 \n" +
                "XY：X后跟Y \n" +
                "X|Y：X或Y \n" +
                "(X)：X作为捕获组 \n");
        System.out.println("4、预定义字符类 \n" +
                ".：任何字符（与行结束符可能匹配也可能不匹配） \n" +
                "\\d：数字：[0-9] \n" +
                "\\D：非数字： [^0-9] \n" +
                "\\s：空白字符：[ \\t\\n\\x0B\\f\\r] \n" +
                "\\S：非空白字符：[^\\s] \n" +
                "\\w：单词字符：[a-zA-Z_0-9] \n" +
                "\\W：非单词字符：[^\\w] \n");
        System.out.println("5、Back引用 \n" +
                "\\n：匹配第n个捕获组 \n");
        System.out.println("-----------------------------------------------------------------");
    }
    //正则类方法
    public static void regexpClassMethod(){
        Matcher matcher=Pattern.compile("(1)(2)\\1\\2").matcher("12121111212");
        System.out.println("Pattern类方法：-----------------------------------------------");
        System.out.println("---compile(将给定的正则表达式编译到模式中):"+Pattern.compile("123456789").pattern());
        System.out.println("---pattern(返回在其中编译过此模式的正则表达式):"+Pattern.compile("123456789").pattern());
        System.out.println("---toString(返回此模式的字符串表示形式):"+Pattern.compile("123456789").toString());
        System.out.println("---quote(返回指定String的字面值模式String):"+Pattern.quote("123456789"));
        System.out.println("---matches(给定正则表达式并给定输入与其匹配):"+Pattern.matches("([0-9]+)\\1[a-z]","1212d"));
        System.out.println("Matcher类方法：-----------------------------------------------");
        System.out.println("---groupCount(返回此匹配器模式中的捕获组数):"+matcher.groupCount());
        System.out.println("---find(尝试查找与该模式匹配的输入序列的下一个子序列):"+matcher.find());
        System.out.println("---group(返回由以前匹配操作所匹配的输入子序列):"+matcher.group());
        System.out.println("---matches(尝试将整个区域与模式匹配):"+Pattern.compile("(1)(2)\\1\\2").matcher("1212").matches());
        System.out.println("---regionStart(报告此匹配器区域的开始索引):"+Pattern.compile("(1)\\1").matcher("111").regionStart());
        System.out.println("---regionEnd(报告此匹配器区域的结束索引):"+Pattern.compile("(1)\\1").matcher("111").regionEnd());
        System.out.println("---replaceFirst(替换模式与给定替换字符串匹配的输入序列的第一个子序列):"+matcher.replaceFirst("$1$2"));
        System.out.println("---replaceAll(替换模式与给定替换字符串相匹配的输入序列的每个子序列):"+matcher.replaceAll("$1$2"));
        Pattern.compile("(1)\\1").matcher("111").reset();
        System.out.println("---reset(重置匹配器):");
        Pattern.compile("(1)\\1").matcher("111").usePattern(Pattern.compile("1"));
        System.out.println("---usePattern(更改此Matcher用于查找匹配项的Pattern):"+Pattern.compile("(1)\\1").matcher("11").toString());
        System.out.println("---lookingAt(尝试将从区域开头开始的输入序列与该模式匹配):"+Pattern.compile("(1)\\1").matcher("111").lookingAt());
    }
    //主类
    public static void main(String[] args){
        typicalTemp();
        regexpSyntax();
        regexpClassMethod();
    }
}
