package com.fubukiss.service;


import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

// 开事务
public interface AccountService {

    @Transactional(rollbackFor = {IOException.class})
        // IOException won't roll back by default
    void transfer(String out, String in, Double money) throws IOException;

}
