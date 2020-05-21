package ru.job4j.array;

public class ArrayChar {
    /**
     * Проверка начала слова (массива букв)
     * @param word
     * @param pref
     * @return
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (word[index] != pref[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}