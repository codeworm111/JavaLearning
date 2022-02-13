package com.jiang.File;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo1 {

    public static void main(String[] args) {
        File f = new File("src\\com\\jiang\\File\\f.txt");
        System.out.println(f.length());

        long time= f.lastModified();
        System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time));

        f(5);
    }

    public static void f(int n){

    }
}
