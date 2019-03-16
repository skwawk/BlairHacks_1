package blairhacks;
import java.util.Random;
import java.util.Scanner;

public class Cat {
	double CHANCE_OF_BLINK = .44;
	double CHANCE_OF_YAWN = .5;
	double CHANCE_OF_MEOW = .85;
	double CHANCE_OF_MEW = .95;
	double CHANCE_OF_NUZZLE = 1;
	
	Scanner scanner;
	Random rand;
	String name;
	static String[] nameList = {"Whiskers", "Mittens", "Oliver", "Button", "Tiger"};
	
	public Cat() {
		rand = new Random();
		scanner = new Scanner(System.in);
		name = nameList[rand.nextInt(nameList.length)];
	}
	
	public void launch() {
		System.out.println("Meow meow mew meow");
		System.out.println("Translation: Hello there! I'm " + name + " the CatBot.");
		System.out.println("You can say whatever you want to me.");
		System.out.println("If you want to quit to the main menu, just type quit or q.");
		System.out.println("Say hello: ");
		String response = scanner.nextLine();
		while (response.toLowerCase() != "q" && response.toLowerCase() != "quit") {
			respond(response);
		}
	}
	
	public void respond(String in) {
		if (in.contains(name)) {
			System.out.println("*perks ears* Mew?");
		} else {
			double randoNumero = rand.nextDouble();
			if (randoNumero < CHANCE_OF_BLINK) {
				System.out.println("*blinks slowly*");
			} else if (randoNumero < CHANCE_OF_YAWN) {
				System.out.println("*yawns*");
			} else if (randoNumero < CHANCE_OF_MEOW) {
				System.out.println("Meow...");
			} else if (randoNumero < CHANCE_OF_MEW) {
				System.out.println("Mew!");
			} else if (randoNumero < CHANCE_OF_NUZZLE){
				System.out.println("*nuzzles you*");
			}
		}
	}
	
	

}
