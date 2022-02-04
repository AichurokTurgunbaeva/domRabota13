package com.company;

public class Fish {
   private String name;
   private String color;
   private int age;


   void eat() {
       System.out.println( name + " is eating");
   }
   void sleep() {
       System.out.println(name + " is sleeping");
   }
   void yearsOld() {
       System.out.println(name+ " is " +age+ " years old");
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
