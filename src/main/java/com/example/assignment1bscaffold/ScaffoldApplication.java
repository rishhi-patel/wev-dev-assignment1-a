package com.example.assignment1bscaffold;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScaffoldApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScaffoldApplication.class, args);

		// Test rotating elements in an array
		String[] initialArray = { "a", "b", "c", "d", "e", "f" };
		int shiftAmount = 4;
		String[] rotatedElements = Assignment1aAssignment.rotateLeftStrings(initialArray, shiftAmount);
		System.out.println("\nRotated Array: " + Arrays.toString(rotatedElements));

		// Test inserting delimiters into an array
		String[] wordsArray = { "a", "b", "c", "d", "e" };
		int interval = 5;
		String[] modifiedArray = Assignment1aAssignment.pageBreak(wordsArray, interval);
		System.out.println("\nArray with pagebreaks: " + Arrays.toString(modifiedArray));

		// Test matching students with their pets
		System.out.println("\nTesting student-pet matching");
		String[][] matchedStudentPets = Assignment1aAssignment.playerPositions();
		System.out.println("Matched Student and Pets:");
		for (String[] match : matchedStudentPets) {
			System.out.println(match[0] + " owns a " + match[1]);
		}

		// Test calculating positions for players around a circular table
		System.out.println("\nTesting player position calculation");
		int tableDiameter = 100;
		int numPlayers = 6;
		List<String> playerPositions = Assignment1aAssignment.aroundTheTable(tableDiameter, numPlayers);
		System.out.println("Player Positions:");
		for (String position : playerPositions) {
			System.out.println(position);
		}
	}
}
