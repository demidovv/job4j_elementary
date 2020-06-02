package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    /**
     * Метод возвращает копию массива без пустых клеток
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    /**
     * Метод получения списка по имени
     * @param key
     * @return
     */
    public Item[] findByName(String key) {
        Item[] tempItems = new Item[position];
        int size = 0;

        for (int i = 0; i < position; i++) {
            if (items[i].getName().equals(key)) {
                tempItems[size++] = items[i];
            }
        }
        return Arrays.copyOf(tempItems, size);
    }

    /**
     * Метод получения заявки по id
     * @param id
     * @return
     */
    public Item findById(String id) {
        Item tempItem = new Item(null);
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id)) {
                tempItem = items[i];
                break;
            }
        }
        return tempItem;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
}