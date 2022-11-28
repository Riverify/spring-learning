package com.fubukiss.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.fubukiss.dao.BookDao.update())")
    private void pt() {
    }

    @Pointcut("execution(int com.fubukiss.dao.BookDao.select())")
    private void pt2() {
    }

    //@Before：前置通知，在原始方法运行之前执行
//    @Before("pt()")
    public void before() {
        System.out.println("before advice ...");
    }

    //@After：后置通知，在原始方法运行之后执行
//    @After("pt2()")
    public void after() {
        System.out.println("after advice ...");
    }

    //@Around：环绕通知，在原始方法运行的前后执行
    @Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice ...");
        //表示对原始操作的调用
        pjp.proceed();
        System.out.println("around after advice　...");
    }

    @Around("pt2()")
    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice ...");
        //表示对原始操作的调用,返回值是有返回值方法得到的返回值，需要return出去
        Object proceed = pjp.proceed();
        System.out.println("around after advice　...");

        return proceed;
    }

    // 只有在方法成功运行后执行
    @AfterReturning("pt2()")
    public void afterReturning() {
        System.out.println("afterReturning");
    }

    // 只有抛异常才会执行
    @AfterThrowing("pt2()")
    public void afterThrowing() {
        System.out.println("after throwing");
    }

}
