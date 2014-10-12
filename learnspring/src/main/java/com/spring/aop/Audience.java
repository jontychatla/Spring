package com.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {

  @Pointcut("execution(* com.spring.aop.Guitarist.play(..))")
  public void play() {

  }

  @Pointcut("execution(* com.spring.aop.Guitarist.chordBroke(..))")
  public void chordBroke() {

  }

  @Pointcut("execution(@com.spring.aop.MyAnnotation * *(..))")
  public void methodAnnotatedWithMyAnnotation() {

  }

  @Before("play()")
  public void before() {
    System.out.println("Before guitar play");
  }

  @After("play()")
  public void clap() {
    System.out.println("Clap clap");
  }

  @Before("methodAnnotatedWithMyAnnotation()")
  public void myAnnotationT() {
    System.out.println("==========called annotation=======");
  }

  @AfterThrowing(pointcut = "methodAnnotatedWithMyAnnotation()", throwing = "e")
  public void myAnnotationThrowException(Exception e) throws Exception {
    System.out.println("==========throwing exception from  myAnnotationThrowException=======");
    throw new Exception(e);
  }

  @AfterThrowing(pointcut = "chordBroke()", throwing = "e")
  public void problem(Exception e) throws Exception {
    System.out.println("Boooooooo");
    throw new Exception(e);
  }

}
