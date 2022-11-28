package com.fubukiss.dao.impl;

import com.fubukiss.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    public String findName(int id, String password) {
        System.out.println("id:" + id);
        return "itcast";
    }
}
