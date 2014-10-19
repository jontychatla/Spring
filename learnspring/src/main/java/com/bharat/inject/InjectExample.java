package com.bharat.inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectExample {

  public static void main(String args[]) {
    //To inject beans using xml configuration
    //ApplicationContext context = new ClassPathXmlApplicationContext("inject.xml");
    //Inject beans using annotations
    AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(DataServiceImpl.class);
    DataService bean = (DataService)context.getBean(DataService.class);
    System.out.println(bean.getData());
  }

}
