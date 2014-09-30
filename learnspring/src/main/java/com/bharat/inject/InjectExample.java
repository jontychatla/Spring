package com.bharat.inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectExample {

  public static void main(String args[]) {
    ApplicationContext context = new ClassPathXmlApplicationContext("inject.xml");
    DataService bean = (DataService)context.getBean(DataService.class);
    System.out.println(bean.getData());
  }

}
