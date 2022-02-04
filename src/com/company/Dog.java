package com.company;

public class Dog {
    private String name;
    private String color;
    private int age;
    private String breed;

   void tamakJeyt() {
       System.out.println(name + " tamak jep jatat");
   }
   void eesinEerchiyt() {
       System.out.println(color+" tusundogu "+name+ " eesin eerchip jatat");
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
