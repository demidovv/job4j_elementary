package ru.job4j.oop;

public class Animal {
    public Animal() {
        System.out.println("Class Animal");
    }

    public Animal(String name) {
        System.out.println("Class Animal " + name);
    }

    public static void main(String[] args) {

        Predator predator = new Predator();
    }
}
