package ru.job4j.loop;

public class Counter {
    /**
     * Суммирование чисел в диапазоне
     * @param start
     * @param finish
     * @return
     */
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            sum = sum + index;
        }
        return sum;
    }

    /**
     * Суммирование четных чисел в диапазоне
     * @param start
     * @param finish
     * @return
     */
    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            if (index % 2 == 0) {
                sum = sum + index;
            }
        }
        return sum;
    }
}