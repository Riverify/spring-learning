package com.fubukiss.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * FileName: AppForName
 * Date: 2022/11/27
 * Time: 10:28
 * Author: river
 */
public class AppForName {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = (BookService) ctx.getBean("bookService");

        bookService.read();
    }
}
