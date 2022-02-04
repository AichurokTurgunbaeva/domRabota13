package com.company;

public class Parrot {
    private String name;
    private String color;
    private int age;

    void suyloyt() {
        System.out.println(age+ " jashtagy popugay suylop jatat");
    }
    void uktayt() {
        System.out.println(name+" uktap jatat");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
