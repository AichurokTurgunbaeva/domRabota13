package com.company;

public class Main {

    public static void main(String[] args) {
	Fish fish = new Fish();
    fish.setName("Dory");
    fish.setColor("Orange color");
    fish.setAge(3);
        System.out.println("Info about Fish: " +fish.getName()+" "+fish.getColor()+" "+fish.getAge());
        fish.eat();
        fish.sleep();

     Parrot parrot = new Parrot();
     parrot.setName("Barney");
     parrot.setColor("Rainbow color");
     parrot.setAge(5);
        System.out.println("---------------------------------");
        System.out.println("Info about parrot: "+parrot.getName()+" "+parrot.getColor()+" "+parrot.getAge());
        parrot.suyloyt();
        parrot.uktayt();

        Cat cat = new Cat();
        cat.setName("Oliver");
        cat.setColor("Cream color");
        cat.setAge(2);
        cat.setBreed("Persian");
        System.out.println("--------------------------------");
        System.out.println("Info about cat: "+cat.getName()+" "+cat.getColor()+" "+cat.getAge());
        cat.oynoyt();
        cat.chychkanKubalayt();

        Dog dog = new Dog();
        dog.setName("Daisy");
        dog.setColor("White color");
        dog.setAge(1);
        dog.setBreed("Toy Poodle");
        System.out.println("--------------------------------");
        System.out.println("Info about dog: "+dog.getName()+" "+dog.getColor()+" "+dog.getAge()+" "+dog.getBreed());
        dog.tamakJeyt();
        dog.eesinEerchiyt();
    }
}
