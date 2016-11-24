package training;

public class Foot extends BaseLength {

	
	
	private static final double FOOT_IN_METERS = 0.3048;


	public Foot(double value) {
		this.value = value;
	}

	public Foot(Meter meter){
		this.value = meter.getValue() / FOOT_IN_METERS;
	}
	
	
	@Override
	public Meter toMeter() {
		return new Meter(value * FOOT_IN_METERS);
	}


	@Override
	public String toString() {
		return String.valueOf(value) + " ft";
	}

}
