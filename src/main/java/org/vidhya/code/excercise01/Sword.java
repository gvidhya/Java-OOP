package org.vidhya.code.excercise01;

/**
 * Created by vidhy on 6/24/2017.
 */
public class Sword extends Weapon {
    public Sword(int value, double weight, double baseDamage, double baseDurability) {
        super(value, "Sword", weight, baseDamage, baseDurability);
    }
    public void polish(){
        if(this.getDamage() == 25/100 * this.baseDamage)
            this.damageModifier+=MODIFIER_CHANGE_RATE;
    }
}
