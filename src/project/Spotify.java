package project;

import java.util.Scanner;

public class Spotify {
	public static void SpotifyStatus() {

		int repeatAmount = 0;
		boolean spotifyon = false;
		boolean albumCheck = false;
		int initialVolume = 0;
		int x = 1;

		while (x == 1) {

			System.out.println("What would you like to do with soptify?");
			Scanner sc = new Scanner(System.in);
			String command = sc.nextLine().toLowerCase();

			if (command.matches("play music") || command.matches("sing me a song") || command.matches("play")
					|| command.matches("play a song") || command.matches("play song") || command.matches("music on")) {
				chooseAlbum();
				spotifyon = true;
				x = 2;
			}

			else if (command.matches("off") || command.matches("power off") || command.matches("turn off")
					|| command.matches("shut down") || command.matches("kill it")
					|| command.matches("stop") && spotifyon == true) {
				System.out.println("Spotify is off");
				spotifyon = false;
				x = 2;
			} else if (command.matches("off") || command.matches("power off") || command.matches("turn off")
					|| command.matches("shut down") || command.matches("kill it") && spotifyon == false) {
				System.out.println("Spotify is already off");
				spotifyon = false;
				x = 1;
			} else {
				System.out.println("I didn't get your command, what would you like to do with Spotify");
				x = 1;
				break;

			}
		}
	}

	public static void chooseAlbum() {
		int x = 1;
		while (x == 1) {

			System.out.println("What song would you like to play?");
			Scanner sc = new Scanner(System.in);
			String command = sc.nextLine().toLowerCase();

			if (command.matches("the girl is mine") || command.matches("billie jean") || command.matches("beat it")
					|| command.matches("wanna be startin somethin") || command.matches("human nature")
					|| command.matches("pretty young thing") || command.matches("thriller")) {

				System.out.println("Now playing" + command);
				x = 2;
				break;

			} else {

				System.out.println("I couldnt find that song. Please check your spelling and try again.");

			}
		}
	}

}
