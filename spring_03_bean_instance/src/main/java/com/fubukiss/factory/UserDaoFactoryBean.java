package com.fubukiss.factory;

import com.fubukiss.dao.UserDao;
import com.fubukiss.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

// FactoryBean创建对象
public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    // 代替原始实例工厂中创建对象的方法
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    // UserDao的类型
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    // 是否是单例
    public boolean isSingleton() {
        return true;
    }
}
