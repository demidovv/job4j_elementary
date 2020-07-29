package ru.job4j.array;

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        String cross;
        for (int leftNum: left) {
            for (int rightNum: right) {
                if (leftNum == rightNum) {
                    System.out.println(rightNum);
                }
            }
        }
    }
}
