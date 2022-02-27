package com.jiang._ReflectClass;

public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("调用无参构造器");
    }

    private Student(String name, int age) {
        System.out.println("调用有参构造器");
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String eat(String s){
        return "吃"+s;
    }
}
