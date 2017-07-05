package org.vidhya.code.classes;

/**
 * Created by vidhy on 6/22/2017.
 */
public class Student extends Person {
    String grade;
    String readingLevel;

    public Student(String name, int age, String job, String sex, String grade, String readingLevel) {
        super(name, age, job, sex);
        this.grade = grade;
        this.readingLevel = readingLevel;
    }

    public String getGrade() {
        return grade;
    }
}
