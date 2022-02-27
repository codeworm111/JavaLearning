package com.jiang._ReflectClass;

import java.lang.reflect.Constructor;

public class ReflectConstructor {
    public static void main(String[] args) throws Exception {
        Class s = Student.class;
        Constructor constructor = s.getDeclaredConstructor();
        System.out.println(constructor.getName()+"===>"+constructor.getParameterCount());

        Student student= (Student) constructor.newInstance();
        System.out.println(student);

        Constructor constructor1= s.getDeclaredConstructor(String.class,int.class);
        System.out.println(constructor1.getName()+"===>"+constructor1.getParameterCount());

        constructor1.setAccessible(true);
        Student student1= (Student) constructor1.newInstance("蒋旭钊",23);
        System.out.println(student1);
    }
}
