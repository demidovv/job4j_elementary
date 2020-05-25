package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenNotExist() {
        Point a = new Point(2, 0);
        Point b = new Point(3, 1);
        Point c = new Point(4, 2);
        Triangle triangle = new Triangle(a, b, c);
        assertThat(triangle.area(), is(-1.0));
    }

    @Test
    public void whenExist() {
        Point a = new Point(2, 0);
        Point b = new Point(4, 0);
        Point c = new Point(4, 2);
        Triangle triangle = new Triangle(a, b, c);
        assertThat(triangle.area(), is(2.0));
    }
}