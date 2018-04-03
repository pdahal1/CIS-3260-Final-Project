package project;

import java.util.Scanner;

import javax.swing.*;

import java.awt.*;

public class test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many equipment do you like to control?");
		int numOfequipment = sc.nextInt();
		int x = 1;
		while (x == 1) {
			for (int i = 0; i < numOfequipment; i++) {
				System.out.println("What is the name of the equipment " + (i + 1) + "?");

				Scanner in = new Scanner(System.in);
				String command = in.nextLine().toLowerCase();
				{

					if (command.matches("door") || command.matches("doors")) {
						door doorobj = new door();
						doorobj.isOpen();
						x = 2;

					} else if (command.matches("lights") || command.matches("light")) {
						lights lightsobj = new lights();
						lightsobj.lightIs0n();
						x = 2;

					} else if (command.matches("Toaster") || command.matches("toaster")) {
						Toaster toasterObj = new Toaster();
						toasterObj.ToasterStatus();
						x = 2;

					} else if (command.matches("oven") || command.matches("ovens")) {
						Oven ovenObj = new Oven();
						ovenObj.OvenStatus();
						x = 2;

					} else if (command.matches("spotify")) {
						Spotify spotifyObj = new Spotify();
						spotifyObj.SpotifyStatus();
						x = 2;
					} else if (command.matches("camera")) {
						camera cameraObj = new camera();
						cameraObj.cameraStatus();

					}

					else {
						System.out.println("I cannot understand your command.");
						// i++;
						x = 1;
					}

				}

			}

		}
	}
}
