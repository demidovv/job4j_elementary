package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        int result = first > second ? max(first, third) : max(second, third);
        return result;
    }

    public static int max(int first, int second, int third, int fourth) {
        int result = first > second ? max(first, third, fourth) : max(second, third, fourth);
        return result;
    }
}
