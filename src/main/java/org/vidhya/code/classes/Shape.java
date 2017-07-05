package org.vidhya.code.classes;

/**
 * Created by vidhy on 6/23/2017.
 */
public abstract class Shape {
    int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public Shape() {
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    public abstract int getArea();

    public abstract double getPerimeter();
}
