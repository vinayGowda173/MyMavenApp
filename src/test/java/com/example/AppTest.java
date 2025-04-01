package com.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for the App class.
 */
public class AppTest extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Test for addNumbers method.
     */
    public void testAddNumbers() {
        App app = new App();
        
        // Test case 1: Adding two positive numbers
        int result = app.addNumbers(5, 3);
        assertEquals(8, result);  // Expected sum: 8

        // Test case 2: Adding a positive and a negative number
        result = app.addNumbers(-2, 3);
        assertEquals(1, result);  // Expected sum: 1

        // Test case 3: Adding two negative numbers
        result = app.addNumbers(-5, -3);
        assertEquals(-8, result);  // Expected sum: -8

        // Test case 4: Adding zero
        result = app.addNumbers(0, 0);
        assertEquals(0, result);  // Expected sum: 0
    }
}

