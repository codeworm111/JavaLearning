package com.jiang.overload;

public class overload {
    static void f(int n, int m){
        System.out.println("1");
        return;
    }

    static int f(int n){
        System.out.println("2");
        return 0;
    }

    public static void main(String[] args) {
        f(1,2);
        f(1);
    }
}
