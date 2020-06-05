package ru.job4j.io;

import java.util.Scanner;

public class Matches {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        int gamer = 0;
        System.out.println("Спичек на столе: " + matches);
        while (matches > 3) {
            if (gamer % 2 == 0) {
                System.out.println("Ход игрока 1. Возьмите от 1 до 3 спичек");
                int select = Integer.valueOf(input.nextLine());
                if (select > 3) {
                    System.out.println("Неправильный ввод");
                    continue;
                }
                gamer++;
                matches -= select;
                System.out.println("Спичек на столе: " + matches);
                System.out.println();
            } else {
                System.out.println("Ход игрока 2. Возьмите от 1 до 3 спичек");
                int select = Integer.valueOf(input.nextLine());
                if (select > 3) {
                    System.out.println("Неправильный ввод");
                    continue;
                }
                gamer++;
                matches -= select;
                System.out.println("Спичек на столе: " + matches);
                System.out.println();
            }
        }

        if (gamer % 2 == 0) {
            System.out.println("Выиграл игрок 1");
        } else {
            System.out.println("Выиграл игрок 2");
        }
    }
}
