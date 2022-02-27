package com.jiang.Serialize;

import java.io.*;

public class ObjectInputStreamTest {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\27801\\Desktop\\JavaLearning\\src\\f.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student student = (Student) objectInputStream.readObject();
        System.out.println(student.toString());


    }
}
