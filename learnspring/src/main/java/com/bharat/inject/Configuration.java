package com.bharat.inject;

import org.springframework.context.annotation.Bean;

public class Configuration {

 @Bean
 public Person getPerson() {
   return new Person("test", 24);
 }

}
