package hw16IfElseCondition;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		System.out.println("Today's Weather");

		Scanner scanner = new Scanner(System.in);
		int todaysTemperature = scanner.nextInt();

		if (todaysTemperature < 32) {
			System.out.println(todaysTemperature + " Freezing");

		} else if (todaysTemperature < 55) {
			System.out.println(todaysTemperature + " Pleasant");

		} else if (todaysTemperature < 73) {
			System.out.println(todaysTemperature + " Getting Warmer");

		} else if (todaysTemperature > 101) {
			System.out.println(todaysTemperature + " Very Hot");

		} else {
			System.out.println(todaysTemperature + " Please put a valid temperature");
		}

		scanner.close();

	}
}
