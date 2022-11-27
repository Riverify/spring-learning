package com.fubukiss.service;

import com.fubukiss.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * FileName App
 * Date 2022/11/27 09:47
 * Author river
 */
public class App {
    public static void main(String[] args) {
        // 3.获取ioc容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 4.获取bean
//        BookDao bookDao = (BookDao) ac.getBean("bookDao");
//        bookDao.check();
        BookService bookService = (BookService) ac.getBean("bookService");

        bookService.read();

    }
}
