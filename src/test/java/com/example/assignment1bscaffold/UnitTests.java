package com.example.assignment1bscaffold;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import org.junit.jupiter.api.Test;

class UnitTests {

    @Test
    void rotateArrayTest() {
        String[] textArray = { "a", "b", "c", "d", "e" };
        int places = 1;
        String[] expected = { "b", "c", "d", "e", "a" };
        String[] actual = Assignment1aAssignment.rotateLeft(textArray, places);
        assertArrayEquals(expected, actual);
    }

    @Test
    void rotateArrayTestWithMorePlaces() {
        String[] textArray = { "a", "b", "c", "d", "e" };
        int places = 3;
        String[] expected = { "d", "e", "a", "b", "c" };
        String[] actual = Assignment1aAssignment.rotateLeft(textArray, places);
        assertArrayEquals(expected, actual);
    }

    @Test
    void rotateArrayTestWhenEmpty() {
        String[] textArray = {};
        int places = 3;
        String[] expected = {};
        String[] actual = Assignment1aAssignment.rotateLeft(textArray, places);
        assertArrayEquals(expected, actual);
    }

    @Test
    void insertPageBreaksTest() {
        String[] textArray = { "a", "b", "c", "d", "e" };
        int location = 2;
        String[] expected = { "a", "b", "*page break*", "c", "d", "*page break*", "e" };
        String[] actual = Assignment1aAssignment.insertBreaks(textArray, location);
        assertArrayEquals(expected, actual);
    }

    @Test
    void insertPageBreaksTestWhenLocationExceedsLength() {
        String[] textArray = { "a", "b", "c", "d", "e" };
        int location = 6;
        String[] expected = { "a", "b", "c", "d", "e" };
        String[] actual = Assignment1aAssignment.insertBreaks(textArray, location);
        assertArrayEquals(expected, actual);
    }

    @Test
    void insertPageBreaksWhenEmptyTest() {
        String[] textArray = {};
        int location = 2;
        String[] expected = {};
        String[] actual = Assignment1aAssignment.insertBreaks(textArray, location);
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
        List<String> test = Assignment1aAssignment.calculatePlayerPositions(40, 4); // Diameter 40 and 4 players

        // Ensure we have the correct number of players
        assertEquals(4, test.size());

        // Example of how you could parse and test the coordinates
        for (int i = 0; i < test.size(); i++) {
            // Parsing the coordinates from the string
            Pattern pattern = Pattern.compile("Player \\d+: \\(([^,]+), ([^)]+)\\)");
            Matcher matcher = pattern.matcher(test.get(i));
            assertTrue(matcher.find());

            double x = Double.parseDouble(matcher.group(1));
            double y = Double.parseDouble(matcher.group(2));

            if (i == 0) {
                assertEquals(40.0, x, 0.1); // Position for player 1
                assertEquals(20.0, y, 0.1); // Corrected to match the 20 pixel padding and the radius
            } else if (i == 1) {
                assertEquals(60.0, x, 0.1); // Position for player 2
                assertEquals(40.0, y, 0.1);
            } else if (i == 2) {
                assertEquals(40.0, x, 0.1); // Position for player 3
                assertEquals(60.0, y, 0.1);
            } else if (i == 3) {
                assertEquals(20.0, x, 0.1); // Position for player 4
                assertEquals(40.0, y, 0.1);
            }
        }
    }
}
