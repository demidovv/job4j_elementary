package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indexLeft = 0;
        int indexRight = 0;

        while (indexLeft < left.length && indexRight < right.length) {
            if (left[indexLeft] < right[indexRight]) {
                rsl[indexLeft + indexRight] = left[indexLeft];
                indexLeft++;
            } else {
                rsl[indexLeft + indexRight] = right[indexRight];
                indexRight++;
            }
        }

        for (int i = indexLeft; i < left.length; i++) {
            rsl[indexRight + i] = left[i];
        }
        for (int i = indexRight; i < right.length; i++) {
            rsl[indexLeft + i] = right[i];
        }
        return rsl;
    }


    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}

