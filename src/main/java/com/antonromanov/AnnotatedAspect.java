package com.antonromanov;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


/**
 * Created by Anton on 18.04.2018 at 17:27.
 */
@Aspect
public class AnnotatedAspect {

    @Pointcut(
            "execution(* com.antonromanov.TrackOperation*.*(..))")


    public void performance() {
    }
    @Before("performance()")
    public void takeSeats() { // Перед выступлением
        System.out.println("The audience is taking their seats.");
    }

    @Before("performance()") // Перед выступлением
    public void turnOffCellPhones() {
        System.out.println("The audience is turning off their cellphones");
    }
    @AfterReturning("performance()") // После успешного выступления
    public void applaud() {
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
    }
    @AfterThrowing("performance()")
    public void demandRefund() { // После неудачного выступления
        System.out.println("Boo! We want our money back!");
    }


}
