
package project;

import java.util.Scanner;

public class camera {

	public static void cameraStatus() {
		int x = 1;
		while (x == 1) {
			Scanner sc = new Scanner(System.in);
			System.out.println("what do you want to do with the camera :");

			String command = sc.nextLine().toLowerCase();

			if (command.matches("turn camera on") || command.matches("camera on")
					|| command.matches("let there be camera") || command.matches("on")) {
				System.out.println("camera turning  on");
				x = 2;
			}

			else if (command.matches("turn camera off") || command.matches("camera off") || command.matches("off")
					|| command.matches("turn off") || command.matches("close")) {
				System.out.println("camera turning off on");
				x = 2;
			} else if (command.matches("record") || command.matches("record video") || command.matches("video")) {
				System.out.println("Recording video");
				x = 2;
			} else if (command.matches("photo") || command.matches("take photo") || command.matches("photo mode")
					|| command.matches("selfie")) {
				System.out.println("Camrea taking pictures.");
			} else {
				System.out.println("i cannot understand the command. What do you want to do with your camera?");
				x = 1;
			}

		}
	}
}
