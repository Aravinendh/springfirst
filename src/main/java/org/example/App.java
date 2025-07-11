package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources.xml");
        Student s = (Student) context.getBean("st");
        s.internshipProgram();
        Marks m = (Marks) context.getBean("ma");
        m.studentmarks();
        Details d = (Details) context.getBean("de");
        d.student_details();
    }
}