package blairhacks;

import java.util.Scanner;

public class Central {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to CatBot!");
		System.out.println("There are three CatBots that you can talk to.");
		System.out.println("Lilly is here to chat to help you feel positive.");
		System.out.println("Nyan is here to feed you memes.");
		System.out.println("And Olivia doesn't know that she's a bot, but she's trying her best..");
		System.out.println("You can also talk to a normal cat.");
		System.out.println("Enter L for Lilly, N for Nyan, O for Olivia, C for a normal cat, or q to quit:");
		boolean unvalidated = true;
		String response = "";
		while (unvalidated) {
			response = scanner.nextLine();
			unvalidated = false;
			switch (response.toLowerCase()) {
				case "l":
					lilly();
					break;
				case "n":
					nyan();
					break;
				case "o":
					olivia();
					break;
				case "c":
					Cat c1 = new Cat();
					c1.launch();
					break;
				case "q":
					goodbye();
					break;
				case "t":
					tmdl();
					break;
				case "lilly":
					lilly();
					break;
				case "nyan":
					nyan();
					break;
				case "olivia":
					olivia();
					break;
				case "cat":
					Cat c2 = new Cat();
					c2.launch();
					break;
				case "quit":
					goodbye();
					break;
				case "goodbye":
					goodbye();
					break;
				case "bye":
					goodbye();
					break;
				case "end":
					goodbye();
					break;
				case "tmdl":
					tmdl();
					break;
				default:
					unvalidated = true;
					System.out.println("Please enter the name or initial of one of our four CatBots.");
					System.out.println("Enter L for Lilly, N for Nyan, O for Olivia, C for a cat, or Q to quit:");
					response = scanner.nextLine();
			}
		}
	}

}
