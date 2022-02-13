package com.jiang.io;

import java.io.*;

public class OutTest {
    public static void main(String[] args) throws Exception {
//        Writer writer= new FileWriter("C:\\Users\\27801\\Desktop\\JavaLearning\\src\\f.txt",true);
//        writer.write("woshishabi");
//        writer.write("\r\n");
//        writer.write(97);
//        writer.flush();
//        writer.close();

        Reader reader = new FileReader("C:\\Users\\27801\\Desktop\\JavaLearning\\src\\f.txt");
        int code;
        while ((code=reader.read())!=-1){
            System.out.println((char)code);
        }
    }
}
