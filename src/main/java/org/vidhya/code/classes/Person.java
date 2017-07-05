package org.vidhya.code.classes;

/**
 * Created by vidhy on 6/22/2017.
 */
public class Person {
    String name;
    int age;
    String job;
    String sex;

    public Person(String name, int age, String job, String sex) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }
}


