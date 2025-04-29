package com.Suraj.Exception;

//Exception class for handling voting eligibility
class AgeException extends Exception {
	public AgeException(String message) {
		super(message);
	}
}

//Main class containing the main method
public class Main {
// Method to check voting eligibility
	static void checkEligibility(int age) throws AgeException {
		if (age < 18) {
			throw new AgeException("You are not eligible to vote.");
		} else {
			System.out.println("You are eligible to vote.");
		}
	}

// Main method
	public static void main(String[] args) {
		try {
			int age = 20; // Change the age to test different scenarios
			checkEligibility(age);
		} catch (AgeException e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
	}
}