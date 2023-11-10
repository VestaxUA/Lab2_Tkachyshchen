package org.example;

import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
public class TestItem {
    @org.junit.jupiter.api.Test
    void getTitle() {
        Item item = new Book("Sample Book", "B001", "Sample Author");
        Assertions.assertEquals("Sample Book", item.getTitle());
    }

    @org.junit.jupiter.api.Test
    void getUniqueID() {
        Item item = new Book("Sample Book", "B001", "Sample Author");
        Assertions.assertEquals("B001", item.getUniqueID());
    }

    @org.junit.jupiter.api.Test
    void isBorrowed() {
        Library library = new Library();
        Patron patron1 = new Patron("Alice", "P001");
        Patron patron2 = new Patron("Bob", "P002");

        Item item1 = new Book("Book 1", "B001", "Author 1");
        Item item2 = new Book("Book 2", "B002", "Author 2");

        library.registerPatron(patron1);
        library.registerPatron(patron2);
        library.add(item1);
        library.add(item2);

        library.lendItem(patron1, item1);
        library.lendItem(patron2, item2);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        library.listBorrowed();

        System.setOut(System.out);

        String printedOutput = outputStream.toString();

        Assertions.assertTrue(printedOutput.contains("Alice - Book 1"));
        Assertions.assertTrue(printedOutput.contains("Bob - Book 2"));
    }
}
