package com.fubukiss.factory;

import com.fubukiss.dao.UserDao;
import com.fubukiss.dao.impl.UserDaoImpl;

//实例工厂创建对象
public class UserDaoFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
