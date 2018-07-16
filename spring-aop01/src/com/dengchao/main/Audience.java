package com.dengchao.main;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {

    @Pointcut("execution(* com.dengchao.main.Performer.perform(..))")
    public void performance() {
    }

    public Audience() {
        System.out.println("Audience");
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("The audience is taking their seats.");
    }

    @Before("performance()")
    public void turnOffCellPhone() {
        System.out.println("The audience is turning off their cellphone");
    }

    @AfterReturning("performance()")
    public void applaud() {
        System.out.println("AfterReturning:CLAP CLAP CLAP CLAP CLAP");
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinpoint) {
        try {
            System.out.println("Around:The audience is taking their seats.");
            System.out.println("Around:The audience is turning off their cellphones");

            long start = System.currentTimeMillis();

            joinpoint.proceed();

            long end = System.currentTimeMillis();

            System.out.println("Around:CLAP CLAP CLAP CLAP CLAP");
            System.out.println("Around:The Performance took " + (end - start)
                    + " milliseconds.");
        } catch (Throwable e) {
            System.out.println("Around exception:Boo! we want our money back!");
        }

    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("AfterThrowing:Boo! We want our money back!");
    }

}
