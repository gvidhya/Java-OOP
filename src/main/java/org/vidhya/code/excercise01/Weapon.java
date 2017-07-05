package org.vidhya.code.excercise01;

/**
 * Created by vidhy on 6/24/2017.
 */
public abstract class Weapon extends Item{
    static double MODIFIER_CHANGE_RATE=0.05;
    double baseDamage;
    double damageModifier;
    double baseDurability;
    double durabilityModifier;

    public Weapon(int value, String name, double weight, double baseDamage, double baseDurability) {
        super(value, name, weight);
        this.baseDamage = baseDamage;
        this.baseDurability = baseDurability;
        this.damageModifier=baseDamage*MODIFIER_CHANGE_RATE;
        this.durabilityModifier=baseDurability*MODIFIER_CHANGE_RATE;
    }

    public void setBaseDamage(double baseDamage) {
        this.baseDamage = baseDamage;
    }

    public void setBaseDurability(double baseDurability) {
        this.baseDurability = baseDurability;
    }

    public double getBaseDamage() {
        return baseDamage;
    }

    public double getBaseDurability() {
        return baseDurability;
    }

    public  double getDamage(){
        return baseDamage + damageModifier;
    }

    public double getDurability(){
        if((baseDurability + durabilityModifier) <= 0)
            return 0;
        else return baseDurability + durabilityModifier;
    }

    public String toString(){
       return this.name +  " -- Value: " + this.value
               + ", Weight: " + this.weight
               + ", Damage: " + this.getDamage()
               +", Durability: "+ this.getDurability()*100 + "%";
    }

    public String use(){
        if (this.getDurability()<=0)
        return "You can't use the " + this.name + ", it is broken.";
        if (this.getDurability() - MODIFIER_CHANGE_RATE <= 0)
        return "You use the " + this.name
                + ", dealing " + this.getDamage()
                +" points of damage./nThe " + this.name + " breaks.";
        else
        return "You use the " + this.name + ", dealing " + this.getDamage() +" points of damage.";


    }

}
