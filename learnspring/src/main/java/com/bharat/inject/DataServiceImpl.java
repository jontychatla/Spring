package com.bharat.inject;

import javax.inject.Inject;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
@Import(ApplicationConfig.class)
public class DataServiceImpl implements DataService {

  @Inject
  private Person person;

  public Person getData() {
    return person;
  }

}
