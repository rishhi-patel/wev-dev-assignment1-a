package com.example.assignment1bscaffold;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class UnitTests {

    @Test
    void rotateLeftTest() {
        String[] textArray = { "a", "b", "c", "d", "e" };
        String[] expected = { "b", "c", "d", "e", "a" };
        String[] actual = Assignment1aAssignment.rotateLeftStrings(textArray, 1);
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
        String[] actual = Assignment1aAssignment.rotateLeftStrings(textArray, 0);
        assert (actual.length == expected);
    }

    @Test
    void pageBreakTest() {
        String[] textArray = { "a", "b", "c", "d", "e" };
        String[] expected1 = { "a", "b", "*page break*", "c", "d", "*page break*", "e" };
        String[] expected2 = { "a", "b", "c", "d", "e", "*page break*" };
        String[] expected3 = textArray.clone();
        String[] actual1 = Assignment1aAssignment.pageBreak(textArray, 2);
        String[] actual2 = Assignment1aAssignment.pageBreak(textArray, 5);
        String[] actual3 = Assignment1aAssignment.pageBreak(textArray, 6);
        String[] actual4 = Assignment1aAssignment.pageBreak(textArray, 0);

        assert (Arrays.equals(actual1, expected1));
        assert (Arrays.equals(actual2, expected2));
        assert (Arrays.equals(actual3, expected3));
        assert (Arrays.equals(actual4, expected3));
    }

    @Test
    void pageBreakWhenEmptyTest() {
        String[] textArray = {};
        int expected = 0;
        String[] actual = Assignment1aAssignment.pageBreak(textArray, 2);
        assert (actual.length == expected);

    }

    @Test
    void testLogicPuzzle() {
        String[][] textArray = Assignment1aAssignment.playerPositions();
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
    public void testAroundTheTable() {
        // Test with a diameter of 100 and 4 players
        int diameter = 100;
        int count = 4;
        List<String> result = Assignment1aAssignment.aroundTheTable(diameter, count);

        // Expected coordinates for players sitting around a table with radius 50 and
        // center offset by 20.
        String expectedPlayer1 = "Player 1: (70, 20)";
        String expectedPlayer2 = "Player 2: (120, 70)";
        String expectedPlayer3 = "Player 3: (70, 120)";
        String expectedPlayer4 = "Player 4: (20, 70)";

        assertEquals(4, result.size(), "Should return positions for 4 players.");
        assertEquals(expectedPlayer1, result.get(0), "Position of Player 1 should match.");
        assertEquals(expectedPlayer2, result.get(1), "Position of Player 2 should match.");
        assertEquals(expectedPlayer3, result.get(2), "Position of Player 3 should match.");
        assertEquals(expectedPlayer4, result.get(3), "Position of Player 4 should match.");
    }

}
