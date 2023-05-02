package com.chelu.Thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    private int i = 0;
    public synchronized int add()
    {
        return i++;
    }

    private AtomicInteger ia = new AtomicInteger();
    public  int addA()
    {
        return ia.addAndGet(1);
    }

}
