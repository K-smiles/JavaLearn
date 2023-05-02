package com.chelu.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

    List<Integer> test = new ArrayList<Integer>();

    public void add()
    {
        test.add(1);
        test.add(2);
    }

    public void get()
    {
        test.get(0);
        test.get(1);
    }

    public void set()
    {
        test.set(0,1);
        test.set(1,2);
    }
    public void remove()
    {
        test.remove(2);
    }
    public void iter()
    {
//        rewrite compare method
        Collections.sort(test);
        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));
        }
        for (Integer i : test) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {

    }
}
