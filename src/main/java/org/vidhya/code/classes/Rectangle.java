package org.vidhya.code.classes;

import org.vidhya.code.test.Resizable;

/**
 * Created by vidhy on 6/24/2017.
 */
public class Rectangle extends Shape implements Resizable {
    int width;
    int height;

    public Rectangle(int numSides,int width,int height){
        super(numSides);
        this.width=width;
        this.height=height;
    }
    public Rectangle(){}

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getArea(){
      return width*height;
    }
    public double getPerimeter(){
      return 2*(width+height);
    }
    public void resize(double x){
        System.out.println(x*getArea());
        System.out.println(x*getPerimeter());
    }
}



