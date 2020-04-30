package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; // формула перевода рублей в доллоры.
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int usd = Converter.rubleToDollar(240);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("240 rubles are " + usd + " USD.");

        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result for Euro: " + passed);

        int in2 = 600;
        int expected2 = 10;
        int out2 = rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("600 rubles are 10. Test result for USD: " + passed2);
    }
}
