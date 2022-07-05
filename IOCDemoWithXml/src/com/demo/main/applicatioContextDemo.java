package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.Student;

public class applicatioContextDemo {
	
    public static void main(String[] args) {
		ApplicationContext s = new FileSystemXmlApplicationContext("applicationContent.xml");
		Student s1 = (Student)s.getBean("mybean");
        s1.show();
	}
}
