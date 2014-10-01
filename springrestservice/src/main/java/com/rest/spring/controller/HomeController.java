package com.rest.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Preconditions;
import com.rest.spring.person.Person;

@RestController
public class HomeController {

  private static List<Person> persons;

  static {
    persons = new ArrayList<Person>();
    for (int i = 0; i < 4; i++) {
      Person p = new Person("Test"+i, (30 + i));
      persons.add(p);
    }
  }

  @RequestMapping("/persons")
  public List<Person> getPersons() {
    return persons;
  }

  @RequestMapping("/person")
  public List<Person> getPersons(@RequestParam("name") String name) {
    Preconditions.checkNotNull(name);
    return findPerson(name);
  }

  private List<Person> findPerson(String name) {
    List<Person> person = new ArrayList<Person>();
    for (Person p : persons) {
      if (name.equals(p.getName())) {
        person.add(p);
      }
    }
    return person;
  }

}
