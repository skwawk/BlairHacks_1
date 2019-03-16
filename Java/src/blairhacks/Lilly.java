package blairhacks;

public class Lilly extends Cat {
	
	
	public Lilly() {
		super();
		name = "Lilly";
	}
	
	public void launch() {
		System.out.println("Hello there! I'm Lilly the Positive CatBot.");
		System.out.println("I'm here to talk to you and make sure you're feeling okay.");
		System.out.println("If you want to quit to the main menu, just type quit or q.");
		System.out.println("A ");
		System.out.println("If you want to learn more of my prompts, type help or h.");
		System.out.println("Say hello: ");
		String response = scanner.nextLine();
		while (response.toLowerCase() != "q" && response.toLowerCase() != "quit") {
			respond(response);
		}
	}
	

}
