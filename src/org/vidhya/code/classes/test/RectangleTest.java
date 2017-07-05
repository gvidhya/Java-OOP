package org.vidhya.code.classes.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.vidhya.code.classes.Rectangle;

import static org.testng.Assert.*;

/**
 * Created by Vidhya on 6/25/2017.
 */
public class RectangleTest {
    Rectangle testRectangle;
    @BeforeMethod
    public void setup(){
        testRectangle=new Rectangle(4,3,4);
    }
    @Test
    public void testGetArea() throws Exception {
        assertEquals(testRectangle.getArea(),3*4);

    }

    @Test
    public void testGetPerimeter() throws Exception {
        assertEquals(testRectangle.getPerimeter(),2d*(3d+4d));
    }

    @Test
    public void testResize() throws Exception {
        testRectangle.resize(3);
    }

}