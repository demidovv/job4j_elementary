package ru.job4j.condition;

public class MultiMax {
    @SuppressWarnings("checkstyle:NoWhitespaceBefore")
    public int max(int first, int second, int third) {
        int result = first > second && first > third ? first : second > third ? second : third;
        return result;
    }
}
