package com.fubukiss.service.impl;

import com.fubukiss.dao.AccountDao;
import com.fubukiss.domain.Account;
import com.fubukiss.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;

    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out, money);
//        int i = 10 / 0;
        accountDao.inMoney(in, money);
    }
}
