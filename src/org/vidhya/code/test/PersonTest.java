package org.vidhya.code.test;

import org.vidhya.code.classes.Person;
import org.vidhya.code.classes.Student;

/**
 * Created by vidhy on 6/22/2017.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person a = new Student("Alex",10,"Student","M", "K", "easy");
        Student b = new Student("Alexa",10,"Student","F", "K", "easy");

        System.out.println(b.getName());
        System.out.println(b.getGrade());

        System.out.println(a.getName());
        System.out.println(((Student)a).getGrade());
    }
}
