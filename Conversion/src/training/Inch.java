package training;

public class Inch extends BaseLength{

	
	
	private static final double INCH_IN_METERS = 0.0254;


	public Inch(double value) {
		this.value = value;
	}

	public Inch(Meter meter){
		this.value = meter.getValue() / INCH_IN_METERS;
	}
	
	@Override
	public Meter toMeter() {
		return new Meter(value * INCH_IN_METERS);
	}


	@Override
	public String toString() {
		return String.valueOf(value) + " inches";
	}

	
	
}
