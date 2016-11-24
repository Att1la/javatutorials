package training;

public class FinalRoom implements Room{

	private Room nextRoom;
	
	public FinalRoom(TwoOptionsRoom nextRoom) {
		this.nextRoom = nextRoom;
	}

	@Override
	public String getWelcomeMessage() {
		return "Nyertél gratulálok!";
	}

	@Override
	public String getOptions() {
		return "Új játék?";
	}

	@Override
	public Room nextRoom(String response) {
		return nextRoom;
	}

	
	
	
}
