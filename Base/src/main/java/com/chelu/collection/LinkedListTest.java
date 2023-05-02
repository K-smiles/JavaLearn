package com.chelu.collection;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
            LinkedList<String> sites = new LinkedList<String>();
            sites.add("Google");
            sites.add("Runoob");
            sites.add("Taobao");
            sites.add("Weibo");
            sites.addFirst("Wiki");
            sites.addLast("Wiki");
            sites.removeFirst();
            sites.removeLast();
            System.out.println(sites);

    }
}
