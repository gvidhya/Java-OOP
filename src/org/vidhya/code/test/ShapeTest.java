package org.vidhya.code.test;

import org.vidhya.code.classes.Rectangle;

/**
 * Created by vidhy on 6/24/2017.
 */
public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle();
        rectangle1.setNumSides(4);
        //System.out.println(rectangle1.getNumSides());
        rectangle1.setWidth(2);
        rectangle1.setHeight(3);
       // System.out.println(rectangle1.getWidth());
       // System.out.println(rectangle1.getHeight());
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
        rectangle1.resize(2);
    }
}
