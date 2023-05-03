package test;

import java.util.Arrays;

//数组:是用来存储固定大小的同类型元素
public class ArrayTest {
    //数组分类
    public static void arrayType(){
        System.out.println("一维数组：-----------------------------");
        int[] a={1, 5, 3, 2, 4};
        System.out.println("---长度length:"+a.length);
        System.out.println("---输出:"+ Arrays.toString(a));
        System.out.println("二维数组：-----------------------------");
        int[][] b={{3,5},{3,8,4,6}};
        System.out.println("---长度length:"+b.length);
        System.out.println("---输出:"+ Arrays.deepToString(b));
        System.out.println("三维数组：-----------------------------");
        int[][][] c={{{2,1},{3,5}},{{5,6},{2,8}}};
        System.out.println("---长度length:"+c.length);
        System.out.println("---输出:"+ Arrays.deepToString(c));
    }
    //数组初始化
    public static void initArray(){
        System.out.println("数组初始化方式：-----------------------------");
        System.out.println("---Type[] var={val,val1,...}：");
        int[] a={1, 5, 3, 2, 4};
        int[][] b={{3,5},{3,8,4,6}};
        int[][][] c={{{2,1},{3,5}},{{5,6},{2,8}}};
        System.out.println("---Type[] var=new Type[]{val,val1,...}：");
        a=new int[]{1, 5, 3, 2, 4};
        b=new int[][]{{3,5},{3,8,4,6}};
        c=new int[][][]{{{2,1},{3,5}},{{5,6},{2,8}}};
        System.out.println("---Type[] var=new Type[length];var[--length]=var;...：");
        a[0]=9;b[0][1]=9;c[1][0][1]=9;
    }
    //Arrays类
    public static void arraysTest(){
        System.out.println("Arrays类的静态方法：-----------------------------");
        int[] a=new int[]{2,5,6,3,8,4,9};
        int[] a1=new int[]{2,5,6,3,8,4,9};
        int[][] b={{3,5},{3,8,4,6}};
        int[][] b1={{3,5},{3,8,4,6}};
        Arrays.sort(a);
        System.out.println("---sort(对指定数组按数字升序进行排序)："+Arrays.toString(a));
        System.out.println("---binarySearch(使用二分搜索法来搜索指定的数组，以获得指定的值)："+Arrays.binarySearch(a,5));
        System.out.println("---copyOf(复制指定的数组，截取或用0/null/false填充)："+Arrays.toString(Arrays.copyOf(a,9)));
        System.out.println("---copyOfRange(将指定数组的指定范围复制到一个新数组)："+Arrays.toString(Arrays.copyOfRange(a,2,3)));
        System.out.println("---deepEquals(如果两个指定数组彼此是深层相等 的，则返回 true)："+Arrays.deepEquals(b1,b));
        System.out.println("---deepToString(返回指定数组深层内容的字符串表示形式)："+Arrays.deepToString(b));
        System.out.println("---toString(返回指定数组内容的字符串表示形式)："+Arrays.toString(a));
        System.out.println("---equals(如果两个相同类型数组彼此相等，则返回true)："+Arrays.equals(a,a1));
        Arrays.fill(a,1);
        System.out.println("---fill(将指定的值分配给指定数组的每个元素)："+Arrays.toString(a));
    }
    //主类
    public static void main(String args[]){
        arrayType();
        initArray();
        arraysTest();
    }
}
