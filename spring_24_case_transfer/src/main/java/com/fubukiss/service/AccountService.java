package com.fubukiss.service;


import org.springframework.transaction.annotation.Transactional;

// 开事务
@Transactional
public interface AccountService {


    void transfer(String out, String in, Double money);
}
