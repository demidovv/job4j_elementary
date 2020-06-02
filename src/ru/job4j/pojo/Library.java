package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 464);
        Book grochemAlgorithms = new Book("Grochem algorithms", 288);
        Book javaPhilosophy = new Book("Java Philosophy", 1168);
        Book headFirstJava = new Book("Head First Java", 720);

        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = grochemAlgorithms;
        books[2] = javaPhilosophy;
        books[3] = headFirstJava;

        for (int i = 0; i < books.length; i++) {
            System.out.println("Book #" + (i + 1) + " " + books[i].getTitle() + " contains "
                    + books[i].getPages() + " pages.");
        }
        System.out.println("");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int i = 0; i < books.length; i++) {
            System.out.println("Book #" + (i + 1) + " " + books[i].getTitle() + " contains "
                    + books[i].getPages() + " pages.");
        }
        System.out.println("");

        String tempTitle = "Clean Code";
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(tempTitle)) {
                System.out.println("Book #" + (i + 1) + " " + books[i].getTitle() + " contains "
                        + books[i].getPages() + " pages.");
            }
        }
    }
}
