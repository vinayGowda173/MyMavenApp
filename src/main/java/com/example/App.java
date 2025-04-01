package com.example;

public class App {
    /**
     * Adds two numbers and returns the result.
     * 
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    public int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        App app = new App();
        int result = app.addNumbers(5, 3);
        System.out.println("Sum: " + result);  // Output: Sum: 8
    }
}

