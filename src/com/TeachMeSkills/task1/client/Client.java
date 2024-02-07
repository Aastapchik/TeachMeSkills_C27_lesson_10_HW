package com.TeachMeSkills.task1.client;

/*
The class describes the Client
 */
public class Client {

    private String age;
    public String name;
    public String surname;



    public String getAge() {
        return age;
    }

    public void setAge(String age) {
            this.age = age;
    }

    public Client(String age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }
}
