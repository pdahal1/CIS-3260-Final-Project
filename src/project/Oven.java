package project;

import java.util.Scanner;

public class Oven {
	static int temp = 60;

	public static void OvenStatus() {
		int x = 1;
		while (x == 1) {
			System.out.println("What would you like to do with your Oven?");
			Scanner sc = new Scanner(System.in);
			String command = sc.nextLine().toLowerCase();

			if (command.matches("turn Oven on") || command.matches("turn on") || command.matches("turn it on")
					|| command.matches("on") || command.matches("power on")) {
				System.out.println("Toaster is turining on");
				x = 2;

			} else if (command.matches("off") || command.matches("power off") || command.matches("turn off")
					|| command.matches("shut down") || command.matches("Oven off") || command.matches("close")) {
				System.out.println("Oven is off");
				x = 2;
			} else if (command.matches("decrease temperature") || command.matches("colder")
					|| command.matches("make it cold") || command.matches("less heat")
					|| command.matches("decrease heat")) {
				decreaseTempreature();
				x = 2;

			} else if (command.matches("increase heat") || command.matches("make it hot")
					|| command.matches("increase temperature")) {
				increaseTempreature();
				x = 2;
			} else {
				System.out.println("I didn't get your command, what would you like to do with the oven?");
				x = 1;
				break;
			}

		}
	}

	public static void decreaseTempreature() {
		System.out.println("how much do you want to decrease the temp by?");
		Scanner input = new Scanner(System.in);
		int decrease = input.nextInt();
		int decreasedTemp = temp - decrease;
		if (decreasedTemp < 60) {
			System.out.println("You cannot decrease the temperature below 60 degrees.");
		} else {
			System.out.println(" The temperature of your Oven is now " + decreasedTemp);
		}
	}

	public static void increaseTempreature() {
		System.out.println("How much do you want to increase the temp by?");
		Scanner input = new Scanner(System.in);
		int increase = input.nextInt();
		int increasedTemp = temp + increase;
		if (increasedTemp > 500) {
			System.out.println("You cannot increase the temperature, the maximum limit is 500 degrees. ");
		} else {
			System.out.println(" The temperature of your oven is now " + increasedTemp);
		}
	}

}
