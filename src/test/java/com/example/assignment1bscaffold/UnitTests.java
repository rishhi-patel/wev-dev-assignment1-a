package com.example.assignment1bscaffold;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

public class UnitTests {

    @Test
    void rotateLeftTest() {
        String[] textArray = { "a", "b", "c", "d", "e" };
        String[] expected = { "b", "c", "d", "e", "a" };
        String[] actual = Assignment1aAssignment.rotateLeft(textArray, 1);
        assert (actual[0] == expected[0]);
        assert (actual[1] == expected[1]);
        assert (actual[2] == expected[2]);
        assert (actual[3] == expected[3]);
        assert (actual[4] == expected[4]);
    }

    @Test
    void rotateLeftTestWhenEmpty() {
        String[] textArray = {};
        int expected = 0;
        String[] actual = Assignment1aAssignment.rotateLeft(textArray, 0);
        assert (actual.length == expected);
    }

    @Test
    void pageBreakTest() {
        String[] textArray = { "a", "b", "c", "d", "e" };
        int location = 2;
        String[] expected = { "a", "b", "*page break*", "c", "d", "*page break*", "e" };
        String[] actual = Assignment1aAssignment.insertBreaks(textArray, location);
        assertArrayEquals(expected, actual);
    }

    @Test
    void pageBreakWhenEmptyTest() {
        String[] textArray = {};
        int expected = 0;
        String[] actual = Assignment1aAssignment.insertBreaks(textArray, 2);
        assert (actual.length == expected);

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
        // Testing the positioning of 4 players around a table with a diameter of 40
        // units
        List<String> positions = Assignment1aAssignment.calculatePlayerPositions(40, 4);

        // Ensure that the list contains exactly 4 position entries
        assertEquals(4, positions.size());

        // Validate the coordinates of each player position
        for (int i = 0; i < positions.size(); i++) {
            // Regex to extract the x and y coordinates from the position string
            Pattern coordinatePattern = Pattern.compile("Player \\d+: \\(([^,]+), ([^)]+)\\)");
            Matcher coordinateMatcher = coordinatePattern.matcher(positions.get(i));
            assertTrue(coordinateMatcher.find());

            // Parsing the x and y coordinates as doubles from the captured groups
            double xPos = Double.parseDouble(coordinateMatcher.group(1));
            double yPos = Double.parseDouble(coordinateMatcher.group(2));

            // Assert coordinates for each player based on expected values
            if (i == 0) {
                assertEquals(40.0, xPos, 0.1); // Tolerance of 0.1 for floating point comparisons
                assertEquals(20.0, yPos, 0.1);
            } else if (i == 1) {
                assertEquals(60.0, xPos, 0.1);
                assertEquals(40.0, yPos, 0.1);
            } else if (i == 2) {
                assertEquals(40.0, xPos, 0.1);
                assertEquals(60.0, yPos, 0.1);
            } else if (i == 3) {
                assertEquals(20.0, xPos, 0.1);
                assertEquals(40.0, yPos, 0.1);
            }
        }
    }

}
