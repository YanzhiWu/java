import java.util.*;

public abstract class Vehicle {
	protected static int needSpts;
	protected VehicleSize sz;
	protected static List<ParkingSpot> sptForParking = new ArrayList<ParkingSpot>();

	public VehicleSize getSize() {
		return sz;
	}

	public int getSptsNeeded() {
		return needSpts;
	}

	public void parkSpts(ParkingSpot s) {
		sptForParking.add(s);
	}

	public abstract boolean canFitSpt(ParkingSpot spt);
}
