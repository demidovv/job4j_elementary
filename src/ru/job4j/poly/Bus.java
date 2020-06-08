package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void move() {

    }

    @Override
    public void passengers(int passengers) {

    }

    @Override
    public int filling(int fuel) {
        int price = fuel * 48;
        return price;
    }
}
