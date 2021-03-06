package ru.job4j.array;

public class Turn {
    /**
     * Разворот массива
     * @param array
     * @return
     */
    public static int[] back(int[] array) {
        int temp = 0;
        for (int index = 0; index < array.length / 2; index++) {
            temp = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = temp;
        }
        return array;
    }
}