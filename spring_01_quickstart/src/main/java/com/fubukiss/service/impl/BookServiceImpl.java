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

    // 5.删除业务层中使用new方式创建的对象
    private BookDao bookDao; // = new BookDaoImpl();

    public void read() {
        bookDao.check();
    }

    // 6.提供对应set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

}
