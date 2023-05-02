package com.chelu.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        File file = new File("G:\\自动创建的文件夹\\a.txt");

        // 使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream("b.txt");
        fos.write(97); // 写出第1个字节
        fos.write(98); // 写出第2个字节
        fos.write(99); // 写出第3个字节
        fos.write(99); // 写出第3个字节
        fos.write(99); // 写出第3个字节
        FileInputStream fis = new FileInputStream("b.txt");//read.txt文件中内容为abcde
        // 读取数据，返回一个字节
        int read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        // 读取到末尾,返回-1
        read = fis.read();
        System.out.println( read);
        // 关闭资源
        fis.close();
    }
}
