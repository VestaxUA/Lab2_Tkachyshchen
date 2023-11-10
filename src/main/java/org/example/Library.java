package org.example;

import java.util.ArrayList;
import java.util.List;
class Library implements IManageable {
    List<Item> items;
    List<Patron> patrons;

    Library() {
        this.items = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    void registerPatron(Patron patron) {
        patrons.add(patron);
    }

    void lendItem(Patron patron, Item item) {
        // Implementation of lending item to a patron
    }

    void returnItem(Patron patron, Item item) {
        // Implementation of returning a borrowed item
    }

    @Override
    public void add(Item item) {
        items.add(item);
    }

    @Override
    public void remove(Item item) {
        items.remove(item);
    }

    @Override
    public void listAvailable() {
        // Implementation of listing available items
    }

    @Override
    public void listBorrowed() {
        // Implementation of listing borrowed items
    }
}
