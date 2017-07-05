package org.vidhya.code.excercise01;

/**
 * Created by vidhy on 6/24/2017.
 */
public  abstract class Item implements Comparable{
    static int numberOfItems =0;
    int id;
    int value;
    String name;
    double weight;

    public Item(int value, String name, double weight) {
        this.value = value;
        this.name = name;
        this.weight = weight;
        this.id=numberOfItems;
        numberOfItems++;
    }

   // public Item(){}

    public void setValue(int price) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int compareTo(Item other) {
        if (this.value > other.value)
            return 1;
        else if (this.value < other.value)
            return -1;
        else
            return (this.name).compareToIgnoreCase(other.name);
    }

    public String toString(){
        return this.name + "--"+ "Value: "+this.value+", "+" Weight: "+this.weight;

    }
}
