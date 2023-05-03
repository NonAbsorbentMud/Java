package test;

import java.math.BigInteger;
import java.util.Arrays;

//排序
public class SortTypeTest {
    /*
        冒泡排序:
        1、从第一个元素开始，比较相邻的两个元素。如果第一个比第二个大，则进行交换。
        2、轮到下一组相邻元素，执行同样的比较操作，再找下一组，直到没有相邻元素可比较为止，此时最后的元素应是最大的数。
        3、除了每次排序得到的最后一个元素，对剩余元素重复以上步骤，直到没有任何一对元素需要比较为止。
    */
    public static void bubbleUpSort(){
        int count=0;
        System.out.println("-------------------------------------------");
        int[] a={5,26,3,46,8,4,62,65,89};
        for(int i=0;i<a.length-1;i++){
            //System.out.println("冒泡排序:"+i+"——"+Arrays.toString(a));
            for(int j=0;j<a.length-i-1;j++){
                count++;
                if(a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("循环次数："+count);
        System.out.println("冒泡排序："+Arrays.toString(a));
        System.out.println("-------------------------------------------");
    }
    /*
        冒泡排序优化：
        假如待排序数组是 2、1、3、4、5 这样的情况，按照上述代码实现，第一次循环即可得出正确结果。但循环并不会停止，而是继续执行，直到结束为止
        为了解决这个问题，我们可以设置一个标志位，用来表示当前次循环是否有交换，如果没有，则说明当前数组已经完全排序。
    */
    public static void bubbleUpSortOptimize(){
        int count=0;
        System.out.println("-------------------------------------------");
        int[] a={5,26,3,46,8,4,62,65,89};
        for(int i=0;i<a.length-1;i++){
            boolean flag=true;
            for(int j=0;j<a.length-i-1;j++){
                count++;
                if(a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    flag=false;
                }
            }
            if(flag){
                break;
            }
        }
        System.out.println("循环次数："+count);
        System.out.println("冒泡排序优化："+Arrays.toString(a));
        System.out.println("-------------------------------------------");
    }
   /*
        冒泡排序优化2：
        比如 3、4、2、1、6、7、8 这个数组，第一次循环后，变为 3、2、1、4、6、7、8 的顺序，我们发现，1 之后的 4 、6、7、8 已经有序了，
        第二次循环就没必要对后面这段再遍历比较。
    */
    public static void bubbleUpSortOptimize2(){
        int count=0;
        System.out.println("-------------------------------------------");
        int[] a={5,26,3,46,8,4,62,65,89};
        int len=a.length-1;
        for(int i=0;i<a.length-1;i++){
            int index=0;
            for(int j=0;j<len;j++){
                count++;
                if(a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    index=j;
                }
            }
            if(index==0){
                break;
            }
            len=index;
        }
        System.out.println("循环次数："+count);
        System.out.println("冒泡排序优化2："+Arrays.toString(a));
        System.out.println("-------------------------------------------");
    }
    /*
        快速排序：
        就是先把待排序的数组拆成左右两个区间，左边都比中间的基准数小，右边都比基准数大。接着左右两边各自再做同样的操作，完成后再拆分再继续，
        一直到各区间只有一个数为止
    */
    public static void quickSort(int[] a,int start,int end){
        if(start<end){
            int s=start;
            int e=end;
            while(s<e){
                sum++;
                if(a[s]>a[e]){
                    int temp=a[s];
                    a[s]=a[e];
                    a[e]=temp;
                    s++;
                }else{
                    e--;
                }
            }
            quickSort(a,start,e);
            quickSort(a,e+1,end);
        }
    }
    private static Integer sum=0;
    public static void quickSortTest(){
        System.out.println("-------------------------------------------");
        int[] a={5,26,3,46,8,4,62,65,89};
        quickSort(a,0,a.length-1);
        System.out.println("循环次数："+sum);
        System.out.println("快速排序："+Arrays.toString(a));
        System.out.println("-------------------------------------------");
    }
    //插入排序
    public static void insertSort(){
        System.out.println("-------------------------------------------");
        int[] a={5,26,3,46,8,4,62,65,89};
        int count=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j>0;j--){
                count++;
                if(a[j-1]>a[j]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
        System.out.println("循环次数："+count);
        System.out.println("插入排序："+Arrays.toString(a));
        System.out.println("-------------------------------------------");
    }
    /*
        选择排序:
        首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，
        然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
    */
    public static void choiceSort(){
        System.out.println("-------------------------------------------");
        int[] a={5,26,3,46,8,4,62,65,89};
        int count=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                count++;
                if(a[i]>a[j]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        System.out.println("循环次数："+count);
        System.out.println("选择排序："+Arrays.toString(a));
        System.out.println("-------------------------------------------");
    }
    //主类
    public static void main(String args[]){
        bubbleUpSort();
        bubbleUpSortOptimize();
        bubbleUpSortOptimize2();
        quickSortTest();
        insertSort();
        choiceSort();
    }
}
