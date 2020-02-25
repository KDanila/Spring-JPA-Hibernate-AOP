package ru.kdv.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;
import java.util.stream.Stream;

@Aspect
@Component
public class LoggingAspect {
    private Logger logger = Logger.getLogger(getClass().getName());

    @Pointcut("execution(* ru.kdv.controller.*.*(..))")
    private void forControllerPackage() {
    }

    @Pointcut("execution(* ru.kdv.service.*.*(..))")
    private void forServicePackage() {
    }

    @Pointcut("execution(* ru.kdv.dao.*.*(..))")
    private void forDaoPackage() {
    }

    @Pointcut("forControllerPackage()|| forServicePackage()||forDaoPackage()")
    private void forAppFlow() {
    }

    @Before("forAppFlow()")
    private void before(JoinPoint joinPoint) {
        String method = joinPoint.getSignature().toShortString();
        logger.info("=============> in @Before: calling method: " + method);
        Object[] args = joinPoint.getArgs();
        Stream.of(args).forEach(x -> logger.info("argument -> " + x));
    }

    @AfterReturning(pointcut = "forAppFlow()",
            returning = "result")
    private void afterReturning(JoinPoint joinPoint, Object result) {
        String method = joinPoint.getSignature().toShortString();
        logger.info("=============> in @AfterReturning: calling method: " + method);

        logger.info("=======> result: " + result);
    }
}
