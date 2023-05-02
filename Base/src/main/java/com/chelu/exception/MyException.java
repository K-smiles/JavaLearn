package com.chelu.exception;

public class MyException extends Exception{
    public MyException(){ }
    public MyException(String msg){
        super(msg);
    }

    private static void readFile(String filePath) {
        // code
    }

}
