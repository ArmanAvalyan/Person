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
        return "First name is " + getFirstName() + '\n' +
                "Last name is " + getLastName() + '\n' +
                "Passport ID is " + getPassportId() + '\n' +
                "Age is " + getAge() + '\n' +
                "Sex is " + getSex() + '\n' +
                "Nationality is " + getNationality();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() >= 3 && firstName.length() <= 15)
            this.firstName = firstName;
        else
            System.out.println("The first name is incorrect");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() >= 6 && lastName.length() <= 20)
            this.lastName = lastName;
        else
            System.out.println("The last name is incorrect");
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        boolean valid = true;
        char[] digits = passportId.substring(3).toCharArray();
        for (int i = 0; i < digits.length; i++) {
            if (!Character.isDigit(digits[i])) {
                valid = false;
            }
        }
        if (passportId.startsWith("AN") && passportId.length() == 8 && valid) {
            this.passportId = passportId;
        } else
            System.out.println("Incorrect passport ID");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 99)
            this.age = age;
        else
            System.out.println("Incorrect age");
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.equals("female") || sex.equals("male"))
            this.sex = sex;
        else
            System.out.println("Incorrect sex");
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
