package org.vidhya.code.excercise01;

/**
 * Created by Vidhya on 6/25/2017.
 */
public abstract class Consumable extends Item {
    boolean consumed;
    boolean spoiled;

    public Consumable(int value, String name, double weight, boolean spoiled) {
        super(value, name, weight);
        this.spoiled = spoiled;
        this.consumed = false;
    }

    public  String use(){
    if (!this.spoiled && !this.consumed)
        return this.eat();
    else if (this.spoiled == true && !this.consumed)
        return this.eat() + "/n You feel sick.";
    else
        return "There is nothing left of the " + this.name + "to consume.";
    }

    public String eat(){
        return "You eat the " + this.name + ".";
    }

}
