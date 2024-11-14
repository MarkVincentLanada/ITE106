package com.program;

// Import the Person class from the model package
import com.program.model.Person;
// Import the Helper class from the utils package
import com.program.utils.Helper;

public class AccessAll {
    public static void main(String[] args) {
        // Create a new Person object
        Person pogi = new Person("Bong", 25);
        
        // Use the Helper class to print the Person's info
		Helper help = new Helper();
        help.printPersonInfo(pogi.getName(), pogi.getAge());
    }
}
