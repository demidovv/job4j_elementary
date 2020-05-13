package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp = 0;
        for (int index = 0; index < array.length; index++) {
            if (index < array.length / 2) {
                temp = array[index];
                array[index] = array[array.length - 1 - index];
                array[array.length - 1 - index] = temp;
            } else {
                break;
            }
        }
        return array;
    }
}