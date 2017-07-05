package org.vidhya.code.excercise01;

/**
 * Created by Vidhya on 6/25/2017.
 */
public class Pizza extends Consumable {
    int numberOfSlices;
    int slicesEaten;


    public Pizza(boolean spoiled, int numberOfSlices) {
        super(25, "Pizza", 200, spoiled);
        this.numberOfSlices = numberOfSlices;
    }
}
