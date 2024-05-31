package com.example.assignment1bscaffold;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment1bScaffoldApplication {

	public static void main(String[] args) {
		SpringApplication.run(Assignment1bScaffoldApplication.class, args);

		// Test the rotateArray method
		System.out.println("Test the rotateArray method");
		String[] array = { "a", "b", "c", "d", "e", "f" };
		int places = 4;
		String[] rotatedArray = Assignment1aAssignment.rotateArray(array, places);
		System.out.println("Rotated Array: " + Arrays.toString(rotatedArray));
		System.out.println();

		// Test the insertPageBreaks method
		System.out.println("Test the insertPageBreaks method");
		String[] sentences = { "a", "b", "c", "d", "e", "f" };
		int location = 2;
		String[] arrayWithPageBreaks = Assignment1aAssignment.insertPageBreaks(sentences, location);
		System.out.println("Array with Page Breaks: " + Arrays.toString(arrayWithPageBreaks));
		System.out.println();

		// Test the solveLogicPuzzle method
		System.out.println("Test the solveLogicPuzzle method");
		String[][] logicPuzzleResult = Assignment1aAssignment.solveLogicPuzzle();
		System.out.println("Logic Puzzle Solution:");
		for (String[] pair : logicPuzzleResult) {
			System.out.println(pair[0] + " has a " + pair[1]);
		}
		System.out.println();

		// Test the locatePlayers method around the table
		System.out.println("Test the locatePlayers method");
		int diameter = 100;
		int players = 6;
		List<String> playerCoordinates = Assignment1aAssignment.aroundTheTable(diameter, players);
		System.out.println("Player Coordinates:");
		for (String pos : playerCoordinates) {
			System.out.println(pos);
		}
		System.out.println();
	}
}
