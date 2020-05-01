package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
     public void whenPoint63127thenDistance721() {
        int in1 = 6;
        int in2 = 3;
        int in3 = 12;
        int in4 = 7;
        double expected = 7.21;
        double out = Point.distance(in1, in2, in3, in4);
        Assert.assertEquals(expected, out, 0.001);

    }
}