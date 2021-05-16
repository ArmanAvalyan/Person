package com.company;

public class Person {

    private String firstName;
    private String lastName;
    private String passportId;
    private int age;
    private String sex;
    private String nationality;

    public Person(String firstName, String lastName, String passportId,
                  int age, String sex, String nationality) {
        setFirstName(firstName);
        setLastName(lastName);
        setPassportId(passportId);
        setAge(age);
        setSex(sex);
        setNationality(nationality);
    }

    public String display() {
        return "First name is " + firstName + '\n' +
                "Last name is " + lastName + '\n' +
                "Passport ID is " + passportId + '\n' +
                "Age is " + age + '\n' +
                "Sex is " + sex + '\n' +
                "Nationality is " + nationality;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() >= 3 && firstName.length() <= 15)
            this.firstName = firstName;
        else
            System.out.println("Enter the correct name");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() >= 6 && lastName.length() <= 20)
            this.lastName = lastName;
        else
            System.out.println("Enter the correct name");
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        if (passportId.startsWith("AN") && passportId.length() == 8) {
            if (passportId.substring(3).matches("[0-9]+"))
                this.passportId = passportId;
        } else
            System.out.println("Enter the correct number");

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 99)
            this.age = age;
        else
            System.out.println("Enter the correct age");
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.equals("female") || sex.equals("male"))
            this.sex = sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
