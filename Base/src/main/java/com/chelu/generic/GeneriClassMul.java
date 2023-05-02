package com.chelu.generic;

public class GeneriClassMul <T,V>{

    private T var;

    private V varT;

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
        GeneriClassMul<Integer,Integer> generiClass = new GeneriClassMul<>();
        generiClass.setVar(123);
        System.out.println(generiClass);
    }
}
