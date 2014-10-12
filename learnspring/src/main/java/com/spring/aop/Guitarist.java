package com.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Guitarist implements Instrument {

  public void play() {
    System.out.println("playing guitar");
  }

  public void chordBroke() {
    throw new RuntimeException("Chrod broke");
  }

  @MyAnnotation
  public void myAnnotationMethod() {
    System.out.println("Annotated method called");
  }

  @MyAnnotation
  public void myAnnotationMethodThrowingException() {
    throw new RuntimeException("Throwing exception from myannotation method");
  }

}
