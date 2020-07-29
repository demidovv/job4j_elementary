package ru.job4j.array;

public class Sorted {
    public static boolean isSorted(int[] array) {

        for (int number = 0; number < array.length - 1; number++) {
            if (array[number + 1] < array[number]) {
                return false;
            }
        } return true;
    }
}