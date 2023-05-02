package com.chelu.generic;

public class ImplInfo<T> implements Info<T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }


    @Override
    public T getVar() {
        return t;
    }
    public <T> T getObject(Class<T> c) throws InstantiationException, IllegalAccessException {
        T t = c.newInstance();;
        return t;
    }
    public static void main(String[] args) {
        ImplInfo<Integer> integerImplInfo = new ImplInfo<>();
        integerImplInfo.setT(1);
        System.out.println(integerImplInfo.getVar());
    }

}
