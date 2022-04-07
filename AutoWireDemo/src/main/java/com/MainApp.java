package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
//        Student student = (Student) applicationContext.getBean("stu");
//        Employee employee = (Employee) applicationContext.getBean("emp");
        Student student= (Student) applicationContext.getBean("stu");
        student.display();

    }
}
