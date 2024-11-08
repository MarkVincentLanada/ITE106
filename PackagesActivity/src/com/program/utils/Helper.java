package com.example.utils;

import com.example.model.Person;

public class Helper {
    public static void printPersonInfo(Person person) {
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
    }
}
