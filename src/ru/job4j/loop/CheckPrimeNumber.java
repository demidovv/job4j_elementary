package ru.job4j.loop;

public class CheckPrimeNumber {
    /**
     * Проверка на простое число
     * @param number
     * @return
     */
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            prime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }
}
