package ru.job4j.array;

public class Defragment {
    /**
     * Дефрагментируем массив
     * @param array
     * @return
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index; // указатель, на не null ячейку.
                while (point < array.length - 1) {
                    if (array[point + 1] != null) {
                        array[index] = array[point + 1];
                        array[point + 1] = null;
                        break;
                    }
                    point++;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}