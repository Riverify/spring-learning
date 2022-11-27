package com.fubukiss.service.impl;

import com.fubukiss.dao.BookDao;
import com.fubukiss.dao.impl.BookDaoImpl;
import com.fubukiss.service.BookService;

/**
 * FileName BookServiceImpl
 * Date 2022/11/27 09:42
 * Author river
 */
public class BookServiceImpl implements BookService {
    private BookDao bd = new BookDaoImpl();

    public void read() {
        bd.check();
    }
}
