package org.vidhya.code.excercise01;

/**
 * Created by vidhy on 6/24/2017.
 */
public class Bow extends Weapon {
    public Bow(int value, double weight, double baseDamage, double baseDurability) {
        super(value, "Bow", weight, baseDamage, baseDurability);
    }

    public void polish(){
        if (this.getDurability()<1)
            this.durabilityModifier += MODIFIER_CHANGE_RATE;
    }
}
