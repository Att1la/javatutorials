package training;

public class FinalRoom implements Room{

	private Room nextRoom;
	
	public FinalRoom(TwoOptionsRoom nextRoom) {
		this.nextRoom = nextRoom;
	}

	@Override
	public String getWelcomeMessage() {
		return "Nyert�l gratul�lok!";
	}

	@Override
	public String getOptions() {
		return "�j j�t�k?";
	}

	@Override
	public Room nextRoom(String response) {
		return nextRoom;
	}

	
	
	
}
