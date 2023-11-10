package org.example;

import java.util.ArrayList;
import java.util.List;
class Patron {
    String name;
    String ID;
    List<Item> borrowedItems;

    Patron(String name, String ID) {
        this.name = name;
        this.ID = ID;
        this.borrowedItems = new ArrayList<>();
    }

}
