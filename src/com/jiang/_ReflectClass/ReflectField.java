package com.jiang._ReflectClass;

import java.lang.reflect.Field;

public class ReflectField {
    public static void main(String[] args) throws Exception{
        Class c = Student.class;
        Field field= c.getDeclaredField("age");

        Student student= new Student();

        field.setAccessible(true);
        field.set(student,23);
        int age= (int) field.get(student);
        System.out.println("反射得到的field age为"+age);
    }

}
