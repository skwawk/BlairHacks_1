# BlairHacks_1
Blair Hacks March 2019 Project: CatBot


package blairhacks;

import java.util.Random;

import images.APImage;

public class Nyan extends Cat{
	
	public static void main(String [] args) {
		Nyan n = new Nyan(); 
		n.launch(); 
	}

	public Nyan() {
		super(); 
	}
	
	public void launch() {
		System.out.println("Hey, its ya boi Nyan with them memes");
		APImage [] imgs = new APImage [10]; 
		for(int i = 1; i<imgs.length; i++) {
			APImage im = new APImage(i+".png");
			imgs[i-1] = im; 
		}
		
		Random rand = new Random(); 
		int randInt = rand.nextInt(imgs.length); 
		imgs[randInt].draw(); 
		System.out.println("Here is your quality meme, enjoy. ");
		
	}

}
