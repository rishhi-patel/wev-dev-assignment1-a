package com.example.assignment1bscaffold;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class UnitTests {

    // @Test
    // void rotateLeftTest() {
    // String[] textArray = {"a", "b", "c", "d", "e"};
    // String[] expected = {"b", "c", "d", "e", "a"};
    // String[] actual = Assignment1bAssignment.rotateLeftStrings(textArray);
    // assert(actual[0] == expected[0]);
    // assert(actual[1] == expected[1]);
    // assert(actual[2] == expected[2]);
    // assert(actual[3] == expected[3]);
    // assert(actual[4] == expected[4]);
    // }

    // @Test
    // void rotateLeftTestWhenEmpty() {
    // String[] textArray = {};
    // int expected = 0;
    // String[] actual = Assignment1bAssignment.rotateLeftStrings(textArray);
    // assert(actual.length == expected);
    // }

    // @Test
    // void pageBreakTest() {
    // String[] textArray = {"a", "b", "c", "d", "e"};
    // String[] expected1 = {"a", "b", "*page break*", "c", "d", "*pagebreak*",
    // "e"};
    // String[] expected2 = {"a", "b", "c", "d", "e", "*page break*"};
    // String[] expected3 = textArray.clone();
    // String[] actual1 = Assignment1bAssignment.pageBreak(textArray, 2);
    // String[] actual2 = Assignment1bAssignment.pageBreak(textArray, 5);
    // String[] actual3 = Assignment1bAssignment.pageBreak(textArray, 6);
    // String[] actual4 = Assignment1bAssignment.pageBreak(textArray, 0);

    // assert(Arrays.equals(actual1, expected1));
    // assert(Arrays.equals(actual2, expected2));
    // assert(Arrays.equals(actual3, expected3));
    // assert(Arrays.equals(actual4, expected3));
    // }

    // @Test
    // void pageBreakWhenEmptyTest() {
    // String[] textArray = {};
    // int expected = 0;
    // String[] actual = Assignment1bAssignment.pageBreak(textArray, 2);
    // assert(actual.length == expected);

    // }

    // @Test
    // void testLogicPuzzle() {
    // String[][] textArray = Assignment1bAssignment.logicPuzzle();
    // for (int i = 0; i < textArray.length; i++) {
    // if (textArray[i][0] == "Bob") {
    // assert(textArray[i][1] == "dog");
    // } else if (textArray[i][0] == "Priya") {
    // assert(textArray[i][1] == "cat");
    // } else if (textArray[i][0] == "Lane") {
    // assert(textArray[i][1] == "bird");
    // } else if (textArray[i][0] == "Yien") {
    // assert(textArray[i][1] == "fish");
    // } else if (textArray[i][0] == "Jane") {
    // assert(textArray[i][1] == "hamster");
    // } else {
    // assert(false);
    // }
    // }
    // }

    // @Test
    // void tableLocationTest() {
    // Assignment1bAssignment.Point[] test =
    // Assignment1bAssignment.aroundTheTable(4, 10);

    // // N.B. This is only testing for 4 players, radius 10.
    // // You should test for other numbers of players and radii.
    // // Marks are not guaranteed just because this test passes.

    // assert(test.length == 4);
    // assertEquals(test[0].x, 30.0, 0.1);
    // assertEquals(test[0].y, 40.0, 0.1);
    // assertEquals(test[1].x, 20.0, 0.1);
    // assertEquals(test[1].y, 30.0, 0.1);
    // assertEquals(test[2].x, 30.0, 0.1);
    // assertEquals(test[2].y, 20.0, 0.1);
    // assertEquals(test[3].x, 40.0, 0.1);
    // assertEquals(test[3].y, 30.0, 0.1);

    // }

}
