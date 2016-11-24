package training;

public class RoomBuilder {

	public static Room createRooms(){
		TwoOptionsRoom room0 = new TwoOptionsRoom();
		room0.setWelcomeMessage("Beszéled a Java nyelvet?");
		room0.setOptionA("Igen");
		room0.setOptionB("Nem");
		TwoOptionsRoom room1 = new TwoOptionsRoom();
		room1.setWelcomeMessage("Egy bug áll veled szemben. Mivel támadsz?");
		room1.setOptionA("Kódolás");
		room1.setOptionB("Teszt");
		TwoOptionsRoom room2 = new TwoOptionsRoom();
		room2.setWelcomeMessage("A bug megszűnt, de egy aggresszív júzer támad hátulról!");
		room2.setOptionA("Nem vitatkozom vele");
		room2.setOptionB("Vitatkozom vele");

		FinalRoom finalRoom = new FinalRoom(room0);
		
		room0.setRoomA(room1);
		room0.setRoomB(room0);
		room1.setRoomA(room1);
		room1.setRoomB(room2);
		
		room2.setRoomA(finalRoom);
		room2.setRoomB(room0);
		
		return room0;
	}

	
}
