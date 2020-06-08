package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);

            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                Item[] all = tracker.findAll();
                for (int i = 0; i < all.length; i++) {
                    System.out.println(i + 1 + all[i].toString());
                }

            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Done.");
                } else {
                    System.out.println("Введен неправильный id.");
                }

            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("Done.");
                } else {
                    System.out.println("Введен неправильный id.");
                }

            } else if (select == 4) {
                System.out.println("===  Find item by Id ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item.getName());
                } else {
                    System.out.println("Введен неправильный id.");
                }

            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item[] find = tracker.findByName(name);
                if (find.length != 0) {
                    for (int i = 0; i < find.length; i++) {
                        System.out.println(i + 1 + find[i].toString());
                    }
                } else {
                    System.out.println("Имя отсутствует в трекере!");
                }

            } else if (select == 6) {
                run = false;
            }
        }
    }


    @SuppressWarnings("checkstyle:OperatorWrap")
    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item\n" +
                "1. Show all items\n" +
                "2. Edit item\n" +
                "3. Delete item\n" +
                "4. Find item by Id\n" +
                "5. Find items by name\n" +
                "6. Exit Program\n");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);

    }
}