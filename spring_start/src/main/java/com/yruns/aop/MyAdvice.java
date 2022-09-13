package com.yruns.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * MyAdvice
 */
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.yruns.dao.BookDao.update())")
    private void pt() {}

    @Pointcut("execution(* com.yruns.dao.BookDao.*(..))")
    private void testSpeedpt() {}

//    @Before("pt()")
    public void method() {
        System.out.println(System.currentTimeMillis() + " AOP");
    }

//    @Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Before method...");
        pjp.proceed();
        System.out.println("After method...");
    }

    @Around("testSpeedpt()")
    public Object testSpeed(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = null;
        for (int i = 0; i < 10000; i++) {
            proceed = pjp.proceed();
        }
        long end = System.currentTimeMillis();

        Signature signature = pjp.getSignature();
        String className = signature.getDeclaringTypeName();
        String methodName = signature.getName();

        System.out.println("万次执行" + className + "." + methodName + "耗时：" + (end - start) + "ms.");
        System.out.println("..." + proceed);
        return proceed;
    }
}
