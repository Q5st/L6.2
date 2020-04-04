package com.company;

public class Main {

    public static void main(String[] args) {
        Cleaner cl1 = new Cleaner("asdff");
        Cleaner cl2 = new Cleaner("jgfdff");
        Teacher tch1 = new Teacher("sdgsdg");
        Teacher tch2 = new Teacher("fgfdgdg");
        Student st1 = new Student("uytrh");
        Person[] pr = {cl1, cl2, tch1, tch2, st1};
        for(Person e: pr){
            e.print();
        }
    }
}
