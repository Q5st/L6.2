package com.company;

public class Student extends Person {


    public Student(String name) {
        super(name);
    }

    public static String type(){
        return "student";
    }

    @Override
    public void print() {
        System.out.println(type() + " " + super.name);
    }
}
