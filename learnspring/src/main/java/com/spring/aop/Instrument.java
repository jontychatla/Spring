package com.spring.aop;

public interface Instrument {

  void play();

  void chordBroke() throws Exception;

  void myAnnotationMethod();

  void myAnnotationMethodThrowingException() throws Exception;

}
