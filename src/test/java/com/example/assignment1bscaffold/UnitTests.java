package com.example.assignment1bscaffold;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UnitTests {

    @Test
    void rotateArrayTest() {
        String[] textArray = { "a", "b", "c", "d", "e" };
        int places = 1;
        String[] expected = { "b", "c", "d", "e", "a" };
        String[] actual = Assignment1aAssignment.rotateArray(textArray, places);
        assertArrayEquals(expected, actual);
    }

    @Test
    void rotateArrayTestWithMorePlaces() {
        String[] textArray = { "a", "b", "c", "d", "e" };
        int places = 3;
        String[] expected = { "d", "e", "a", "b", "c" };
        String[] actual = Assignment1aAssignment.rotateArray(textArray, places);
        assertArrayEquals(expected, actual);
    }

    @Test
    void rotateArrayTestWhenEmpty() {
        String[] textArray = {};
        int places = 3;
        String[] expected = {};
        String[] actual = Assignment1aAssignment.rotateArray(textArray, places);
        assertArrayEquals(expected, actual);
    }

    @Test
    void insertPageBreaksTest() {
        String[] textArray = { "a", "b", "c", "d", "e" };
        int location = 2;
        String[] expected = { "a", "b", "*page break*", "c", "d", "*page break*", "e" };
        String[] actual = Assignment1aAssignment.insertPageBreaks(textArray, location);
        assertArrayEquals(expected, actual);
    }

    @Test
    void insertPageBreaksTestWhenLocationExceedsLength() {
        String[] textArray = { "a", "b", "c", "d", "e" };
        int location = 6;
        String[] expected = { "a", "b", "c", "d", "e" };
        String[] actual = Assignment1aAssignment.insertPageBreaks(textArray, location);
        assertArrayEquals(expected, actual);
    }

    @Test
    void insertPageBreaksWhenEmptyTest() {
        String[] textArray = {};
        int location = 2;
        String[] expected = {};
        String[] actual = Assignment1aAssignment.insertPageBreaks(textArray, location);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testLogicPuzzle() {
        String[][] textArray = Assignment1aAssignment.solveLogicPuzzle();
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i][0] == "Bob") {
                assert (textArray[i][1] == "dog");
            } else if (textArray[i][0] == "Priya") {
                assert (textArray[i][1] == "cat");
            } else if (textArray[i][0] == "Lane") {
                assert (textArray[i][1] == "bird");
            } else if (textArray[i][0] == "Yien") {
                assert (textArray[i][1] == "fish");
            } else if (textArray[i][0] == "Jane") {
                assert (textArray[i][1] == "hamster");
            } else {
                assert (false);
            }
        }
    }

    @Test
    void tableLocationTest() {
        Assignment1bAssignment.Point[] test = Assignment1aAssignment.locatePlayers(4, 10);

        // N.B. This is only testing for 4 players, radius 10.
        // You should test for other numbers of players and radii.
        // Marks are not guaranteed just because this test passes.

        assert (test.length == 4);
        assertEquals(test[0].x, 30.0, 0.1);
        assertEquals(test[0].y, 40.0, 0.1);
        assertEquals(test[1].x, 20.0, 0.1);
        assertEquals(test[1].y, 30.0, 0.1);
        assertEquals(test[2].x, 30.0, 0.1);
        assertEquals(test[2].y, 20.0, 0.1);
        assertEquals(test[3].x, 40.0, 0.1);
        assertEquals(test[3].y, 30.0, 0.1);

    }
}
