package com.imransarder.guides.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imransarder.guides.model.Person;

@RestController
public class HomeController {

    @GetMapping("/home")
    public List<Person> home() {

        Person p1 = new Person("Imran Sarder", 33);
        Person p2 = new Person("Irfan Hossain", 8);
        Person p3 = new Person("Umme Umara", 3);

        List<Person> persons = List.of(p1, p2, p3);

        return persons;
    }
}
