package com.jiang.character;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String name ="abcd我爱你中国";
        int[] a={1,2,3};

        byte[] bytes= name.getBytes("UTF-8");
        System.out.println(Arrays.toString(bytes));
        System.out.println(Arrays.toString(a));

        String s = new String(bytes);
        System.out.println(s);

        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
    }
}
