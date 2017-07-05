package org.vidhya.code.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.vidhya.code.classes.Dog;

import static org.testng.Assert.*;

/**
 * Created by Vidhya on 6/25/2017.
 */
public class DogTest {

    Dog testDog;

    @BeforeMethod
    public void setUp() {
        System.out.println("Running pre condition");
        testDog = new Dog("Dobby", 5);
    }

    @Test
    public void testToString() throws Exception {
        System.out.println("Testing toString");
        assertEquals(testDog.toString(), "I am Dobby who can run fast.");
        testDog.setName("Dooby");
        assertEquals(testDog.toString(), "I am Dooby who can run fast.");
    }

    @Test
    public void testDogAge() {
        System.out.println("Testing age of " + testDog.getName());
        assertTrue(testDog.getAge() > 0);
    }

}