package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Gevorg", "Hakobyan", "AN000811", 25,
                "male", "Christianity");
        System.out.println(person.display());
    }
}