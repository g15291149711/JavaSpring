package com.gxg;

/*
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//切面类
@Aspect
public class MyAspect {
    //这是一个标识Pointcut，该方法不具体的被调用,仅仅是指定一个范围-------哪个包下的哪个类的哪个方法
    //@Pointcut("execution(* add*(..)) || execution(* del*(..))")
    @Pointcut("execution(* *(..))")  //所有方法都执行安全监测方法
    private void allMethod(){}
    //横切关注点
    @Before("allMethod()")  //通知Advice
    public void checkSecurity(){
        System.out.println("===================MyAspct.checkSecurity()==========");
    }
}*/
