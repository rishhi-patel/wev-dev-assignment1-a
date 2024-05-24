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
        String[][] expected = {
                { "Bob", "Jane", "Priya", "Lane", "Yien" },
                { "dog", "hamster", "bird", "fish", "cat" }
        };
        String[][] actual = Assignment1aAssignment.solveLogicPuzzle();
        assertArrayEquals(expected[0], actual[0]);
        assertArrayEquals(expected[1], actual[1]);
    }

    @Test
    void locatePlayersTest() {
        int diameter = 100;
        int players = 4;
        double[][] expected = {
                { 70.0, 120.0 },
                { 20.0, 70.0 },
                { 70.0, 20.0 },
                { 120.0, 70.0 }
        };
        double[][] actual = Assignment1aAssignment.locatePlayers(diameter, players);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i][0], actual[i][0], 0.1);
            assertEquals(expected[i][1], actual[i][1], 0.1);
        }
    }
}
