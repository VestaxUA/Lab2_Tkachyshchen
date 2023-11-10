package org.example;

class DVD extends Item {
    int duration;

    DVD(String title, String uniqueID, int duration) {
        super(title, uniqueID);
        this.duration = duration;
    }

    @Override
    void borrowItem() {
        this.isBorrowed = true;
    }

    @Override
    void returnItem() {
        this.isBorrowed = false;
    }


}
