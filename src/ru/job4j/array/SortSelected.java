package ru.job4j.array;

public class SortSelected {
    /**
     * Сортировка массива по возрастанию
     * @param data
     * @return
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            SwitchArray.swap(data, i, index);
            }
        return data;
    }
}
