package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void whenPoint2d() {
        Point a = new Point(6, 3);
        Point b = new Point(12, 7);
        double expected = 7.211;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenPoint3d1() {
        Point a = new Point(6, 3, 9);
        Point b = new Point(12, 7, 10);
        double expected = 7.280;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenPoint3d2() {
        Point a = new Point(59, 34, 997);
        Point b = new Point(125, 543, 10);
        double expected = 1112.477;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.001);
    }
}