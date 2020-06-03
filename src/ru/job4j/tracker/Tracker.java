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
        // Находим индекс
        int index = indexOf(id);
        // Если индекс найден возвращаем item, иначе null
        return index != -1 ? items[index] : null;
    }

    /**
     * Метод замены заявки
     * @param newItem
     * @param id
     */
    public void replace(String id, Item newItem) {
        int index = indexOf(id);
        newItem.setId(id);
        items[index] = newItem;
//        items[index].setName(newItem.getName());
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

    /**
     * Метод, который будет возвращать index по id
     * @param id
     * @return
     */
    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }


}