package project;

import java.util.Scanner;

import javax.swing.JLabel;

public class lights {
	public static void lightIs0n() {

		boolean lightsOnTrue = false;
		int x = 1;
		while (x == 1) {
			System.out.println("what would you like to do with the lights");
			Scanner sc = new Scanner(System.in);
			String command = sc.nextLine().toLowerCase();

			if (command.matches("turn lights on") || command.matches("lights on")
					|| command.matches("let there be light") || command.matches("turn on")) {
				System.out.println("lights turining on");
				lightsOnTrue = false;
				x = 2;

			} else if (command.matches("turn lights off") || command.matches("lights off")
					|| command.matches("let there be darkness") || command.matches("turn off")
					|| command.matches("off")) {
				System.out.println("Lights turning off");
				x = 2;
			} else if (command.matches("dim the lights") || command.matches("dim lights")
					|| command.matches("let there be right amount light") || command.matches("dim")) {
				System.out.println("lights dimming");
				x = 2;
			} else {
				System.out.println("what would like to do with the light? Dim, turn on or turn off?");
				x = 1;
				break;
			}

		}

	}
}
