# BlairHacks_1
Blair Hacks March 2019 Project: CatBot







package blairhacks;

import java.util.Scanner;

public class Selene extends Cat {
	private Scanner scanner;
	
	public Selene() {
		 scanner = new Scanner(System.in);
	}
	
	

public void launch() {

	System.out.print("Hello? Is someone there?\n");
	while (true) {
		String res1 = scanner.nextLine();
		if (res1.contains("ye")) { //asks if someone is there
			System.out.println("Really??? Do I know you???");
			while(true) {
				String res2 = scanner.nextLine();
				if (res2.contains("ye")) { //asks if the user has met selene before
					int rn = (int)(Math.random()*3+1);
					if (rn == 1) {
						System.out.println("Actually Though??? What's your name again?");
					} else if (rn == 2) {
						System.out.println("No way!!! What's your name again?");
					} else if (rn == 3) {
						System.out.println("Seriously?? Nice!! What's your name again?");
					} else {
						System.out.println("Awesome!! What's your name again?");
					}
				} else if (res2.equalsIgnoreCase("no") || res2.equalsIgnoreCase("nope")) {
					System.out.print("Oh well!! I always love meeting new people!! What's your name?\n\n");
					String name = scanner.nextLine();
					System.out.println("Oooooh, nice name! I'm Selene by the way!");
					newUser(name);
					break;
				}
			}
			
			String name = scanner.nextLine();
			System.out.println("Oh wait!!! I remember you now! :D I'm Selene, by the way, if you didn't remember!");
			oldUser(name);
			break;
		
			
		} else {
			System.out.print("Huh, I didn't quite get that, sorry!!! I'm still pretty groggy from sleeping, \nI only just woke up a little while ago, could you repeat that? \n\nIf you do know me, I mean\n\n");
		}
	
	
		try {
			if (res1.contains("no")) {
				System.out.println("oh");
				Thread.sleep(2000);
				System.out.println(":(");
				Thread.sleep(1000);
				System.out.println(":(((");
				Thread.sleep(1000);
				System.out.println(":((((((((");
				Thread.sleep(2000);
				System.out.println("big oof man");
				break;
			} else {
				System.out.print("Huh, I didn't quite get that, sorry! I'm still pretty groggy from sleeping, \nI only just woke up a little while ago, could you repeat that?\n\nIs someone there or no?\n");
				continue;
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}
	


public static void oldUser(String n) {
	System.out.print("Anyway, " + n + ", it's super nice to talk to you again!\n\n");
	
	
	}

public static void newUser(String n) {
	
}


public static void showMeme() throws InterruptedException {
	Scanner reader = new Scanner(System.in);
	System.out.println("Oh hey!!!! Do you wanna see this nice meme I found?\n\n");
	String response = reader.nextLine();
	if(response.contains("ye")) {
		System.out.println("Oh yeet okay, just gimme a moment to find it andddddddd...\n\n");
		Thread.sleep(2000);
		System.out.println("Aha! Found it! Alright, check it out!");
		Thread.sleep(500);
		// YOOOOOOO Here's where you put a method that will randomly generate some random meme
		System.out.println("It's so great, right???");
	} else {
		if(response.contains("no")) {
			System.out.println("Okay, okay, okay, fineeeeee... in all honesty it was probably cringey anyway lollll");
		} else {
			System.out.println("Ehhhhh... I'll take that as a \"yes\", then!\n\nYeet okay, just gimme a moment to find it andddddddd...");
			Thread.sleep(2000);
			System.out.println("Aha! Found it! Alright, check it out!");
			Thread.sleep(500);
			// YOOOOOOO Here's where you put a method that will randomly generate some random meme
			System.out.println("It's so great, right?");
		}
	}
	
}//end showMeme() wheee

public static void numGuessingGame() {
	
}
}
