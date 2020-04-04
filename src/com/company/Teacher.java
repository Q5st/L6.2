package com.company;

public class Teacher extends Staff {
    public Teacher(String name) {
        super(name);
    }

    public int sal() {
        return 100;
    }

    public static String type(){
        return "teacher";
    }

    public void print() {
        System.out.println(name +  " " + type() +  " salary " + sal());
    }
}
