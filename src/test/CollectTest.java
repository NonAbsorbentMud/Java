package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

/**
 * 1、图Map接口:存储键/值对映射
 *    -| HashMap类：线程不同步 
 *       -| LinkedHashMap类：线程不同步
 *    -| SortedMap接口：继承于 Map，使 Key 保持在升序排列。
 *       -| TreeMap类：线程不同步 
 *    -| 字典Dictionary抽象类：用来存储键/值对
 *       -| HashTable类：线程同步
 *          -| 属性Properties
 *    -| Map.Entry接口：描述在一个Map中的一个元素（键/值对）。是一个 Map 的内部接口。
 * 2、集合Collection接口:存储一个元素集合,存储一组不唯一，无序的对象.
 *    -| List接口:存储一组不唯一，有序（插入顺序）的对象。不会进行升序或降序的排序。
 *       -| ArrayList类：线程不同步
 *       -| LinkedList类：允许有null（空）元素，线程不同步
 *       -| Vector类：线程同步，可以用在多线程的情况，该类允许设置默认的增长长度，默认扩容方式为原来的2倍。
 *       	-| Stack类：实现了一个标准的后进先出的栈
 *    -| Set接口:存储一组唯一，无序的对象
 *       -| HashSet类：线程不同步
 *       -| LinkedHashSet类：线程不同步
 *       -| SortedSet接口：继承于Set保存有序的集合
 *          -| TreeSet类：线程不同步
 *    -| Queue接口
 * 3、迭代器Iterator接口:
 *    -| boolean hasNext();如果仍有元素可以迭代，则返回 true。 
 *    -| E next();返回迭代的下一个元素 
 *    -| void remove();从迭代器指向的 collection 中移除迭代器返回的最后一个元素（可选操作）。 
 * 4、算法Collections:
 * 5、枚举Enumeration接口：
 */
