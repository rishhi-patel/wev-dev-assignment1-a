package com.example.assignment1bscaffold;

import java.util.Arrays;

public class Assignment1bAssignment {

    public class Point {
        public double x;
        public double y;
    }

    /**
     * Rotates a Point 270 degrees counterclockwise assuming a unit circle.
     *
     * You may find this useful to complete the tableLocation method.
     *
     * @param point The point to rotate
     * @return The rotated point
     */
    Point rotate270CounterClockwise(Point point) {
        Point newPoint = new Point();
        newPoint.x = point.y;
        newPoint.y = -point.x;
        return newPoint;
    }

    /**
     * Returns the index location for a value in an array.
     *
     * You may find this method useful for the logic puzzle problem.
     *
     * @param array The array to search
     * @param value The value to search for
     * @return The index of the value in the array or -1 if the value is not found.
     */
    static int getIndexFromArray(String[] array, String value) {
        return Arrays.binarySearch(array, value) >= 0 ? Arrays.binarySearch(array, value) : -1;
    }

    /**
     * Returns the sum of an array of integers.
     *
     * You may find this method useful for the logic puzzle problem.
     *
     * @param array The array of integers to sum
     * @return The sum of the array
     */
    static int sumOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    /**
     * INCLUDE YOUR ACADEMIC INTEGRITY STATEMENT IN THIS LOCATION (Question 0) to
     * earn your mark.
     */

    /**
     * REPLACE THIS SECTION WITH AN APPROPRIATE DESCRIPTION OF THE METHOD USING THE
     * STYLE ABOVE
     */
    // static String[] rotateLeftStrings(String[] textArray) {
    // // TODO: Implement this method according to assignment specification.
    // (Question 1)
    // }

    // /** REPLACE THIS SECTION WITH AN APPROPRIATE DESCRIPTION OF THE METHOD USING
    // THE STYLE ABOVE */
    // static String[] pageBreak(String[] textArray, int pageSize) {
    // // TODO: Implement this method according to assignment specification.
    // (Question 2)

    // }

    // /** REPLACE THIS SECTION WITH AN APPROPRIATE DESCRIPTION OF THE METHOD USING
    // THE STYLE ABOVE */
    // static String[][] logicPuzzle() {

    // }

    // /** REPLACE THIS SECTION WITH AN APPROPRIATE DESCRIPTION OF THE METHOD USING
    // THE STYLE ABOVE */
    // static Point[] aroundTheTable(int numberOfPlayers, int radius){
    // // TODO: Implement this method according to assignment specification.
    // (Question 4)
    // }

}
