package com.chelu.Thread;

//创建线程三种方法

//实现 Runnable 和 Callable 接口的类只能当做一个可以在线程中运行的任务，
// 不是真正意义上的线程，因此最后还需要通过 Thread 来调用。可以说任务是通过线程驱动从而执行的

//1 继承Thread类
public class Thread1 extends Thread{

    @Override
    public void run() {
//        线程方法体
        super.run();
        for(int i=0;i<=1000;i++)
        System.out.println(i);
    }

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
//        run方法就直接执行，start方法会开新的执行路径
        thread1.start();
        thread1.run();
    }
}

