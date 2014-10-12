package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopExample {

  public static void main(String[] args) throws Exception {
    ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
    Instrument instrument = (Instrument)context.getBean("guitarist");
    instrument.play();
    //instrument.chordBroke();
    instrument.myAnnotationMethod();
    instrument.myAnnotationMethodThrowingException();
  }

}
