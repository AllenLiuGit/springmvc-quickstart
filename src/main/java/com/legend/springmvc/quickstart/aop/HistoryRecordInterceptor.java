package com.legend.springmvc.quickstart.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Method;

/**
 * Created by allen on 31/03/2017.
 */
@Aspect
@Component
public class HistoryRecordInterceptor {
    /**
     * The Simple Logging Facade for Java(SLF4J)
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(HistoryRecordInterceptor.class);

    /**
     * Pointcut for Request Mapping
     */
    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void pointCut(){
    }

    /**
     * Around
     * @param joinPoint join point
     * @throws Throwable throwable
     * @return Object
     */
    @Around("pointCut()")
    public Object statics(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        LOGGER.info("------------>Method name: {}", method.getName() + "<-----------");
        if (method.isAnnotationPresent(RequestMapping.class)) {
            RequestMapping annotation = method.getAnnotation(RequestMapping.class);
            LOGGER.info("------------>value: {}", annotation.value()[0] + "<---------------");
        }

        return joinPoint.proceed();
    }
}
