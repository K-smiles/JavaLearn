package com.chelu.Thread;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        double ik = Math.random();
        for(int i=0;i<=10;i++)
            System.out.println("tttttttt"+ik);
    }

    public static void main(String[] args) {
            MyRunnable instance = new MyRunnable();
            Thread thread = new Thread(instance);
            thread.start();
        for(int i=0;i<=10000;i++)
            System.out.println("dddddd"+i);

    }
}


