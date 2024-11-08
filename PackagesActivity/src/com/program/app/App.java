package com.program.app;

import com.program.utils.Helper;
import com.program.model.Person;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        Helper.printPersonInfo(person);
    }
}
