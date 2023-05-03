package test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest1 {
    /**
     * 线程创建的方法
     */
    public static void createThread(){
        RunnableThread1 t1 = new RunnableThread1("1-----1");
        ParentThread t2 = new ParentThread("2-----2");
        CallableThread1 t3=new CallableThread1();
        FutureTask<Integer> ft=new FutureTask<Integer>(t3);
        t1.start();
        t2.start();
        new Thread(ft,"3------3").start();
        try {
            System.out.println(ft.get());
        } catch (InterruptedException | ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    /**
     * 线程同步（也叫线程安全）
     *
     */
    public static void safeThread(){
        Person person=new Person();
        System.out.println("person地址："+person.hashCode());
        Lock lock = new ReentrantLock();
        for(int i=0;i<1000;i++){
            new ThreadDemo(person,i+"------"+i,lock).start();
        }
        System.out.println(person.getM());
    }
    /**
     * 线程的执行顺序
     * 同一线程内：按顺序执行代码
     * 不同线程开启后，同时执行
     */
    public static void runingOrder(){
        ThreadOrder t1=new ThreadOrder();
        t1.start();
    }
    /**
     * 主方法
     * @param args
     */
    public static void main(String[] args){
        //线程创建方法
        createThread();
        //线程同步情况
        safeThread();
        //线程的执行顺序
        runingOrder();
    }
}
/**
 * 线程执行顺序测试类
 */
class ThreadOrder extends Thread{
    ThreadOrder(){
        super();
    }
    public void run(){
        for (Integer i = 0; i < 10; i++) {
            System.out.println("order:"+i);
            new ParentThread(i+"---"+i).start();
        }
    }
}
class Person{
    private Integer money;
    private Integer mon;
    private Integer m;
    private Integer count;
    private volatile Integer sum;
    private AtomicInteger atomic=new AtomicInteger(0);
    private ThreadLocal<Integer> tLocal=new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue(){
            return 0;
        }
    };
    Person(){
        this.money=0;
        this.mon=0;
        this.m=0;
        this.count=0;
        this.sum=0;
    }
    public synchronized void addMoney(Integer money){
        this.money+=money;
    }
    public void addMon(Integer mon){
        this.mon+=mon;
    }
    public void addM(Integer m){
        this.m+=m;
    }
    public void addCount(Integer count){
        this.count+=count;
    }
    public void addSum(Integer sum){
        this.sum+=sum;
    }
    public void addAtomic(Integer atomic){
        this.atomic.addAndGet(atomic);
    }
    public void addTLocal(Integer t){
        tLocal.set(tLocal.get()+t);
    }
    public Integer getMoney(){
        return this.money;
    }
    public Integer getMon(){
        return this.mon;
    }
    public Integer getM(){
        return this.m;
    }
    public Integer getCount(){
        return this.count;
    }
    public Integer getSum(){
        return this.sum;
    }
    public AtomicInteger getAtomic(){
        return this.atomic;
    }
    public Integer getTlocal(){
        return tLocal.get();
    }
}
/**
 * 线程同步测试类
 */
class ThreadDemo extends Thread{
    private Thread thread;
    private String threadName;
    private Person person;
    private Lock lock;
    ThreadDemo(Person person,String threadName,Lock lock){
        this.person=person;
        this.threadName=threadName;
        this.lock=lock;
    }
    public void run(){
        this.person.addMoney(5);
        if(this.person.getMoney()==5000){
            System.out.println("Synchronized:"+Thread.currentThread().getName()+","+this.person.getMoney());
        }
        this.person.addMon(5);
        if(this.person.getMon()==5000){
            System.out.println("Asynchronous:"+Thread.currentThread().getName()+","+this.person.getMon());
        }
        synchronized (this.person) {
            this.person.addM(5);
            if(this.person.getM()==5000){
                System.out.println("Synchronized{}:"+Thread.currentThread().getName()+","+this.person.getM());
            }
        }
        lock.lock();
        this.person.addCount(5);
        if(this.person.getCount()==5000){
            System.out.println("Lock:"+Thread.currentThread().getName()+","+this.person.getCount());
        }
        lock.unlock();
        this.person.addSum(5);
        if(this.person.getSum()==5000){
            System.out.println("Volatile:"+Thread.currentThread().getName()+","+this.person.getSum());
        }
        this.person.addAtomic(5);
        if(this.person.getAtomic().get()==5000){
            System.out.println("Atomic:"+Thread.currentThread().getName()+","+this.person.getAtomic().get());
        }
        for(int i=0;i<100;i++){
            this.person.addTLocal(5);
            if(this.person.getTlocal()==500){
                System.out.println("ThreadLocal:"+Thread.currentThread().getName()+","+this.person.getTlocal());
            }
        }

    }
    public void start(){
        if(thread==null){
            thread=new Thread(this,threadName);
        }
        thread.start();
    }
}

/**
 * 实现Runnable接口创建线程类
 */
class RunnableThread1 implements Runnable{
    private Thread t;
    private String threadName;
    RunnableThread1(String threadName){
        this.threadName=threadName;
    }
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Runnable:"+Thread.currentThread().getName());
        }
    }
    public void start(){
        if(t==null){
            t=new Thread(this,threadName);
        }
        t.start();
    }
}
/**
 * 继承Thread类创建线程类
 */
class ParentThread extends Thread{
    private Thread t;
    private String threadName;
    ParentThread(String threadName){
        this.threadName=threadName;
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("ParentThread:"+Thread.currentThread().getName());
        }
    }
    public void start(){
        if(t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }
}
/**
 * 通过 Callable 和 Future 创建线程
 */
class CallableThread1 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        for(int i=0;i<10;i++){
            System.out.println("CallableThread："+Thread.currentThread().getName());
        }
        return 0;
    }
}