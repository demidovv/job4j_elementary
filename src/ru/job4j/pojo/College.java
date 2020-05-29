package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Vitaly Demidov");
        student.setGroup(7521);
        student.setEnroll(new Date());

        System.out.println("Student " + student.getName() + " from group " + student.getGroup() + " enrolled " + student.getEnroll());
    }
}
