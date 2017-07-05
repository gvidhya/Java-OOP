package org.vidhya.code.test;

import org.vidhya.code.classes.Dog;

/**
 * Created by vidhy on 6/22/2017.
 */
public class DogTest {
    public static void main(String[] args){
        Dog dog1=new Dog();
        dog1.setName("Dobby");
        dog1.setAge(5);

        System.out.println(dog1.getName());
        System.out.println(dog1.getAge());
        System.out.println(dog1.getAgeInPersonYears());
        System.out.println(dog1.toString());

        Dog dog2=new Dog("Tommy",7);

        System.out.println(dog2.getName());
        System.out.println(dog2.getAge());
        System.out.println(dog2.getAgeInPersonYears());
        System.out.println(dog2.toString());
    }
}
