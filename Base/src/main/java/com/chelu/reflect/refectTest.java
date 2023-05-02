package com.chelu.reflect;

import com.chelu.exception.MyException;
import com.chelu.generic.Info;

public class refectTest {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        System.out.println(MyException.class);
        System.out.println(Info.class);
        System.out.println(new MyException().getCause());
        System.out.println(Class.forName("com.chelu.exception.MyException"));
        Class usClas = MyException.class;
        System.out.println(usClas.getName());
        System.out.println(usClas.getSimpleName());
        System.out.println(usClas.newInstance());
    }
}
