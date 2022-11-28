package com.fubukiss.service;

import com.fubukiss.config.SpringConfig;
import com.fubukiss.dao.AccountDao;
import com.fubukiss.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * FileName: app1
 * Date: 2022/11/28
 * Time: 20:27
 * Author: river
 */
public class app1 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountService bean = ctx.getBean(AccountService.class);

        System.out.println(bean.findById(1));
    }
}
