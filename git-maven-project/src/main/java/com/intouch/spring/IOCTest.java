package com.intouch.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @Author 西柚
 * @create 2021/5/13 16:56
 */
public class IOCTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Date date = (Date) context.getBean("date");
        System.out.println("当前时间为："+date);
    }
}
