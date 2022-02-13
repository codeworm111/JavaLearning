package com.jiang.io;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {
        InputStream inputStream= new FileInputStream(new File("C:\\Users\\27801\\Desktop\\JavaLearning\\src\\f.txt"));
//        byte[] bytes= new byte[3];
//        int len;
//        while ((len=inputStream.read(bytes))!=-1){
//            System.out.print(new String(bytes,0,len));
//        }

        byte[] bytes1= inputStream.readAllBytes();
        System.out.println(new String(bytes1));
    }
}
