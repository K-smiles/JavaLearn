package com.chelu.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello");
        return "hello";
    }
    @RequestMapping("/test")
    public String test(){
        System.out.println("hello");
        return "test";
    }

    @PreAuthorize("hasAnyAuthority('t')")
    @RequestMapping("/auth")
    public String t(){
        System.out.println("hello");
        return "t";
    }
    @PreAuthorize("hasAuthority('t1')")
    @RequestMapping("/t1")
    public String t1(){
        System.out.println("hello");
        return "t1";
    }    @PreAuthorize("hasAnyAuthority('t22')")
    @RequestMapping("/t2")
    public String t2(){
        System.out.println("hello");
        return "t2";
    }

}

