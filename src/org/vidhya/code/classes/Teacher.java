package org.vidhya.code.classes;

/**
 * Created by vidhy on 6/22/2017.
 */
public class Teacher extends Person{
    String qualification;
    String grade;
    String subject;

    public Teacher(String name, int age, String job, String sex, String qualification, String grade, String subject) {
        super(name, age, job, sex);
        this.qualification = qualification;
        this.grade = grade;
        this.subject = subject;
    }

    public String getTeacherGrade() {
        return grade;
    }
}
