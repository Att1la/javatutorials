package training;

public class Mile extends BaseLength{

	private static final double MILE_IN_METER = 0.000621371192;


	public Mile(Meter meter){
		this.value = meter.getValue() * MILE_IN_METER;
	}
	
	public Mile(double value){
		this.value = value;
	}
	
	
	@Override
	public Meter toMeter() {
		return new Meter(this.value / MILE_IN_METER);
	}

	@Override
	public String toString() {
		return String.valueOf(value) + " miles";
	}
	
}
