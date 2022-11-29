package com.fubukiss.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * FileName: DataAdvice
 * Date: 2022/11/29
 * Time: 10:56
 * Author: river
 */

@Component
@Aspect
public class DataAdvice {

    @Pointcut("execution(boolean com.fubukiss.service.*Service.*(..))")
    private void ptService() {
    }

    @Around("ptService()")
    public Object trimStr(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        for (int i = 0; i < args.length; i++) {
            // 判断这个参数是否是字符串
            if (args[i].getClass().equals(String.class)) {
                args[i] = args[i].toString().trim();
            }
        }

        Object proceed = pjp.proceed(args);

        return proceed;

    }


}
