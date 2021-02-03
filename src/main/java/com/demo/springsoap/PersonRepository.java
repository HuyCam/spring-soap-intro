package com.demo.springsoap;

import io.spring.guides.gs_producing_web_service.Country;
import io.spring.guides.gs_producing_web_service.Person;
import io.spring.guides.gs_producing_web_service.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class PersonRepository {
    private static final Map<String, Person> persons = new HashMap<>();

    @PostConstruct
    public void initData() {
        Person david = new Person();
        david.setAge(25);
        david.setName("David");
        david.setHeight(5);

        persons.put("David", david);

    }

    public Person findPerson(String name) {
        Assert.notNull(name, "The country's name must not be null");
        return persons.get(name);
    }
}
