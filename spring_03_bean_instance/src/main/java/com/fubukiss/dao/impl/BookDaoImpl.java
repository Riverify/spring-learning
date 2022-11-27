package com.fubukiss.dao.impl;

import com.fubukiss.dao.BookDao;

public class BookDaoImpl implements BookDao {

    public BookDaoImpl() {
        // 构造方法
        System.out.println("book dao private constructor is running ....");
    }

    public void save() {
        System.out.println("book dao save ...");
    }

}
