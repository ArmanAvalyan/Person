package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Arm", "Avalyan", "AN009001", 25,
                "male", "Christianity");
        System.out.println(person.display());
    }
}