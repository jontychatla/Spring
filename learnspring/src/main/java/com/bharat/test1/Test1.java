package com.bharat.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("test1.xml");
		Foo bean = (Foo)context.getBean("test");
		System.out.println(bean.getName() + " "+bean.getAge());
	}

}
