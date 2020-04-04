package com.company;

public class Cleaner extends Staff {
    public Cleaner(String name) {
        super(name);
    }

    public static String type(){
        return "cleaner";
    }

    public int sal() {
        return 60;
    }

    public void print() {
        System.out.println(name + " " + type() + " salary " + sal());
    }
}
