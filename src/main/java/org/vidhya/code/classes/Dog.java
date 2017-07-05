package org.vidhya.code.classes;

/**
 * Created by vidhy on 6/22/2017.
 */

public class Dog {
    String name;
    int age;

    public Dog(String dogName, int dogAge) {
        this.name = dogName;
        this.age = dogAge;
    }

    public Dog() {}

    public void setName(String dogName){
        name= dogName;
    }

    public String getName(){
        System.out.println(" Name: "+name);
        return name;
    }

    public void setAge(int dogAge){
        age=dogAge;
    }

    public int getAge() {
        System.out.println("Age: " + age);
        return age;
    }


    public int getAgeInPersonYears(){
      return 7 * age;

    }

    public String toString(){
        return "I am "+ name+ " who can run fast.";
    }
}
