package com.fubukiss.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    //切入点表达式：
//    @Pointcut("execution(void com.fubukiss.dao.BookDao.update())")
//    @Pointcut("execution(void com.fubukiss.dao.impl.BookDaoImpl.update())")
//    @Pointcut("execution(* com.fubukiss.dao.impl.BookDaoImpl.update(*))")    //no
//    @Pointcut("execution(void com.*.*.*.update())")
//    @Pointcut("execution(* *..*(..))")
//    @Pointcut("execution(* *..*e(..))")
//    @Pointcut("execution(void com..*())")
//    @Pointcut("execution(* com.fubukiss.*.*Service.find*(..))")
    //执行com.fubukiss，参数任意，返回值任意
    @Pointcut("execution(* com.fubukiss.*.*Service.save(..))")
    private void pt() {
    }

    @Before("pt()")
    public void method() {
        System.out.println(System.currentTimeMillis());
    }
}
