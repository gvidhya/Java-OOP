package org.vidhya.code.classes;

/**
 * Created by vidhy on 6/24/2017.
 */
public class RtTriangle extends Shape {
    int width;
    int height;

    public RtTriangle(int numSides,int width,int height){
        super(numSides);
        this.width=width;
        this.height=height;
    }
    public int getArea(){
        return width*height/2;
    }
    public double getPerimeter(){
        return width+height+Math.sqrt(width^2+height^2);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}