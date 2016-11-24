package main;



public class AsciiArt {

	public static void main(String[] args) {
		
		AsciiImage image = AsciiImage.loadImage("epam.png");
		
		System.out.println(image.getWidth());
		System.out.println(image.getHeight());
		
		for(int y = 0; y < image.getHeight(); y += 6){
			for(int x = 0; x < image.getWidth(); x += 4){
				if (image.getRed(x, y) == 255){
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	

	}
	
}
