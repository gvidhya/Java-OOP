package org.vidhya.code.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.vidhya.code.classes.RtTriangle;

import static org.testng.Assert.*;

/**
 * Created by Vidhya on 6/25/2017.
 */
public class RtTriangleTest {
    RtTriangle testRtTriangle;
    @BeforeMethod
    public void setup(){
        testRtTriangle = new RtTriangle(3,3,4);
    }


    @Test
    public void testGetArea() throws Exception {
        assertEquals(testRtTriangle.getArea(), testRtTriangle.getWidth()*testRtTriangle.getHeight()/2 );
    }

    @Test
    public void testGetPerimeter() throws Exception {
        assertEquals(testRtTriangle.getPerimeter(),
                testRtTriangle.getWidth() + testRtTriangle.getHeight()
                + Math.sqrt(testRtTriangle.getWidth() ^ 2 + testRtTriangle.getHeight() ^ 2));
    }

}