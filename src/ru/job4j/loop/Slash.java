package ru.job4j.loop;

/**
* Class Slash решение задачи "5.9. Крест в псевдографике. [#279763]"
 * @author Vitaly Demidov (demidov011@gmail.com)
 */

public class Slash {
    /**
     * Method draw
     * @param size размер креста
     */
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = row == cell; // добавить условие, по которому нужно определить ставить ли символ или нет.
                boolean right = size - cell - 1 == row; // добавить условие, что нужно ставить элемент в правый угол.
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}
