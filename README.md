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
				String name = "";
				if (res2.contains("ye")) { //asks if the user has met selene before
					System.out.println("Awesome!! What's your name again?");
					name = scanner.nextLine();
					System.out.println("Oh wait!!! I remember you now! I'm Selene, by the way, if you don't remember!");
					oldUser(name);
					break;
				} else if (res2.equalsIgnoreCase("no") || res2.equalsIgnoreCase("nope")) {
					System.out.print("Oh well!! I always love meeting new people!! What's your name?\n\n");
					name = scanner.nextLine();
					System.out.println("Hi " + name + "! I'm Selene.");
					newUser(name);
					break;
				}
			}	
		} else if (res1.contains("no")) {
			try {
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
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		} else {
			System.out.print("Huh, I didn't quite get that, sorry! I'm still pretty groggy from sleeping, \nI only just woke up a little while ago, could you repeat that?\n\nIs someone there or no?\n");
			continue;
		}
		
			if (res1.contains("no")) {
				try {
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
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			} else {
				System.out.print("Huh, I didn't quite get that, sorry! I'm still pretty groggy from sleeping, \nI only just woke up a little while ago, could you repeat that?\n\nIs someone there or no?\n");
				continue;
			}
		
		}
	}
	


	public void oldUser(String n) {
		System.out.print("Anyway, " + n + ", it's super nice to talk to you again!\n\n");
		System.out.println("I remember that you were super kind to me last time we talked.");
		System.out.println("I think we talked a little about each of ourselves. Can you remind me about you?");
		System.out.println("You told me there was something that you were really good at. What was it again?");
		scanner.nextLine();
		System.out.println("Oh yeah! You told me all about it because I found it super cool!");
		System.out.println("I'm so glad we're friends. I really like you, " + n + "!");
	}

	public void newUser(String n) {
	
	}


}