public class CollectTest {
    /**
     *List的遍历方式
     */
    public static void ergodicList(){
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(2);
        //第一种遍历方法使用 For-Each 遍历 List
        for(Integer i:list){
            System.out.println("第一种:"+i);
        }
        //第二种遍历方法使用 For-Each 遍历 List
        for(int i=0;i<list.size();i++){
            System.out.println("第二种："+list.get(i));
        }
        //第三种遍历 使用迭代器进行相关遍历
        Iterator<Integer> iterator=list.iterator();
        while (iterator.hasNext()) {
            System.out.println("第三种："+iterator.next());
        }
    }
    /**
     * Map的遍历方式
     */
    public static void ergodicMap(){
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        map.put(2, 45);
        map.put(3, 56);
        map.put(1, 23);
        map.put(0, 12);
        //第一种：通过Map.keySet遍历key和value，普遍使用，二次取值
        for(Integer key:map.keySet()){
            System.out.println("第一种："+key+"-"+map.get(key));
        }
        //第二种：通过Map.values()遍历所有的value，但不能遍历key
        for(Integer v:map.values()){
            System.out.println("第二种："+v);
        }
        //第三种：通过Map.entrySet使用iterator遍历key和value
        Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry<Integer, Integer> entry = it.next();
            System.out.println("第三种："+entry.getKey()+"-"+entry.getValue());
        }
        //第四种：通过Map.entrySet遍历key和value，推荐，尤其是容量大时
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println("第四种:"+entry.getKey()+"-"+entry.getValue());
        }
    }
    /**
     * Set的遍历方式
     */
    public static void ergodicSet(){
        Set<Integer> set=new HashSet<Integer>();
        set.add(5);
        set.add(2);
        set.add(3);
        set.add(1);
        //第一种：forEach
        for(Integer v:set){
            System.out.println("第一种："+v);
        }
        //第二种：迭代器
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println("第二种："+it.next());
        }
        //第三种：转换成数组进行遍历
        Object[] array = set.toArray();
        for(int i=0;i<array.length;i++){
            System.out.println("第三种："+array[i]);
        }
    }
    /**
     *List的各实现类的排序情况 ---不会自动的进行升序或降序
     */
    public static void listOrder(){
        //List的排序
        List<Integer> listInt=new ArrayList<Integer>();
        listInt.add(2);
        listInt.add(1);
        listInt.add(3);
        System.out.println("List-Integer-ArrayList-Order:"+listInt.toString());
        List<Integer> listInt1=new LinkedList<Integer>();
        listInt1.add(2);
        listInt1.add(1);
        listInt1.add(3);
        System.out.println("List-Integer-LinkedList-Order:"+listInt1.toString());
        List<Integer> listInt2=new Vector<Integer>();
        listInt2.add(2);
        listInt2.add(1);
        listInt2.add(3);
        System.out.println("List-Integer-Vector-Order:"+listInt2.toString());
        //ArrayList的排序
        ArrayList<Integer> arrayListInt=new ArrayList<Integer>();
        arrayListInt.add(2);
        arrayListInt.add(1);
        arrayListInt.add(3);
        System.out.println("ArrayList-Integer-ArrayList-Order:"+arrayListInt.toString());
        //LinkedList的排序
        LinkedList<Integer> linkedListInt=new LinkedList<Integer>();
        linkedListInt.add(2);
        linkedListInt.add(1);
        linkedListInt.add(3);
        System.out.println("LinkedList-Integer-LinkedList-Order:"+linkedListInt.toString());
        Vector<Integer> vector = new Vector<Integer>();
        vector.add(2);
        vector.add(1);
        vector.add(3);
        System.out.println("vector-Integer-vector-Order:"+vector.toString());
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(2);
        stack.add(1);
        stack.add(3);
        System.out.println("stack-Integer-stack-Order:"+stack.toString());
    }
    /**
     * Set的排序情况
     * HashSet\TreeSet:会自动升序排序，是无序的.只针对Byte\Short\Integer\Char\Long这几种数据类型进行升序排序，含null时，null排在首位。
     * LinkedHashSet：不会自动排序，但是是有序的
     */
    public static void setOrder(){
        Set<Integer> setInt=new HashSet<Integer>();
        setInt.add(2);
        setInt.add(1);
        setInt.add(3);
        setInt.add(null);
        System.out.println("Set-Integer-HashSet-Order:"+setInt.toString());
        Set<Integer> setInt1=new LinkedHashSet<Integer>();
        setInt1.add(2);
        setInt1.add(1);
        setInt1.add(3);
        setInt1.add(null);
        System.out.println("Set-Integer-LinkedHashSet-Order:"+setInt1.toString());
        Set<Integer> setInt2=new TreeSet<Integer>();
        setInt2.add(2);
        setInt2.add(1);
        setInt2.add(3);
        System.out.println("Set-Integer-TreeSet-Order:"+setInt2.toString());
        SortedSet<Integer> setInt3=new TreeSet<Integer>();
        setInt3.add(2);
        setInt3.add(1);
        setInt3.add(3);
        System.out.println("SortedSet-Integer-TreeSet-Order:"+setInt3.toString());
        LinkedHashSet<Integer> setInt4=new LinkedHashSet<Integer>();
        setInt4.add(2);
        setInt4.add(1);
        setInt4.add(3);
        setInt4.add(null);
        System.out.println("LinkedHashSet-Integer-LinkedHashSet-Order:"+setInt4.toString());
        TreeSet<Integer> setInt5=new TreeSet<Integer>();
        setInt5.add(2);
        setInt5.add(1);
        setInt5.add(3);
        System.out.println("TreeSet-Integer-TreeSet-Order:"+setInt5.toString());
        HashSet<Integer> setInt6=new HashSet<Integer>();
        setInt6.add(2);
        setInt6.add(1);
        setInt6.add(3);
        setInt6.add(null);
        System.out.println("HashSet-Integer-HashSet-Order:"+setInt6.toString());
        Set<String> setInt7=new HashSet<String>();
        setInt7.add("ads");
        setInt7.add("cde");
        setInt7.add("bas");
        setInt7.add(null);
        System.out.println("Set-String-HashSet-Order:"+setInt7.toString());
        Set<Byte> setInt8=new HashSet<Byte>();
        setInt8.add(Byte.valueOf("2"));
        setInt8.add(Byte.valueOf("1"));
        setInt8.add(Byte.valueOf("3"));
        setInt8.add(null);
        System.out.println("Set-Byte-HashSet-Order:"+setInt8.toString());
        Set<Short> setInt9=new HashSet<Short>();
        setInt9.add(Short.valueOf("2"));
        setInt9.add(Short.valueOf("1"));
        setInt9.add(Short.valueOf("3"));
        setInt9.add(null);
        System.out.println("Set-Short-HashSet-Order:"+setInt9.toString());
        Set<Character> setInt10=new HashSet<Character>();
        setInt10.add('A');
        setInt10.add('C');
        setInt10.add('B');
        setInt10.add(null);
        System.out.println("Set-Character-HashSet-Order:"+setInt10.toString());
        Set<Long> setInt11=new HashSet<Long>();
        setInt11.add(4255L);
        setInt11.add(2500L);
        setInt11.add(3542L);
        setInt11.add(null);
        System.out.println("Set-Long-HashSet-Order:"+setInt11.toString());
        Set<Float> setInt12=new HashSet<Float>();
        setInt12.add(4255f);
        setInt12.add(2500f);
        setInt12.add(3542f);
        setInt12.add(null);
        System.out.println("Set-Float-HashSet-Order:"+setInt12.toString());
        Set<Double> setInt13=new HashSet<Double>();
        setInt13.add(425d);
        setInt13.add(5500d);
        setInt13.add(642d);
        setInt13.add(null);
        System.out.println("Set-Double-HashSet-Order:"+setInt13.toString());
        Set<Integer> setInt14=new HashSet<Integer>();
        setInt14.add(2);
        setInt14.add(1);
        setInt14.add(3);
        setInt14.add(null);
        System.out.println("Set-Integer-Null-HashSet-Order:"+setInt14.toString());
    }
    /**
     * Map的排序情况
     * HashMap\TreeMap:会自动升序排序，是无序的.只针对Byte\Short\Integer\Char\Long这几种数据类型进行升序排序，含null时，null排在首位。
     * HashTable:会自动降序排序，是无序的.只针对Byte\Short\Integer\Char\Long这几种数据类型进行升序排序，含null时，null排在首位。
     * LinkedHashMap：不会自动排序，但是是有序的
     */
    public static void mapOrder(){
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        map.put(2, 45);
        map.put(1, 56);
        map.put(3, 62);
        map.put(null, 62);
        System.out.println("Map-Integer-HashMap-order:"+map.toString().toString());
        Map<Integer,Integer> map1=new LinkedHashMap<Integer, Integer>();
        map1.put(2, 45);
        map1.put(1, 56);
        map1.put(3, 62);
        map1.put(null, 62);
        System.out.println("Map-Integer-LinkedHashMap-order:"+map1.toString().toString());
        Map<Integer,Integer> map2=new TreeMap<Integer, Integer>();
        map2.put(2, 45);
        map2.put(1, 56);
        map2.put(3, 62);
        System.out.println("Map-Integer-TreeMap-order:"+map2.toString().toString());
        Map<Integer,Integer> map3=new Hashtable<Integer, Integer>();
        map3.put(2, 45);
        map3.put(1, 56);
        map3.put(3, 62);
        System.out.println("Map-Integer-Hashtable-order:"+map3.toString().toString());
        Map<String,Integer> map4=new HashMap<String, Integer>();
        map4.put("2", 45);
        map4.put("1", 56);
        map4.put("3", 62);
        map4.put(null, 62);
        System.out.println("Map-String-HashMap-order:"+map4.toString().toString());
        Map<Byte,Integer> map5=new HashMap<Byte, Integer>();
        map5.put(Byte.valueOf("2"), 45);
        map5.put(Byte.valueOf("1"), 56);
        map5.put(Byte.valueOf("3"), 62);
        map5.put(null, 62);
        System.out.println("Map-Byte-HashMap-order:"+map5.toString().toString());
        Map<Short,Integer> map6=new HashMap<Short, Integer>();
        map6.put(Short.valueOf("2"), 45);
        map6.put(Short.valueOf("1"), 56);
        map6.put(Short.valueOf("3"), 62);
        map6.put(null, 62);
        System.out.println("Map-Short-HashMap-order:"+map6.toString().toString());
        Map<Character,Integer> map7=new HashMap<Character, Integer>();
        map7.put('b', 45);
        map7.put('a', 56);
        map7.put('c', 62);
        map7.put(null, 62);
        System.out.println("Map-Character-HashMap-order:"+map7.toString().toString());
        Map<Long,Integer> map8=new HashMap<Long, Integer>();
        map8.put(2L, 45);
        map8.put(1L, 56);
        map8.put(3L, 62);
        map8.put(null, 62);
        System.out.println("Map-Long-HashMap-order:"+map8.toString().toString());
        Map<Float,Integer> map9=new HashMap<Float, Integer>();
        map9.put(2f, 45);
        map9.put(1f, 56);
        map9.put(3f, 62);
        map9.put(null, 62);
        System.out.println("Map-Float-HashMap-order:"+map9.toString().toString());
        Map<Double,Integer> map10=new HashMap<Double, Integer>();
        map10.put(2d, 45);
        map10.put(1d, 56);
        map10.put(3d, 62);
        map10.put(null, 62);
        System.out.println("Map-Double-HashMap-order:"+map10.toString().toString());
        Map<String,Integer> map11=new HashMap<String, Integer>();
        map11.put("aerd", 45);
        map11.put("bsdf", 56);
        map11.put("abc", 62);
        map11.put(null, 62);
        System.out.println("Map-String-HashMap-order:"+map11.toString().toString());
    }
    /**
     * List的值情况
     * ArrayList\LinkedList\Vector\Stack：允许重复值，允许null值
     * E: 泛型数据类型，用于设置 objectName 的数据类型，只能为引用数据类型。
     */
    public static void listValues(){
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(null);
        list.add(null);
        list.add(1);
        list.add(2);
        System.out.println("ArrayList:"+list.toString());
        List<Integer> list1=new LinkedList<Integer>();
        list1.add(1);
        list1.add(null);
        list1.add(null);
        list1.add(1);
        list1.add(2);
        System.out.println("LinkedList:"+list1.toString());
        List<Integer> list2=new Vector<Integer>();
        list2.add(1);
        list2.add(null);
        list2.add(null);
        list2.add(1);
        list2.add(2);
        System.out.println("Vector:"+list2.toString());
        List<Integer> list3=new Stack<Integer>();
        list3.add(1);
        list3.add(null);
        list3.add(null);
        list3.add(1);
        list3.add(2);
        System.out.println("Stack:"+list3.toString());
    }
    /**
     * Set的值情况
     * HashSet\LinkedHashSet:不允许重复，允许为null
     * TreeSet:不允许重复，不允许null
     */
    public static void setValues(){
        Set<Integer> set=new HashSet<Integer>();
        set.add(2);
        set.add(1);
        set.add(null);
        set.add(null);
        set.add(1);
        System.out.println("HashSet:"+set.toString());
        Set<Integer> set1=new LinkedHashSet<Integer>();
        set1.add(2);
        set1.add(1);
        set1.add(null);
        set1.add(null);
        set1.add(1);
        System.out.println("LinkedHashSet:"+set1.toString());
        Set<Integer> set2=new TreeSet<Integer>();
        set2.add(2);
        set2.add(2);
        set2.add(1);
        try{
            set2.add(null);
        }catch(Exception e){
            System.out.println("Tree不允许为Null:"+e.getMessage());
        }
        System.out.println("TreeSet:"+set2.toString());
    }
    /**
     * Map的值情况
     * HashMap\LinkedHashMap:不允许重复key值，允许为null值
     * TreeMap\Hashtable:不允许重复key值，不允许为null值
     */
    public static void mapValues(){
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        map.put(1, 12);
        map.put(1, 23);
        map.put(2, 34);
        map.put(null, 45);
        map.put(null, 65);
        System.out.println("HashMap:"+map.toString().toString());
        Map<Integer,Integer> map1=new LinkedHashMap<Integer, Integer>();
        map1.put(1, 12);
        map1.put(1, 23);
        map1.put(2, 34);
        map1.put(null, 45);
        map1.put(null, 65);
        System.out.println("LinkedHashMap:"+map1.toString().toString());
        Map<Integer,Integer> map2=new TreeMap<Integer, Integer>();
        map2.put(1, 12);
        map2.put(1, 23);
        map2.put(2, 34);
        try{
            map2.put(null, 45);
            map2.put(null, 65);
        }catch(Exception e){
            System.out.println("TreeMap不允许为null:"+e.getMessage());
        }
        System.out.println("TreeMap:"+map2.toString().toString());
        Map<Integer,Integer> map3=new Hashtable<Integer, Integer>();
        map3.put(1, 12);
        map3.put(1, 23);
        map3.put(2, 34);
        try{
            map3.put(null, 45);
            map3.put(null, 65);
        }catch(Exception e){
            System.out.println("Hashtable不允许为null:"+e.getMessage());
        }
        System.out.println("Hashtable:"+map3.toString().toString());
    }
    /**
     * List的线程安全情况
     * 线程安全：即多个线程同时操作同一个对象或资源，
     * ArrayList\LinkedList:非线程安全
     * Vector\Stack:线程安全
     */
    public static void listThread(){
        //设list为多个线程所要操作的共同资源
        //List<String> list=new ArrayList<String>();
        //List<String> list=new LinkedList<String>();
        //List<String> list=new Vector<String>();
        List<String> list=new Stack<String>();
        //list=Collections.synchronizedList(list);
        for(int i=0;i<100;i++){
            new ListThread(list,i+"----"+i).start();
        }
    }
    /**
     * Set的线程安全情况
     * HashSet\LinkedHashSet\TreeSet:非线程安全
     */
    public static void setThread(){
        //Set<String> set=new HashSet<String>();
        //Set<String> set=new LinkedHashSet<String>();
        Set<String> set=new TreeSet<String>();
        set=Collections.synchronizedSet(set);
        for(int i=0;i<100;i++){
            new SetThread(set,i+"-----"+i).start();
        }
    }
    /**
     * Map的线程安全情况
     * HashMap\LinkedHashMap\TreeMap:非线程安全
     * Hashtable:线程安全
     */
    public static void mapThread(){
        //Map<Integer, String> map=new HashMap<Integer, String>();
        //Map<Integer, String> map=new LinkedHashMap<Integer, String>();
        //Map<Integer, String> map=new TreeMap<Integer, String>();
        Map<Integer, String> map=new Hashtable<Integer, String>();
        //map=Collections.synchronizedMap(map);
        for(int i=0;i<100;i++){
            new MapThread(map, i+"---"+i, i).start();
        }
    }
    /**
     * List的操作
     * ArrayList\LinkedList\Vector\Stack:
     *  boolean add(E e);向列表的尾部添加指定的元素（可选操作）。
     *  void add(int index, E element);在列表的指定位置插入指定元素（可选操作）。
     *  boolean addAll(Collection<? extends E> c);添加指定 collection 中的所有元素到此列表的结尾，顺序是指定 collection 的迭代器返回这些元素的顺序（可选操作）。
     *  void clear();从列表中移除所有元素（可选操作）。
     *  E get(int index);返回列表中指定位置的元素。
     *  int indexOf(Object o);返回此列表中第一次出现的指定元素的索引；如果此列表不包含该元素，则返回 -1。
     *  Iterator<E> iterator();返回按适当顺序在列表的元素上进行迭代的迭代器。
     *  int lastIndexOf(Object o);返回此列表中最后出现的指定元素的索引；如果列表不包含此元素，则返回 -1。
     *  E remove(int index);移除列表中指定位置的元素（可选操作）。
     *  boolean remove(Object o);从此列表中移除第一次出现的指定元素（如果存在）（可选操作）。
     *  E set(int index, E element);用指定元素替换列表中指定位置的元素（可选操作）。
     *  int size();返回列表中的元素数。
     *  List<E> subList(int fromIndex, int toIndex);返回列表中指定的 fromIndex（包括 ）和 toIndex（不包括）之间的部分视图。
     *  Object[] toArray();返回按适当顺序包含列表中的所有元素的数组（从第一个元素到最后一个元素）。
     *  boolean isEmpty();如果列表不包含元素，则返回 true。
     *  boolean contains(Object o);如果列表包含指定的元素，则返回 true。
     *  boolean equals(Object o);比较指定的对象与列表是否相等。
     * Collections类：
     *  static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll);根据元素的自然顺序，返回给定 collection 的最大元素。
     *  static <T extends Object & Comparable<? super T>> T min(Collection<? extends T> coll);根据元素的自然顺序 返回给定 collection 的最小元素。
     *  static void reverse(List<?> list);反转指定列表中元素的顺序。
     *  static <T extends Comparable<? super T>> void sort(List<T> list);根据元素的自然顺序 对指定列表按升序进行排序。
     *  static void swap(List<?> list, int i, int j);在指定列表的指定位置处交换元素。
     * LinkedList:
     *  void addFirst(E e);将指定元素插入此列表的开头。
     *  void addLast(E e);将指定元素添加到此列表的结尾。
     *  E element();获取但不移除此列表的头（第一个元素）。
     *  E getFirst();返回此列表的第一个元素。
     *  E getLast();返回此列表的最后一个元素。
     *  boolean offer(E e);将指定元素添加到此列表的末尾（最后一个元素）。
     *  boolean offerFirst(E e);在此列表的开头插入指定的元素。
     *  boolean offerLast(E e);在此列表末尾插入指定的元素。
     *  E peek();获取但不移除此列表的头（第一个元素）。
     *  E peekFirst();获取但不移除此列表的第一个元素；如果此列表为空，则返回 null。
     *  E peekLast();获取但不移除此列表的最后一个元素；如果此列表为空，则返回 null。
     *  E poll();获取并移除此列表的头（第一个元素）
     *  E pollFirst();获取并移除此列表的第一个元素；如果此列表为空，则返回 null。
     *  E pollLast();获取并移除此列表的最后一个元素；如果此列表为空，则返回 null。
     *  E pop();从此列表所表示的堆栈处弹出一个元素。
     *  void push(E e);将元素推入此列表所表示的堆栈。
     * Vector：
     *  void addElement(E obj);将指定的组件添加到此向量的末尾，将其大小增加 1。
     *  int capacity();返回此向量的当前容量。
     *  E elementAt(int index);返回指定索引处的组件。
     *  E firstElement();返回此向量的第一个组件（位于索引 0) 处的项）。
     *  void insertElementAt(E obj, int index);将指定对象作为此向量中的组件插入到指定的 index 处。
     *  E lastElement();返回此向量的最后一个组件。
     *  void setElementAt(E obj, int index);将此向量指定 index 处的组件设置为指定的对象。
     *  void setSize(int newSize);设置此向量的大小。
     * Stack：
     *  boolean empty();测试堆栈是否为空。
     *  E peek();查看堆栈顶部的对象，但不从堆栈中移除它。
     *  E pop();移除堆栈顶部的对象，并作为此函数的值返回该对象。
     *  E push(E item);把项压入堆栈顶部。
     *  int search(Object o);返回对象在堆栈中的位置，以 1 为基数。
     *
     */
    public static void listOperate(){
        List<Integer> list=new ArrayList<Integer>();
        list.add(0);
        list.add(2);
        list.add(1);
        System.out.println("添加："+list.toString());
        list.add(0,1);
        System.out.println("指定位置添加："+list.toString());
        list.addAll(list);
        System.out.println("添加集合："+list.toString());
        list.set(1, 3);
        System.out.println("修改："+list.toString());
        int i=list.get(0);
        System.out.println("访问："+i);
        list.remove(0);
        System.out.println("删除："+list.toString());
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer arg0, Integer arg1) {
                return arg0-arg1;
            }
        });
        System.out.println("List的排序："+list.toString());
        Collections.sort(list);
        System.out.println("Collections的排序："+list.toString());
        Collections.reverse(list);
        System.out.println("Collections的反转排序："+list.toString());

        int max=Collections.max(list);
        System.out.println("最大值："+max);
        int min=Collections.min(list);
        System.out.println("最小值："+min);
        int index=list.indexOf(2);
        System.out.println("指定值第一次出现的下标："+index);
        index=list.lastIndexOf(2);
        System.out.println("指定值最后一次出现的下标："+index);
        list=list.subList(min, max);
        System.out.println("截取列表："+list.toString());
        list.clear();
        System.out.println("清空列表："+list.toString());
    }
    /**
     * Set的操作
     * HashSet\LinkedHashSet\TreeSet:
     *  boolean add(E e);如果 set 中尚未存在指定的元素，则添加此元素（可选操作）。
     *  boolean addAll(Collection<? extends E> c);如果 set 中没有指定 collection 中的所有元素，则将其添加到此 set 中（可选操作）。
     *  void clear();移除此 set 中的所有元素（可选操作）。
     *  boolean contains(Object o);如果 set 包含指定的元素，则返回 true。
     *  boolean equals(Object o);比较指定对象与此 set 的相等性。
     *  boolean isEmpty();如果 set 不包含元素，则返回 true。
     *  Iterator<E> iterator();返回在此 set 中的元素上进行迭代的迭代器。
     *  boolean remove(Object o);如果 set 中存在指定的元素，则将其移除（可选操作）。
     *  Object[] toArray();返回一个包含 set 中所有元素的数组。
     *  <T> T[] toArray(T[] a);返回一个包含此 set 中所有元素的数组；返回数组的运行时类型是指定数组的类型。
     *  int size();返回此 set 中的元素的数量（set 的容量）。
     * TreeSet类：
     *  Iterator<E> descendingIterator();返回在此 set 元素上按降序进行迭代的迭代器。
     *  E first();返回此 set 中当前第一个（最低）元素。
     *  E floor(E e);返回此 set 中小于等于给定元素的最大元素；如果不存在这样的元素，则返回 null
     *  E ceiling(E e);返回此 set 中大于等于给定元素的最小元素；如果不存在这样的元素，则返回 null。
     *  E last();返回此 set 中当前最后一个（最高）元素。
     *  E lower(E e);返回此 set 中严格小于给定元素的最大元素；如果不存在这样的元素，则返回 null
     *  SortedSet<E> subSet(E fromElement, E toElement);返回此 set 的部分视图，其元素从 fromElement（包括）到 toElement（不包括）。
     *  SortedSet<E> tailSet(E fromElement);返回此 set 的部分视图，其元素大于等于 fromElement。
     *  E pollLast();获取并移除最后一个（最高）元素；如果此 set 为空，则返回 null。
     *  E pollFirst();获取并移除第一个（最低）元素；如果此 set 为空，则返回 null。
     *
     */
    public static void setOperate(){
        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(0);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(4);
        System.out.println("添加："+set.toString());
        set.addAll(set);
        System.out.println("添加列表："+set.toString());
        Integer first=set.first();
        System.out.println("第一个元素："+first);
        Integer last=set.last();
        System.out.println("最后一个元素："+last);
        Integer floor=set.floor(2);
        System.out.println("比给定值小的最大值："+floor);
        Integer ceiling=set.ceiling(2);
        System.out.println("比给定值大的最小值："+ceiling);
        first=set.pollFirst();
        System.out.println("获取第一个（最低）元素并移除："+first+","+set.toString());
        last=set.pollLast();
        System.out.println("获取最后一个（最高）元素并移除："+last+","+set.toString());
        set.remove(0);
        System.out.println("删除："+set.toString());
        set.clear();
        System.out.println("清空："+set.toString());
    }
    /**
     * Map的操作
     * HashMap\LinkedHashMap\TreeMap\Hashtable:
     *  void clear();从此映射中移除所有映射关系（可选操作）。
     *  V get(Object key);返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。
     *  Set<K> keySet();返回此映射中包含的键的 Set 视图。
     *  V put(K key, V value);将指定的值与此映射中的指定键关联（可选操作）。
     *  void putAll(Map<? extends K,? extends V> m);从指定映射中将所有映射关系复制到此映射中（可选操作）。
     *  V remove(Object key);如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。
     *  Collection<V> values();返回此映射中包含的值的 Collection 视图。
     *  Set<Map.Entry<K,V>> entrySet();返回此映射中包含的映射关系的 Set 视图。
     *  boolean containsKey(Object key);如果此映射包含指定键的映射关系，则返回 true。
     *  boolean containsValue(Object value);如果此映射将一个或多个键映射到指定值，则返回 true。
     * TreeSet:
     *  Map.Entry<K,V> ceilingEntry(K key);返回一个键-值映射关系，它与大于等于给定键的最小键关联；如果不存在这样的键，则返回 null。
     *  K ceilingKey(K key);返回大于等于给定键的最小键；如果不存在这样的键，则返回 null。
     *  Map.Entry<K,V> firstEntry();返回一个与此映射中的最小键关联的键-值映射关系；如果映射为空，则返回 null。
     *  K firstKey();返回此映射中当前第一个（最低）键。
     *  Map.Entry<K,V> floorEntry(K key);返回一个键-值映射关系，它与小于等于给定键的最大键关联；如果不存在这样的键，则返回 null。
     *  K floorKey(K key);返回小于等于给定键的最大键；如果不存在这样的键，则返回 null。
     *  SortedMap<K,V> headMap(K toKey);返回此映射的部分视图，其键值严格小于 toKey。
     *  Map.Entry<K,V> lastEntry();返回与此映射中的最大键关联的键-值映射关系；如果映射为空，则返回 null。
     *  K lastKey();返回映射中当前最后一个（最高）键。
     *  Map.Entry<K,V> pollFirstEntry();移除并返回与此映射中的最小键关联的键-值映射关系；如果映射为空，则返回 null。
     *  Map.Entry<K,V> pollLastEntry();移除并返回与此映射中的最大键关联的键-值映射关系；如果映射为空，则返回 null。
     *  SortedMap<K,V> subMap(K fromKey, K toKey);返回此映射的部分视图，其键值的范围从 fromKey（包括）到 toKey（不包括）。
     *  SortedMap<K,V> tailMap(K fromKey);返回此映射的部分视图，其键大于等于 fromKey。
     * Hashtable:
     *  Enumeration<V> elements();返回此哈希表中的值的枚举。
     *  Enumeration<K> keys();返回此哈希表中的键的枚举。
     *  protected  void rehash();增加此哈希表的容量并在内部对其进行重组，以便更有效地容纳和访问其元素。
     */
    public static void mapOperate(){
        TreeMap<Integer, Integer> map=new TreeMap<Integer, Integer>();
        map.put(1, 12);
        map.put(0, 23);
        map.put(3, 26);
        System.out.println("添加："+map.toString().toString());
        Integer value=map.get(2);
        System.out.println("指定Key的值："+value);
        Integer key = map.ceilingKey(2);
        System.out.println("比给定值大的最小键的值："+key);
        Entry<Integer, Integer> entry = map.ceilingEntry(2);
        System.out.println("比给定值大的最小键的关联映射对象："+entry.getKey()+","+entry.getValue());
        key = map.floorKey(2);
        System.out.println("比给定值小的最大键的值："+key);
        entry=map.floorEntry(2);
        System.out.println("比给定值小的最大键的关联映射对象："+entry.getKey()+","+entry.getValue());
        key=map.firstKey();
        System.out.println("第一个或最低键的值："+key);
        entry=map.firstEntry();
        System.out.println("第一个或最低键的关联映射对象："+entry.getKey()+","+entry.getValue());
        key=map.lastKey();
        System.out.println("最后一个或最高键的值："+key);
        entry=map.lastEntry();
        System.out.println("最后一个或最高键的关联映射对象："+entry.getKey()+","+entry.getValue());
        SortedMap<Integer, Integer> subMap = map.headMap(2);
        System.out.println("比给定值小的所有键值对对象："+subMap.toString().toString());
        subMap=map.tailMap(2);
        System.out.println("比给定值大的所有键值对对象："+subMap.toString().toString());
        subMap=map.subMap(1, 3);
        System.out.println("截取的键值对对象："+subMap.toString().toString());
        entry=map.pollFirstEntry();
        System.out.println("移除第一个或最低键的关联映射对象："+entry.getKey()+","+entry.getValue()+","+map.toString().toString());
        entry=map.pollLastEntry();
        System.out.println("移除最后一个或最高键的关联映射对象："+entry.getKey()+","+entry.getValue()+","+map.toString().toString());
        value=map.remove(1);
        System.out.println("删除key的值："+value+","+map.toString().toString());
        map.clear();
        System.out.println("清空："+map.toString().toString());
    }
    /**
     * 主方法
     * @param args
     */
    public static void main(String[] args){
        //List的遍历方式
        //ergodicList();
        //Set的遍历方式
        //ergodicSet();
        //Map的遍历方式
        //ergodicMap();
        //List的排序情况
        //listOrder();
        //Set的排序情况
        //setOrder();
        //map的排序情况
        //mapOrder();
        //List的值情况
        //listValues();
        //Set的值情况
        //setValues();
        //map的值情况
        //mapValues();
        //List的线程安全情况
        //listThread();
        //Set的线程安全情况
        //setThread();
        //Map的线程安全情况
        //mapThread();
        //List的操作
        listOperate();
        //Set的操作
        //setOperate();
        //Map的操作
        //mapOperate();
    }
}
class MapThread extends Thread{
    private Map<Integer, String> map;
    private String threadName;
    private Integer key;
    MapThread(Map<Integer, String> map,String threadName,Integer key){
        this.map=map;
        this.threadName=threadName;
        this.key=key;
    }
    public void run() {
        map.put(key, threadName);
        if(map.size()==100){
            System.out.println(map.toString().toString());
            System.out.println(threadName+"---"+map.size());
        }
    };
}
class SetThread extends Thread{
    private Set<String> set;
    private String threadName;
    SetThread(Set<String> set,String threadName){
        this.set=set;
        this.threadName=threadName;
    }
    public void run() {
        set.add(Thread.currentThread().getName());
        if(set.size()==100){
            System.out.println(set.toString());
            System.out.println(Thread.currentThread().getName()+"---"+set.size());
        }
    }
}
class ListThread extends Thread{
    List<String> list;
    ListThread(List<String> list,String threadName){
        super(threadName);
        this.list=list;
    }
    @Override
    public void run() {
        list.add(Thread.currentThread().getName());
        if(list.size()==100){
            System.out.println(list.toString());
            System.out.println(Thread.currentThread().getName()+"---"+list.size());
        }
    }
}
