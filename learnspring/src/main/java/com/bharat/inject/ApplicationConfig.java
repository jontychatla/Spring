package com.bharat.inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

  @Bean
  public Person getPerson() {
    return new Person("test", 26, getAddress());
  }

  @Bean
  public Address getAddress() {
    return new Address("my address");
  }

}
