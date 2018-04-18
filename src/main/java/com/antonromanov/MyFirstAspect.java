package com.antonromanov;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Anton on 18.04.2018.
 */
public class MyFirstAspect {
    public void before() {
        System.out.println("Before method is called");
    }

    public void after() {
        System.out.println("After method is called");
    }

    public void afterReturning() {
        System.out.println("After returning method is called");
    }

    public void afterThrowing() {
        System.out.println("After throwing method is called");
    }

    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around method is called");
        System.out.println("Around before is running");
        joinPoint.proceed();
        System.out.println("Around after is running");
    }
}
