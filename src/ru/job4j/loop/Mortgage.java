package ru.job4j.loop;

public class Mortgage {
    /**
     * Калькулятор кредита
     * @param amount - сумма выданная по кредиту
     * @param salary - годовой доход
     * @param percent - процентная ставка по кредиту
     * @return количество лет на выплаты
     */
        public int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount = amount + amount * percent / 100 - salary;
            year += 1;
        }
        return year;
    }
}
