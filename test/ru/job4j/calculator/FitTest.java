package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.converter.Converter;

public class FitTest {

    @Test
    public void whenMenHeihgt188henManWeight101p2() {
        double in = 188;
        double expected = 101.2;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomenHeihgt176ThenWomanWeight75p9() {
        double in = 176;
        double expected = 75.9;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}