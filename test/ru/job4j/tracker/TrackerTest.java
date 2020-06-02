package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenAddNewItemThenTrackerReturnFindByNameTest2() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test2");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item[] result = {item2, item3};
        assertThat(result, is(tracker.findByName("test2")));
    }

    @Test
    public void whenAddNewItemThenTrackerReturnFindByNameTest1() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test2");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item[] result = {item1};
        assertThat(result, is(tracker.findByName("test1")));
    }

    @Test
    public void whenAddNewItemsThenTrackerFindAll() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test2");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item[] result = {item1, item2, item3};
        assertThat(result, is(tracker.findAll()));
    }
}