package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int result = Factorial.calc(5);
        assertThat(result, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int result = Factorial.calc(0);
        assertThat(result, is(1));
        }

    @Test
    public void whenCalculateFactorial12Then479001600() {
        int result = Factorial.calc(12);
        assertThat(result, is(479001600));
    }

    @Test
    public void whenCalculateFactorial1Then1() {
        int result = Factorial.calc(1);
        assertThat(result, is(1));
    }
}