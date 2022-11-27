package com.fubukiss.factory;

import com.fubukiss.dao.OrderDao;
import com.fubukiss.dao.impl.OrderDaoImpl;

//静态工厂创建对象
public class OrderDaoFactory {
    public static OrderDao getOrderDao() {
        System.out.println("factory setup....");
        return new OrderDaoImpl();
    }
}
