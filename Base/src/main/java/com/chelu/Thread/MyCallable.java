package com.chelu.Thread;

import java.util.concurrent.Callable;

//与 Runnable 相比，Callable 可以有返回值，返回值通过 FutureTask 进行封装
public class MyCallable implements Callable<Integer> {
    public Integer call() {
        return 123;
    }
}
