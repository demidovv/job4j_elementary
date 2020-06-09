package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenAddItem() {

        String[] answers = {"One", "Two", "Three", "Four"};
        int numbers = answers.length;
        Input input = new StubInput(answers);

        Tracker tracker = new Tracker();
        for (int i = 0; i < numbers; i++) {
            StartUI.createItem(input, tracker);
        }

        for (int i = 0; i < numbers; i++) {
            Item created = tracker.findAll()[i];
            Item expected = new Item(answers[i]);
            assertThat(created.getName(), is(expected.getName()));
        }
    }
}