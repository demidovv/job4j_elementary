package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort1() {
        int[] input = new int[] {26, 51, 32, 56, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 26, 32, 51, 56};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort2() {
        int[] input = new int[] {139, 0, 559};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {0, 139, 559};
        assertThat(result, is(expect));
    }
}
