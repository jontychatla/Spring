package com.bharat.inject;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class DataServiceImpl implements DataService {

  @Inject
  private Person foo;

  public Person getData() {
    return foo;
  }

}
