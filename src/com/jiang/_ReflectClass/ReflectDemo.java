package com.jiang._ReflectClass;

public class ReflectDemo{
    public static void main(String[] args) throws Exception {
        //1. Class类中的静态方法
        Class c1 = Class.forName("com.jiang._ReflectClass.Student");
        System.out.println(c1);

        //2. 内存中 类名.class
        Class c2= Student.class;
        System.out.println(c2);

        //3. 运行中 对象.getClass()
        Student s = new Student();
        Class c3 = s.getClass();
        System.out.println(c3);
    }

}
