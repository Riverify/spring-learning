package com.fubukiss.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * FileName: ProjectAdvice
 * Date: 2022/11/28
 * Time: 20:32
 * Author: river
 */
@Component
@Aspect
public class ProjectAdvice {

    @Pointcut("execution(* com.fubukiss.service.*Service.*(..))")
    private void servicePt() {
    }

    @Around("servicePt()")
    public void runSpeed(ProceedingJoinPoint pjp) throws Throwable {

        // 封装了信息
        Signature signature = pjp.getSignature();
        String className = signature.getDeclaringTypeName();
        String methodName = signature.getName();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            pjp.proceed();
        }
        long end = System.currentTimeMillis();

        System.out.println("10k次执行:" + className + "." + methodName + "---->" + (end - start) + "ms");
    }
}
