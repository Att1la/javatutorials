package training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	public static void main(String[] args) throws IOException {
		
		Room currentRoom = Room.createRooms();
		
		while(true){
			System.out.println(currentRoom.welcomeMessage);
			System.out.println("A: " + currentRoom.optionA);
			System.out.println("B: " + currentRoom.optionB);
			
			System.out.println("Melyiket választod? ");
			String response = readLine();
		
			if(response.startsWith("A")){
			currentRoom = currentRoom.roomA; 
			} else if (response.startsWith("B")){
				currentRoom = currentRoom.roomB;
			}
		
		}
	}
	
	
	private static String readLine() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String selection = br.readLine();
		return selection;
	}
	
	
	
}
