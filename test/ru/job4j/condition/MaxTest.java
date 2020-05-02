package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax4To2Then4() {
        int result = Max.max(4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenMax84To84Then84() {
        int result = Max.max(84, 84);
        assertThat(result, is(84));
    }
    @Test
    public void whenMax8Tominus8Then8() {
        int result = Max.max(8, -8);
        assertThat(result, is(8));
    }
}