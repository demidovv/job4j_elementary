package ru.job4j.calculator;

public class Fit {
    /**
     * "Идеальный" вес мужчины
     * @param height
     * @return
     */
    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    /**
     * "Идеальный" вес женщины
     * @param height
     * @return
     */
    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(188);
        double woman = Fit.womanWeight(176);
        System.out.println("Man 188 is " + man);
        System.out.println("Woman 176 is " + woman);
        }
}
