package com.jiang._ReflectClass;

import java.lang.reflect.Method;

public class ReflectMethod {
    public static void main(String[] args) throws Exception{
        Class c = Student.class;

        Method method=c.getDeclaredMethod("eat", String.class);

        Student student= new Student();
        method.setAccessible(true);

        Object result=method.invoke(student,"KFC");
        System.out.println(result);
    }
}
