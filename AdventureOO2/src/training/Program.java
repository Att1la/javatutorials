package training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	public static void main(String[] args) throws IOException {
		
		Room currentRoom = RoomBuilder.createRooms();
		
		while(true){
			System.out.println(currentRoom.getWelcomeMessage());
			System.out.println(currentRoom.getOptions());
			
			System.out.println("Melyiket választod? ");
			String response = readLine();
		
			currentRoom = currentRoom.nextRoom(response);
			

		
		}
	}
	
	
	private static String readLine() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String selection = br.readLine();
		return selection;
	}
	
	
	
}

