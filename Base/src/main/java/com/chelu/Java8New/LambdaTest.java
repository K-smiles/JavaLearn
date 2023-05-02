package com.chelu.Java8New;

public class LambdaTest {

    public <T> T gett(T t)
    {
        T a= (T) new Object();
        return t;
    }
    public static void main(String[] args) {
         Integer integer =  new LambdaTest().gett(1);
        System.out.println(integer);
    }
}
