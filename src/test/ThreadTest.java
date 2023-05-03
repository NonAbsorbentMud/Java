package test;

import java.util.concurrent.Callable;

/*
线程：一条线程指的是进程中一个单一顺序的控制流，一个进程中可以并发多个线程，每条线程并行执行不同的任务。
进程：一个进程包括由操作系统分配的内存空间，包含一个或多个线程。
    一个线程不能独立的存在，它必须是进程的一部分。
    一个进程一直运行，直到所有的非守护线程都结束运行后才能结束。
*/
public class ThreadTest {
    //线程创建方式
    public static void createThreadTest() throws Exception {
        System.out.println("线程创建方式:--------------------------------------------------");
        System.out.println("1、通过实现Runnable接口：必须定义一个称为run的无参数方法");
        RunnableThread runnableThread=new RunnableThread();
        runnableThread.run();
        System.out.println("2、通过继承Thread类：");
        CreateThread createThread=new CreateThread();
        createThread.run();
        System.out.println("3、通过实现Callable和Future接口：");
        CallableThread callableThread=new CallableThread();
        callableThread.call();
    }
    //Thread类
    public static void threadClassTest() throws InterruptedException {
        System.out.println("Thread类构造：----------------------------------------------------");
        Thread thread = new Thread();
        System.out.println("空参构造：Thread()");
        Thread thread1 = new Thread("thread1");
        System.out.println("线程名称参数构造：Thread(String name)");
        System.out.println("Thread类静态方法：----------------------------------------------------");
        System.out.println("currentThread(返回对当前正在执行的线程对象的引用):"+Thread.currentThread().getName());
        System.out.println("activeCount(返回当前线程的线程组中活动线程的数目):"+Thread.activeCount());
        System.out.println("interrupted(测试当前线程是否已经中断):"+Thread.interrupted());
        Thread.dumpStack();
        System.out.println("dumpStack(将当前线程的堆栈跟踪打印至标准错误流):");
        Thread.sleep(500);
        System.out.println("sleep(在指定的毫秒数内让当前正在执行的线程休眠,暂停执行):");
        Thread.yield();
        System.out.println("yield(暂停当前正在执行的线程对象，并执行其他线程):");
        System.out.println("Thread类方法：----------------------------------------------------");
        System.out.println("getId(返回该线程的标识符):"+thread.getId()+"——"+thread1.getId());
        System.out.println("getName(返回该线程的名称):"+thread.getName()+"——"+thread1.getName());
        System.out.println("getPriority(返回线程的优先级):"+thread.getPriority()+"——"+thread1.getPriority());
        System.out.println("getState(返回该线程的状态):"+thread.getState()+"——"+thread1.getState());
        System.out.println("getThreadGroup(返回该线程所属的线程组):"+thread.getThreadGroup()+"——"+thread1.getThreadGroup());
        thread.interrupt();
        System.out.println("interrupt(中断线程):");
        System.out.println("isAlive(测试线程是否处于活动状态):"+thread.isAlive()+"——"+thread1.isAlive());
        System.out.println("isDaemon(测试该线程是否为守护线程):"+thread.isDaemon()+"——"+thread1.isDaemon());
        System.out.println("isInterrupted(测试线程是否已经中断):"+thread.isInterrupted()+"——"+thread1.isInterrupted());
        thread.join();
        System.out.println("join(等待该线程终止):");
        thread.start();
        System.out.println("start(使该线程开始执行):");
        System.out.println("run(运行线程对象):");
        System.out.println("wait(暂停执行，等待指定时间或被唤醒才继续执行):");
        System.out.println("notify(唤醒在此对象监视器上等待的单个线程):");
        System.out.println("notifyAll(唤醒在此对象监视器上等待的所有线程):");
    }
    //主类
    public static void main(String[] args) throws Exception {
        createThreadTest();
        threadClassTest();
    }
}
//通过实现Runnable接口：必须定义一个称为run的无参数方法
class RunnableThread implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("RunnableThread:"+i);
        }
    }
}
//通过继承Thread类
class CreateThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("CreateThread:"+i);
        }
    }
}
//通过实现Callable和Future接口
class CallableThread implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        for(int i=0;i<10;i++){
            System.out.println("CallableThread:"+i);
        }
        return 0;
    }
}