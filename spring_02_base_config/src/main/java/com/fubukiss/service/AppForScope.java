package com.fubukiss.service;

import com.fubukiss.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * FileName: AppForScope
 * Date: 2022/11/27
 * Time: 10:28
 * Author: river
 */
public class AppForScope {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookDao bookDao1 = (BookDao) ctx.getBean("bookDao");
        BookDao bookDao2 = (BookDao) ctx.getBean("bookDao");


        // true 单例 scope="singleton"
        // false 非单例 scope="prototype"
        System.out.println(bookDao1 == bookDao2);
    }
}
