package com.fubukiss.service.impl;

import com.fubukiss.dao.BookDao;
import com.fubukiss.dao.UserDao;
import com.fubukiss.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private UserDao userDao;

    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();
    }
}
