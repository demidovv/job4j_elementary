package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;

    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(6, 3);
        Point b = new Point(12, 7);
        System.out.println(a.distance(b));
    }
}


//public class Point {
//    public static double distance(int x1, int y1, int x2, int y2) {
//        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
//        return rsl;
//    }
//
//    public static void main(String[] args) {
//        double result1 = Point.distance(0, 0, 2, 0);
//        System.out.println("result1 (0, 0) to (2, 0) is " + result1);
//
//        double result2 = Point.distance(6, 3, 12, 7);
//        System.out.println("result2 (6, 3) to (12, 7) is " + result2);
//
//        double result3 = Point.distance(-8, 658, 21, 71);
//        System.out.println("result3 (-8, 658) to (21, 71) is " + result3);
//    }
