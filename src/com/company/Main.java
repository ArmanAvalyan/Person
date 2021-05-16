package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Arm", "Avalyan", "AM000001", 25,
                "male", "Christianity");
        System.out.println(person.display());
    }
}