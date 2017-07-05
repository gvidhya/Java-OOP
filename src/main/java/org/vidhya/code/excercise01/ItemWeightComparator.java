package org.vidhya.code.excercise01;

/**
 * Created by vidhy on 6/24/2017.
 */
public class ItemWeightComparator implements ItemComparator{
    public int compare(Item first,Item second){
        if (first.weight > second.weight)
            return 1;
        else if (first.weight < second.weight)
            return -1;
        else
            return first.compareTo(second);

    }
}
