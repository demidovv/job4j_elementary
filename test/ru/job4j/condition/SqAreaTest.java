package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2thenSq2() {
        int in1 = 6;
        int in2 = 2;
        double expected = 2;
        double out = SqArea.square(in1, in2);
        Assert.assertEquals(expected, out, 0.001);
    }
}