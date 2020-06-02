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

//    @Test
//    public void whenAddNewItemThenTrackerReturnFindByName() {
//        Tracker tracker = new Tracker();
//        Item item1 = new Item("test1");
//        Item item2 = new Item("test2");
//        tracker.add(item1);
//        tracker.add(item2);
//        Tracker result = tracker.findByName("test1");
//
//        Item result = tracker.findById(item.getId());
//        assertThat(result.getName(), is(item.getName()));
//    }

    @Test
    public void whenAddNewItemsThenTrackerFindAll() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        tracker.add(item1);
        tracker.add(item2);
        Item[] result = tracker.findAll();
        assertThat(result, is());
    }

    @Test
    public void whenAddNewItemThenTrackerHasSameItem4() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }
}