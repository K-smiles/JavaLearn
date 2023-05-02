package com.chelu.generic;

public class GeneriClass <T>{

    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    @Override
    public String toString() {
        System.out.println(var);
        return super.toString();
    }

    public static void main(String[] args) {
        GeneriClass<Integer> generiClass = new GeneriClass<Integer>();
        generiClass.setVar(123);
        System.out.println(generiClass);
    }
}
