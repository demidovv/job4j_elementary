package ru.job4j.tracker;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name =  input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showAll(Tracker tracker) {
        System.out.println("=== Show all items ====");
        Item[] all = tracker.findAll();
        for (int i = 0; i < all.length; i++) {
            System.out.println(i + 1 + all[i].toString());
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        String id =  input.askStr("Enter id: ");
        String name =  input.askStr("Enter name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Done.");
        } else {
            System.out.println("Введен неправильный id.");
        }
    }

    public static void deteleItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        String id =  input.askStr("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Done.");
        } else {
            System.out.println("Введен неправильный id.");
        }
    }

    public static void findById(Input input, Tracker tracker) {
        System.out.println("===  Find item by Id ====");
        String id =  input.askStr("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item.getName());
        } else {
            System.out.println("Введен неправильный id.");
        }
    }

    public static void findByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ====");
        String name =  input.askStr("Enter name: ");
        Item[] find = tracker.findByName(name);
        if (find.length != 0) {
            for (int i = 0; i < find.length; i++) {
                System.out.println(i + 1 + find[i].toString());
            }
        } else {
            System.out.println("Имя отсутствует в трекере!");
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                StartUI.createItem(input, tracker);


            } else if (select == 1) {
                StartUI.showAll(tracker);

            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);

            } else if (select == 3) {
                StartUI.deteleItem(input, tracker);

            } else if (select == 4) {
                StartUI.findById(input, tracker);

            } else if (select == 5) {
               StartUI.findByName(input, tracker);

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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);

    }
}