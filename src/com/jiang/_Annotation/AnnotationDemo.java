package com.jiang._Annotation;

import javax.xml.namespace.QName;
import java.lang.reflect.Method;

public class AnnotationDemo {
    public static void main(String[] args) throws Exception{
        Class c = School.class;
        if(c.isAnnotationPresent(Student.class)){
            //直接获得注解对象
            Student student1= (Student) c.getAnnotation(Student.class);
            System.out.println("name==>"+student1.name());
            System.out.println("age==>"+student1.age());
        }

        Method method=c.getDeclaredMethod("eat");
        if(method.isAnnotationPresent(Student.class)){
            Student student2= (Student) method.getAnnotation(Student.class);
            System.out.println("name==>"+student2.name());
            System.out.println("age==>"+student2.age());
        }
    }

}



@Student(name="jiangxuzhao",age=23)
class School{
    @Student(name="jiaohuizhou",age=22)
    public void eat(){
        System.out.println("吃饭");
    }
}