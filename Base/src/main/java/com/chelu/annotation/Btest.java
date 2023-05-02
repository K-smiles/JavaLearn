package com.chelu.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Btest extends Atest{
    @Override
    public void test() {
        super.test();
    }

    @MyAnnotation(title = "name",age = 12)
    public void testan()
    {

    }

    public static void main(String[] args) throws ClassNotFoundException {
        Method[] methods = Btest.class.getClassLoader().loadClass("com.chelu.annotation.Btest").getMethods();
        for(Method method : methods)
        {
            for (Annotation anno : method.getDeclaredAnnotations()) {
                System.out.println("Annotation in Method '"
                        + method + "' : " + anno);
            }

        }
    }
}
