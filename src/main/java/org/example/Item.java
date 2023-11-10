package org.example;

abstract class Item {
    String title;
    String uniqueID;
    boolean isBorrowed;

    Item(String title, String uniqueID) {
        this.title = title;
        this.uniqueID = uniqueID;
        this.isBorrowed = false;
    }

    abstract void borrowItem();

    abstract void returnItem();
    
}
