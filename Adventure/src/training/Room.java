package training;

public class Room {

	String welcomeMessage;
	String optionA;
	String optionB;
	Room roomA;
	Room roomB;
	
	
	public static Room createRooms(){
		Room room0 = new Room();
		room0.welcomeMessage = "Beszéled a Java nyelvet?";
		room0.optionA = "Igen";
		room0.optionB = "Nem";
		Room room1 = new Room();
		room1.welcomeMessage = "Egy bug áll veled szemben. Mivel támadsz?";
		room1.optionA = "Kódolás";
		room1.optionB = "Teszt";
		Room room2 = new Room();
		room2.welcomeMessage = "A bug megszűnt, de egy aggresszív júzer támad hátulról!";
		room2.optionA = "Nem vitatkozom vele";
		room2.optionB = "Vitatkozom vele";
		Room room3 = new Room();
		room3.welcomeMessage = "Nyertél, gratulálunk";
		room3.optionA = "Új játék";
		
		room0.roomA = room1;
		room0.roomB = room0;
		room1.roomA = room1;
		room1.roomB = room2;
		room2.roomA = room3;
		room2.roomB = room0;
		room3.roomA = room0;
		
		return room0;
	}
	
	
}
