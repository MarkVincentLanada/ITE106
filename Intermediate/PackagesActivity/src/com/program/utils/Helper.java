// part of the 'program' package
package com.program.utils;

// to use/access variables/attributes and methods/functions of the Class 'Person'
import com.program.model.Person;

public class Helper {
    // user-defined method with an argument - 'Person' Class with 'person' variable name which creates a new 'Person' Object that can be accessed using 'person' variablen name
    public static void printPersonInfo(String name, int age) {
        // uses the methods 'getName()' and 'getAge' from 'Person' Class
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
